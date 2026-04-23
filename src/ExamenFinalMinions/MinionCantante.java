package ExamenFinalMinions;

import java.util.List;

public class MinionCantante extends Minion {
    private List<Track> trackList;

    public MinionCantante (String name, String predominantColor, int baseEnthusiamLevel, List<Track> trackList) {
        super(name, predominantColor, baseEnthusiamLevel);
        //validation
        this.trackList = trackList;
    }

    public List<Track> getTrackList() {
        return List.copyOf(trackList);
    }

    @Override
    public int calculatePerformanceLevel() {
        int total = 0;
        for (Track track : trackList) {
            total += track.getDurationInSeconds();
        }
        return getEnthusiasmLevelBase() + (total / 10);
    }
}
