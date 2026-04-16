package Figuras;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius, String color) {
        super(color);
        if (radius <= 0) {
            throw new IllegalArgumentException("Error: The radius must be a valid positive number");
        }
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * this.radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                "} " + super.toString();
    }
}
