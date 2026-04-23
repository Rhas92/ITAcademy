package EventManagementSystem;

public class InPersonEvent extends Event {
    private int capacity;
    private String format;

    public InPersonEvent(String name, String category, int baseRating, int capacity, String format) {
        super(name, category, baseRating);
        verifyInPersonEvent(capacity, format);
        this.capacity = capacity;
        this.format = format;
    }

    private void verifyInPersonEvent(int capacity, String format) {
        verifyCapacity(capacity);
        verifyFormat(format);
    }
    private void verifyCapacity(int capacity) {
        if (capacity <= 0)
            throw new IllegalArgumentException("The capacity must be superior to 0.");
    }
    private void verifyFormat(String format) {
        if (!format.equals("Conference") && !format.equals("Workshop"))
            throw new IllegalArgumentException("The format must be either Conference or Workshop.");
    }

    public int getCapacity() {
        return capacity;
    }

    public String getFormat() {
        return format;
    }
    @Override
    public int calculateTotalScore() {
        int total = 0;
        if (capacity < 50)
            total += 5;
        else
            total += 15;
        if (format.equals("Conference"))
            total += 5;
        else
            total += 10;
        return total;
    }
    @Override
    public String toString() {
        return "In Person Event " +
                "capacity: " + capacity +
                ", format: " + format;
    }
}
