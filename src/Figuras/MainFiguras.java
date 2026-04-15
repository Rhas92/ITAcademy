package poo12enero2026.figuras;

import java.util.List;

public class MainFiguras {

    static void main() {

        List<Shape> shapes = List.of(
                new Circle(5, "Yellow"),
                new Rectangle(4, 6, "Blue"),
                new Circle(2, "Red"),
                new Triangle(5, 7, 7, "Orange"),
                new Square(4, "Green")
        );

        for (var shape : shapes) {
            IO.println("-----------------------------------");
            IO.println(shape);
            IO.println("Area: " + shape.calculateArea());
            IO.println("Perimeter: " + shape.calculatePerimeter());
        }

    }
}
