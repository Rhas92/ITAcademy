package Personal;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class RecolorHueShift {

    /*
      Usage:
        java RecolorHueShift <input> <sourceHueDeg> <targetHueDeg> [toleranceDeg] [minSat] [minBright]

      Examples:
        java RecolorHueShift image1.jpeg 120 240
        java RecolorHueShift image1.jpeg 0 180 50 0.10 0.05
    */

    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println(
                    "Usage: java RecolorHueShift <input> <sourceHueDeg> <targetHueDeg> " +
                            "[toleranceDeg] [minSat] [minBright]"
            );
            return;
        }

        File inputFile = new File(args[0]);

        float sourceHue = hueDegTo01(parseFloatOrDie(args[1], "sourceHueDeg"));
        float targetHue = hueDegTo01(parseFloatOrDie(args[2], "targetHueDeg"));

        float toleranceDeg = (args.length >= 4) ? parseFloatOrDie(args[3], "toleranceDeg") : 70f;
        float minSat       = (args.length >= 5) ? parseFloatOrDie(args[4], "minSat") : 0.10f;
        float minBright    = (args.length >= 6) ? parseFloatOrDie(args[5], "minBright") : 0.05f;

        float tolerance = clamp(toleranceDeg, 0f, 180f) / 360f;
        minSat = clamp(minSat, 0f, 1f);
        minBright = clamp(minBright, 0f, 1f);

        BufferedImage img = readImageOrThrow(inputFile);

        BufferedImage out = recolorHueRange(img, sourceHue, targetHue, tolerance, minSat, minBright);

        File outputFile = buildOutputFile(inputFile, args[1], args[2]);
        writePngOrThrow(out, outputFile);

        System.out.println("Wrote: " + outputFile.getAbsolutePath());
    }

    private static BufferedImage recolorHueRange(
            BufferedImage img,
            float sourceHueCenter,
            float targetHue,
            float hueTolerance,
            float minSaturation,
            float minBrightness
    ) {
        BufferedImage out = new BufferedImage(
                img.getWidth(), img.getHeight(), BufferedImage.TYPE_INT_ARGB
        );

        for (int y = 0; y < img.getHeight(); y++) {
            for (int x = 0; x < img.getWidth(); x++) {
                int argb = img.getRGB(x, y);
                out.setRGB(x, y, recolorPixel(argb, sourceHueCenter, targetHue,
                        hueTolerance, minSaturation, minBrightness));
            }
        }
        return out;
    }

    private static int recolorPixel(
            int argb,
            float sourceHueCenter,
            float targetHue,
            float hueTolerance,
            float minSaturation,
            float minBrightness
    ) {
        int a = (argb >>> 24) & 0xFF;
        if (a == 0)
            return argb;

        int r = (argb >>> 16) & 0xFF;
        int g = (argb >>> 8)  & 0xFF;
        int b = (argb)        & 0xFF;

        float[] hsb = rgbToHsb(r, g, b);
        float h = hsb[0], s = hsb[1], v = hsb[2];

        boolean hueMatches = circularHueDistance(h, sourceHueCenter) <= hueTolerance;
        boolean vividEnough = s >= minSaturation && v >= minBrightness;

        if (!hueMatches || !vividEnough)
            return argb;

        int rgb = hsbToRgb(targetHue, s, v);
        int nr = (rgb >>> 16) & 0xFF;
        int ng = (rgb >>> 8)  & 0xFF;
        int nb = (rgb)        & 0xFF;

        return (a << 24) | (nr << 16) | (ng << 8) | nb;
    }

    // ---------- IO helpers ----------

    private static BufferedImage readImageOrThrow(File inputFile) {
        try {
            BufferedImage img = ImageIO.read(inputFile);
            if (img == null)
                throw new IllegalArgumentException("Could not read image: " + inputFile);
            return img;
        } catch (IOException e) {
            throw new RuntimeException("Failed to read image: " + inputFile, e);
        }
    }

    private static void writePngOrThrow(BufferedImage img, File outputFile) {
        try {
            ImageIO.write(img, "png", outputFile);
        } catch (IOException e) {
            throw new RuntimeException("Failed to write image: " + outputFile, e);
        }
    }

    private static File buildOutputFile(File inputFile, String srcDeg, String dstDeg) {
        String name = inputFile.getName();
        int dot = name.lastIndexOf('.');
        String base = (dot >= 0) ? name.substring(0, dot) : name;
        return new File(inputFile.getParent(), base + "(src" + srcDeg + "_to_" + dstDeg + ").png");
    }

    // ---------- Parsing / math ----------

    private static float parseFloatOrDie(String s, String name) {
        try {
            return Float.parseFloat(s);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Invalid " + name + ": " + s);
        }
    }

    private static float hueDegTo01(float deg) {
        return clamp(deg, 0f, 360f) / 360f;
    }

    private static float clamp(float v, float lo, float hi) {
        return Math.max(lo, Math.min(hi, v));
    }

    private static float circularHueDistance(float h1, float h2) {
        float d = Math.abs(h1 - h2);
        return Math.min(d, 1f - d);
    }

    // ---------- Color conversion ----------

    private static float[] rgbToHsb(int r, int g, int b) {
        float rf = r / 255f, gf = g / 255f, bf = b / 255f;
        float max = Math.max(rf, Math.max(gf, bf));
        float min = Math.min(rf, Math.min(gf, bf));
        float delta = max - min;

        float h;
        if (delta == 0)
            h = 0;
        else if (max == rf)
            h = (gf - bf) / delta;
        else if (max == gf)
            h = ((bf - rf) / delta) + 2f;
        else
            h = ((rf - gf) / delta) + 4f;

        h /= 6f;
        if (h < 0)
            h += 1f;

        float s = (max == 0) ? 0 : (delta / max);
        float v = max;

        return new float[]{h, s, v};
    }

    private static int hsbToRgb(float h, float s, float v) {
        float c = v * s;
        float hh = (h * 6f);
        float x = c * (1f - Math.abs((hh % 2f) - 1f));
        float m = v - c;

        float rf, gf, bf;
        if (0 <= hh && hh < 1) { rf = c; gf = x; bf = 0; }
        else if (1 <= hh && hh < 2) { rf = x; gf = c; bf = 0; }
        else if (2 <= hh && hh < 3) { rf = 0; gf = c; bf = x; }
        else if (3 <= hh && hh < 4) { rf = 0; gf = x; bf = c; }
        else if (4 <= hh && hh < 5) { rf = x; gf = 0; bf = c; }
        else { rf = c; gf = 0; bf = x; }

        int r = (int) ((rf + m) * 255f + 0.5f);
        int g = (int) ((gf + m) * 255f + 0.5f);
        int b = (int) ((bf + m) * 255f + 0.5f);

        r = Math.max(0, Math.min(255, r));
        g = Math.max(0, Math.min(255, g));
        b = Math.max(0, Math.min(255, b));

        return (r << 16) | (g << 8) | b;
    }
}