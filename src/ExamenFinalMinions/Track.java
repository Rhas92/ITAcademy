package ExamenFinalMinions;

public class Track {
    private final String title;
    private final int durationInSeconds;

    public Track(String title, int durationInSeconds) {
        /// validation
        this.title = title;
        this.durationInSeconds = durationInSeconds;
    }

    public String getTitle() {
        return title;
    }

    public int getDurationInSeconds() {
        return durationInSeconds;
    }

    @Override
    public String toString() {
        return "Track{" +
                "title='" + title + '\'' +
                ", durationInSeconds=" + durationInSeconds +
                '}';
    }
}
