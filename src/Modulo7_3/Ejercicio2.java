package Modulo7_3;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        String userInput = userInput(sc);
        reverseString(userInput);
    }
    public static String userInput(Scanner sc) {
        System.out.println("\nPlease input the string you wish to reverse: ");
        System.out.println();
        return (sc.nextLine());
    }
    public static void reverseString(String userInput) {
        StringBuilder reversed = new StringBuilder();
        for (int i = (userInput.length() - 1); i >= 0; i--) {
            reversed.append(userInput.charAt(i));
        }
        System.out.println("\nThe reversed string is: " + reversed);
    }
}
