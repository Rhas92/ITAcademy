package EventManagementSystem;

public class Speaker {
    private String name;
    private int relevance;

    public Speaker(String name, int relevance) {
        verifySpeaker(name, relevance);
        this.name = name;
        this.relevance = relevance;
    }
    private void verifySpeaker(String name, int relevance) {
        verifyName(name);
        verifyRelevance(relevance);
    }
    private void verifyName(String name) {
        if (name == null)
            throw new IllegalArgumentException("The name can't be null.");
        if (name.isBlank())
            throw new IllegalArgumentException("The name can't be empty.");
    }
    private void verifyRelevance(int relevance) {
        if (relevance <=0)
            throw new IllegalArgumentException("The relevance must be a positive number.");
    }

    public String getName() {
        return name;
    }

    public int getRelevance() {
        return relevance;
    }

    @Override
    public String toString() {
        return "Speaker " +
                "name: " + name + '\'' +
                ", relevance: " + relevance;
    }
}
