package MinionsMisionCenter;

import EventManagementSystem.Event;
import EventManagementSystem.OnlineEvent;
import EventManagementSystem.Speaker;
import PlataformaFormacion.Curso;
import PlataformaFormacion.CursoOnline;
import PlataformaFormacion.Modulo;

import java.util.ArrayList;
import java.util.List;

public class MissionCenter {
    private String name;
    private String city;
    private List<Minion> minions;

    public MissionCenter(String name, String city) {
        // verifyMissionCenter(name,city);
        this.name = name;
        this.city = city;
        this.minions = new ArrayList<>();
    }
    /*private void verifyMissionCenter(String name, String city) {
        verify
    }*/

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public List<Minion> getMinions() {
        return List.copyOf(minions);
    }

    public void registerMinion(Minion minion) {
        for (Minion m : minions) {
            if (m.getName().equals(minion.getName())) {
                throw new IllegalArgumentException("There is already a minion with that name");
            }
        }
        minions.add(minion);
    }
    public int calculateTotalPerformance() {
        int total = 0;
        for (Minion minion : minions)
            total += minion.calculatePerformanceLevel();
        return total;
    }
    public String showAllMinions() {
        StringBuilder sb = new StringBuilder();
        for (Minion minion : minions) {
            sb.append(minion.getName()).append("\n");
        }
        return sb.toString();
    }
    public Minion getHighPerformingMinion() {
        Minion highPerformer = minions.getFirst();
        for (Minion minion : minions) {
            if (minion.calculatePerformanceLevel() > highPerformer.calculatePerformanceLevel())
                highPerformer = minion;
        }
        return highPerformer;
    }

    public int calculatePerformanceByType(String type) {
        int total = 0;
        for (Minion minion : minions)
            if (minion.getClass().getSimpleName().equals(type)) {
                total += minion.calculatePerformanceLevel();
            }
        return total;
    }
    public String showSingerTracks() {
        StringBuilder sb = new StringBuilder();
        for (Minion minion : minions) {
            if (minion instanceof MinionSinger minionSinger) {
                sb.append(minionSinger.getName()).append("\n");
                for (Track track : minionSinger.getTrackList()) {
                    sb.append(track.getTitle()).append(" ").append(track.getDurationInSeconds()).append("\n");
                }
            }
        }
        return sb.toString();
    }
    @Override
    public String toString() {
        return "MissionCenter{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", minions=" + minions +
                '}';
    }
}
