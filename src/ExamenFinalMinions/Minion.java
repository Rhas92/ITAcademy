package ExamenFinalMinions;

import java.util.Objects;

public abstract class Minion {

    private String name;
    private String predominantColor;
    private int enthusiasmLevelBase;

    public Minion(String name, String predominantColor, int enthusiasmLevelBase) {
        checkName(name);
        this.name = name;
        this.predominantColor = predominantColor;
        this.enthusiasmLevelBase = enthusiasmLevelBase;
    }

    public String getName() {
        return name;
    }

    public String getPredominantColor() {
        return predominantColor;
    }

    public int getEnthusiasmLevelBase() {
        return enthusiasmLevelBase;
    }

    public abstract int calculatePerformanceLevel();

    /****************** VALIDATIONS ******************/
    private static void checkName(String name) {
        if (name.isBlank()) {
            throw new IllegalArgumentException("Name should be filled");
        }
    }

    private static void checkPredominantColor(String predominantColor) {
        if (predominantColor.isBlank()) {
            throw new IllegalArgumentException("Predominant color should be filled");
        }
    }

    private static void checkEnthusiamLevel(int enthusiasmLevel) {
        if (enthusiasmLevel < 0 || enthusiasmLevel > 100) {
            throw new IllegalArgumentException("Enthusiasm level must be between 0 and 100");
        }
    }

    @Override
    public String toString() {
        return "Minion{" +
                "name='" + name + '\'' +
                ", predominantColor='" + predominantColor + '\'' +
                ", enthusiasmLevelBase=" + enthusiasmLevelBase +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || this.getClass() != o.getClass()) return false;
        Minion minion = (Minion) o;
        return Objects.equals(this.name, minion.name);
    }
}


