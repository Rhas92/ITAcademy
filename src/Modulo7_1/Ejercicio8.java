package Modulo7_1;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double userInput = userInput(sc);
        System.out.println("\n" + userInput + " °C in fahrenheit is " + conversion(userInput) + " °F");
    }
    public static double userInput(Scanner sc) {
        System.out.println("\nPlease input the temperature in Celcius °C");
        return (sc.nextDouble());
    }
    public static double conversion(double userInput) {
        return ((userInput * 9 / 5) + 32);
    }
}

