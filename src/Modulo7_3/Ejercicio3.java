package Modulo7_3;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        String userInput = userInput(sc);
        String reversed = reverseString(userInput);
        palindromeCheck(userInput, reversed);
    }
    public static String userInput(Scanner sc) {
        System.out.println("\nPlease input the string you wish to reverse: ");
        System.out.println();
        return (sc.nextLine());
    }
    public static String reverseString(String userInput) {
        String reversed = "";
        for (int i = (userInput.length() - 1); i >= 0; i--) {
            reversed += (userInput.charAt(i));
        }
        return reversed;
    }
    public static void palindromeCheck(String userInput, String reversed) {
        if (userInput.equals(reversed)) {
            System.out.println("\nThe word " + userInput + " is a palindrome");
        }
        else
            System.out.println("\nThe word " + userInput + " is not a palindrome");
    }
}
