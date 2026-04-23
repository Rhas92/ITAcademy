package ExamenFinalMinions;

public class MinionConstructor extends  Minion {

    private int toolsAmount;

    public MinionConstructor(String name, String predominantColor, int enthusiasmLevelBase, int toolsAmount) {
        super(name, predominantColor, enthusiasmLevelBase);
        this.toolsAmount = toolsAmount;
    }
    private int getToolsAmount() {
        return toolsAmount;
    }

    @Override
    public int calculatePerformanceLevel() {
        return getEnthusiasmLevelBase() + (toolsAmount * 4);
    }

    @Override
    public String toString() {
        return "MinionConstructor{" +
                "toolsAmount=" + toolsAmount +
                "} " + super.toString();
    }
}
