package MinionsMisionCenter;

public class MinionChef extends Minion {
    private int completedRecipes;
    private int kitchenCleanlinessLevel;

    public MinionChef(String name, String predominantColor, int enthusiasmLevelBase, int completedRecipes, int kitchenCleanlinessLevel) {
        super(name, predominantColor, enthusiasmLevelBase);
        verifyMinionChef(completedRecipes, kitchenCleanlinessLevel);
        this.completedRecipes = completedRecipes;
        this.kitchenCleanlinessLevel = kitchenCleanlinessLevel;
    }

    public int getCompletedRecipes() {
        return completedRecipes;
    }

    public int getKitchenCleanlinessLevel() {
        return kitchenCleanlinessLevel;
    }
    private void verifyMinionChef(int completedRecipes, int kitchenCleanlinessLevel) {
        verifyCompletedRecipes(completedRecipes);
        verifyKitchenCleanlinessLevel(kitchenCleanlinessLevel);
    }
    private void verifyCompletedRecipes(int completedRecipes) {
        if (completedRecipes < 0)
            throw new IllegalArgumentException("The amount of completed recipes can't be negative.");
    }
    private void verifyKitchenCleanlinessLevel(int kitchenCleanlinessLevel) {
        if (kitchenCleanlinessLevel < 0 || kitchenCleanlinessLevel > 10)
            throw new IllegalArgumentException("The kitchen cleanliness Level must be a value between 0 and 10.");
    }
    @Override
    public int calculatePerformanceLevel() {
        return (getEnthusiasmLevelBase() + (completedRecipes * 4) + kitchenCleanlinessLevel);
    }
    @Override
    public String toString() {
        return "MinionChef{" +
                "completedRecipes=" + completedRecipes +
                ", kitchenCleanlinessLevel=" + kitchenCleanlinessLevel +
                '}';
    }
}
