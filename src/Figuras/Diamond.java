package Figuras;

public class Diamond extends Shape {
    private double side;

    public Diamond (double side, String color) {
        super(color);
        if (side <= 0) {
            throw new IllegalArgumentException("Error: The side must be a positive number.");
        }
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public double calculateArea() {
        return (3 * Math.sqrt(3) / 2) * side * side;
    }
    @Override
    public double calculatePerimeter() {
        return 4 * side;
    }

    @Override
    public String toString() {
        return "Diamond{" +
                "side=" + side +
                '}' + super.toString();
    }
}
