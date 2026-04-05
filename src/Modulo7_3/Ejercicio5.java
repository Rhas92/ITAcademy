package Modulo7_3;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String userInput = userInput(sc);
        stringCheck(userInput);
    }
    public static String userInput(Scanner sc) {
        System.out.println("\nPlease input a string: ");
        System.out.println();
        return (sc.next());
    }
    public static void stringCheck(String string) {
            int i = 0;
            while (i < (string.length() - 1) && Character.isUpperCase(string.charAt(i))) {
                if (Character.isLowerCase(string.charAt(i))) {
                    System.out.println("\nThe provided string is a mix of Uppercase and Lowercase");
                    return;
                }
                if (i == string.length() - 1) {
                    System.out.println("\nThe provided string is in all caps.");
                    return;
                }
                i++;
            }
            while (i < (string.length() - 1) && Character.isLowerCase(string.charAt(i))) {
                if (Character.isUpperCase(string.charAt(i)))
                    System.out.println("\nThe provided string is a mix of Uppercase and Lowercase");
                if (i == string.length() - 1)
                    System.out.println("\nThe provided string is in lower case.");
                i++;
            }
    }
}
