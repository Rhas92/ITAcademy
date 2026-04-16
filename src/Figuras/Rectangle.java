package Figuras;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height, String color) {
        super(color);
        if (width <= 0) {
            throw new IllegalArgumentException("Error: The width must be a valid positive number");
        }
        if (height <= 0) {
            throw new IllegalArgumentException("Error: The height must be a valid positive number");
        }
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return this.width;
    }

    public double getHeight() {
        return this.height;
    }

    @Override
    public double calculateArea() {
        return this.width * this.height;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (this.width + this.height);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                "} " + super.toString();
    }
}
