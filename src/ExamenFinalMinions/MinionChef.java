package ExamenFinalMinions;

public class MinionChef extends Minion {

    private int recipesCompleted;
    private int kitchenCleanlinessLevel;

    public MinionChef(String name,
                      String predominantColor,
                      int enthusiasmLevel,
                      int recipesCompleted,
                      int levelCleaning) {

        super(name, predominantColor, enthusiasmLevel);
        /*verifyMinionChef(completedRecipes, kitchenCleanlinessLevel);*/
        this.recipesCompleted = recipesCompleted;
        this.kitchenCleanlinessLevel = levelCleaning;
    }

    @Override
    public int calculatePerformanceLevel() {
        // entusiasmoBase + (recetas × 4) + limpieza
        return getEnthusiasmLevelBase() + (recipesCompleted * 4) + kitchenCleanlinessLevel;
    }

    //validations of methods

    private static void checkRecipesCompleted(int recipesCompleted) {
        if (recipesCompleted < 0) {
            // it is an int, so we cannot use isBlank, we should check if it is negative
            throw new IllegalArgumentException("Recipes cannot be negative");
        }
    }

    private static void checkKitchenCleanlinessLevel(int kitchenCleanlinessLevel) {

        if (kitchenCleanlinessLevel < 0 || kitchenCleanlinessLevel > 10) {
            throw new IllegalArgumentException("Kitchen Cleanliness Level cannot be negative or over 10");
        }
    }

    public int getRecipesCompleted() {
        return recipesCompleted;
    }

    public int getKitchenCleanlinessLevel() {
        return kitchenCleanlinessLevel;
    }

    @Override
    public String toString() {
        return "MinionChef{" +
                "recipesCompleted=" + recipesCompleted +
                ", kitchenCleanlinessLevel=" + kitchenCleanlinessLevel +
                "} " + super.toString();
    }
}
