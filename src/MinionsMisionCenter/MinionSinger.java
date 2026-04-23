package MinionsMisionCenter;

import java.util.List;

public class MinionSinger extends Minion{
    private List<Track> trackList;

    public MinionSinger (String name, String predominantColor, int enthusiasmLevelBase, List<Track> trackList) {
        super (name, predominantColor, enthusiasmLevelBase);
        verifyMinionSinger(trackList);
        this.trackList = trackList;
    }

    public List<Track> getTrackList() {
        return trackList;
    }
    private void verifyMinionSinger(List<Track> trackList) {
        if (trackList.size() < 2)
            throw new IllegalArgumentException("The tracklist must have at least 2 tracks.");
    }

    @Override
    public int calculatePerformanceLevel() {
        int total = 0;
        for (Track track : trackList) {
            total += track.getDurationInSeconds();
        }
        return getEnthusiasmLevelBase() + total / 10;
    }

    @Override
    public String toString() {
        return "MinionSinger{" +
                "trackList=" + trackList +
                '}';
    }
}


