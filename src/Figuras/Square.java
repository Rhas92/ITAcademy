package poo12enero2026.figuras;

public class Square extends Shape {

    private final double side;

    public Square(double side, String color) {
        super(color);
        if (side <= 0) {
            throw new IllegalArgumentException("Error: The side must be a positive number.");
        }
        this.side = side;
    }

    public double getSide() {
        return this.side;
    }

    @Override
    public double calculatePerimeter() {
        return side * 4;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                "} " + super.toString();
    }
}
