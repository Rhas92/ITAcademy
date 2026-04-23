package MinionsMisionCenter;

import java.util.List;

public class App {
    public void execute() {
        MissionCenter center = new MissionCenter("Gru HQ", "Barcelona");

        MinionBuilder m1 = new MinionBuilder("Bob", "Yellow", 40, 5);
        MinionSinger m2 = new MinionSinger("Stuart", "Yellow", 30,
                List.of(
                        new Track("Banana Rock", 120),
                        new Track("Bello Bello Pop", 90)
                )
        );
        MinionChef m3 = new MinionChef("Kevin", "Yellow", 35, 4, 8);

        center.registerMinion(m1);
        center.registerMinion(m2);
        center.registerMinion(m3);

        System.out.println("=== Mission Center Info ===");
        System.out.println(center);

        System.out.println("\n=== All Minions ===");
        System.out.println(center.showAllMinions());

        System.out.println("=== Total Performance ===");
        System.out.println(center.calculateTotalPerformance());

        System.out.println("\n=== Performance by Type ===");
        System.out.println("MinionBuilder: " + center.calculatePerformanceByType("MinionBuilder"));
        System.out.println("MinionSinger: " + center.calculatePerformanceByType("MinionSinger"));
        System.out.println("MinionChef: " + center.calculatePerformanceByType("MinionChef"));

        System.out.println("\n=== Singer Tracks ===");
        System.out.println(center.showSingerTracks());

        System.out.println("=== Highest Performing Minion ===");
        System.out.println(center.getHighPerformingMinion());
    }
}
