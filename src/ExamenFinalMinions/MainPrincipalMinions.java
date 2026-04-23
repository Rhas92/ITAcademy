package ExamenFinalMinions;

import java.util.List;
import java.util.Objects;

public class MainPrincipalMinions {
    private static final String RESET = "\u001B[0m";
    private static final String GREEN = "\u001B[32m";
    private static final String RED = "\u001B[31m";
    private static final String CYAN = "\u001B[36m";
    private static final String BOLD = "\u001B[1m";
    private static final String SEPARATOR = "------------------------------------------------------------";

    private static int totalTests = 0;
    private static int passedTests = 0;

    public static void main(String[] args) {

        Track track1 = new Track("Banana Beat", 120);
        Track track2 = new Track("Gru Groove", 150);
        Track track3 = new Track("Minion Melody", 90);

        MinionConstructor minionConstructor = new MinionConstructor("Bob", "Yellow", 35, 6);
        MinionChef minionChef = new MinionChef("Kevin", "Yellow", 30, 5, 8);
        MinionCantante minionCantante = new MinionCantante(
                "Stuart",
                "Yellow",
                20,
                List.of(track1, track2, track3)
        );

        MissionCenter missionCenter = new MissionCenter("Centro Gru", "Barcelona");
        missionCenter.registerMinion(minionConstructor);
        missionCenter.registerMinion(minionChef);
        missionCenter.registerMinion(minionCantante);

        int expectedConstructorPerformance = 59;
        int expectedChefPerformance = 58;
        int expectedSingerPerformance = 56;
        double expectedAveragePerformance = (59 + 58 + 56) / 3.0;
        String expectedHighestPerformanceName = "Bob";

        System.out.println(CYAN + BOLD + "=== Happy Path Validation: ExamenFinalMinions ===" + RESET);
        System.out.println(SEPARATOR);

        compare("Track 1 - title", "Banana Beat", track1.getTitle());
        compare("Track 1 - duration", 120, track1.getDurationInSeconds());

        compare("MinionConstructor - performance", expectedConstructorPerformance, minionConstructor.calculatePerformanceLevel());

        compare("MinionChef - performance", expectedChefPerformance, minionChef.calculatePerformanceLevel());

        compare("MinionSinger - performance", expectedSingerPerformance, minionCantante.calculatePerformanceLevel());

        compare("MissionCenter - registered minions", 3, missionCenter.getMinions().size());

        compareDouble("MissionCenter - average performance", expectedAveragePerformance, missionCenter.calculateAveragePerformance());

        compare("MissionCenter - top minion", expectedHighestPerformanceName, missionCenter.getMinionWithHighestPerformance().getName());
        printSummary();
    }

    private static void compare(String testName, Object expected, Object actual) {
        totalTests++;
        boolean passed = Objects.equals(expected, actual);
        if (passed) {
            passedTests++;
        }
        printResult(testName, expected, actual, passed);
    }

    private static void compareDouble(String testName, double expected, double actual) {
        double tolerance = 0.0001;
        totalTests++;
        boolean passed = Math.abs(expected - actual) <= tolerance;
        if (passed) {
            passedTests++;
        }
        printResult(testName, expected, actual, passed);
    }

    private static void printResult(String testName, Object expected, Object actual, boolean passed) {
        String statusLabel = passed ? "PASSED" : "NOT PASSED";
        String statusColor = passed ? GREEN : RED;
        System.out.println(statusColor + "[" + statusLabel + "] " + RESET + testName);
        System.out.println("  expected: " + expected);
        System.out.println("  actual:   " + actual);
        System.out.println(SEPARATOR);
    }

    private static void printSummary() {
        int notPassed = totalTests - passedTests;
        String passedColor = passedTests > 0 ? GREEN : RED;
        String notPassedColor = notPassed == 0 ? GREEN : RED;
        System.out.println(BOLD + "Final summary" + RESET);
        System.out.println(passedColor + "PASSED: " + passedTests + RESET);
        System.out.println(notPassedColor + "NOT PASSED: " + notPassed + RESET);
        System.out.println("Total: " + totalTests);
    }
}
