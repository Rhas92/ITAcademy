package poo12enero2026.figuras;

public abstract class Shape {
    private String color;

    public Shape() {
        this.color = "Green";
    }

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    public abstract double calculateArea();

    public abstract double calculatePerimeter();

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                '}';
    }
}
