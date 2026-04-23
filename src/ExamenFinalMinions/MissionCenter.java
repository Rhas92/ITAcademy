package ExamenFinalMinions;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static java.util.Comparator.comparing;

public class MissionCenter {
    private static final int MIN_PERFORMANCE_THRESHOLD = 50;
    private String name;
    private String city;
    private List<Minion> minions;

    public MissionCenter(String name, String city) {
        //validations
        this.name = name;
        this.city = city;
        this.minions = new ArrayList<>();
    }
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
                throw new IllegalArgumentException("There is already a Minion with that name.");
            }
        }
        if (minion.calculatePerformanceLevel() < MIN_PERFORMANCE_THRESHOLD) {
            throw new IllegalArgumentException("The minion is too weak for our mission center.");
        }
        minions.add(minion);
    }

    public double calculateAveragePerformance() {
        int total = 0;
        for (Minion minion : minions)
            total = total + minion.calculatePerformanceLevel();
        return (double) total / minions.size();
    }

    public Minion getMinionWithHighestPerformance() {

        Minion highPerformer = minions.getFirst();
        for (Minion minion : minions) {
            if (minion.calculatePerformanceLevel() > highPerformer.calculatePerformanceLevel()) {
                highPerformer = minion;
            }
        }

//        return minions.stream().max(comparing(Minion::calculatePerformanceLevel))
//                .orElseThrow(() -> new IllegalStateException("No minions registered"));

        return highPerformer;
    }


}
