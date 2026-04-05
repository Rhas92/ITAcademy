package Modulo7_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> polygonsOptions = new ArrayList<>(Arrays.asList(
                "1 — \uD83D\uDFE5 Square", "2 — \uD83D\uDD3A Triangle",
                "3 — \uD83D\uDFE6 Rectangle","4 — \uD83D\uDD35 Circle",
                "0 — 🚪 Exit Program"
        ));

        int userInput = userSelection(sc, polygonsOptions);
        calculateArea(userInput, sc);
        sc.close();
    }
    public static Integer userSelection(Scanner sc, List<String> polygonsOptions) {
        System.out.println("\nSelect one of the following options: ");
        for (String options : polygonsOptions)
            System.out.println(options);
        int userInput = sc.nextInt();
        if (userInput < 0 || userInput > 4)
            throw new IllegalArgumentException("\nthe options are only from 0 to 4");
        return userInput;
    }
    public static void calculateArea(int userInput, Scanner sc) {
        switch (userInput){
            case 1 -> {
                double squareArea = squareArea(sc);
                System.out.println("\nThe area of the square is: " + squareArea + " cm²");
            }
            case 2 -> {
                double triangleArea = triangleArea(sc);
                System.out.println("\nThe area of the triangle is: " + triangleArea + " cm²");
            }
            case 3 -> {
                double rectangleArea = rectangleArea(sc);
                System.out.println("\nThe area of the rectangle is: " + rectangleArea + " cm²");
            }
            case 4 -> {
                double circleArea = circleArea(sc);
                System.out.println("\nThe area of the circle is: " + circleArea + " cm²");
            }
            case 0 -> {
                System.out.println("\nGoodbye.");
            }
        }
    }
    public static Double squareArea(Scanner sc) {
        System.out.println("\nYou chose Square, please input the length of one side in centimeters:");
        double side = sc.nextDouble();
        return side * side;
    }
    public static Double triangleArea(Scanner sc) {
        System.out.println("\nYou chose Triangle, please input the length of the base in centimeters:");
        double base = sc.nextDouble();
        System.out.println("\nNow input the height: ");
        double height = sc.nextDouble();
        return ((base * height) / 2);
    }
    public static Double rectangleArea(Scanner sc) {
        System.out.println("\nYou chose Rectangle, please input the length of the base in centimeters:");
        double base = sc.nextDouble();
        System.out.println("\nNow input the height in centimeters: ");
        double height = sc.nextDouble();
        return (height * base);
    }
    public static Double circleArea(Scanner sc) {
        System.out.println("\nYou chose Circle, please input the radius in centimeters");
        double radius = sc.nextDouble();
        return (Math.PI * radius * radius);
    }
}
