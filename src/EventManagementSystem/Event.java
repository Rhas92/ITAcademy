package EventManagementSystem;

public abstract class Event {
    private String name;
    private String category;
    private int baseRating;

    public Event(String name, String category, int baseRating) {
        verifyEvent(name, category, baseRating);
        this.name = name;
        this.category = category;
        this.baseRating = baseRating;
    }
    private void verifyEvent(String name, String category, int baseRating) {
        verifyString(name);
        verifyString(category);
        verifyBaseRating(baseRating);
    }
    private void verifyString(String s) {
        if (s == null)
            throw new IllegalArgumentException("The name can't be null.");
        if (s.isBlank())
            throw new IllegalArgumentException("The name can't be empty.");
    }

    private void verifyBaseRating(int baseRating) {
        if (baseRating < 0 || baseRating > 100)
            throw new IllegalArgumentException("The base rating must be a value between 0 and 100.");
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public int getBaseRating() {
        return baseRating;
    }
    public abstract int calculateTotalScore();

    @Override
    public String toString() {
        return "Event " + "name: " + name + ", category: " + category +
                ", baseRating: " + baseRating;
    }
}
