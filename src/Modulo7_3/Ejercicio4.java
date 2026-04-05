package Modulo7_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        String userInput = userInput(sc);
        dniCheck(userInput);
    }
    public static String userInput(Scanner sc) {
        System.out.println("\nPlease input your DNI with the letter: ");
        System.out.println();
        return (sc.next());
    }
    public static void dniCheck(String userInput) {
        List <Character> letterCheck = new ArrayList<>(Arrays.asList(
                'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D',
                'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V',
                'H', 'L', 'C', 'K', 'E'
        ));
        String dniNum = userInput.substring(0, 8);
        char dniLetter = userInput.charAt(8);
        if (Character.isLowerCase(dniLetter)) {
            dniLetter = Character.toUpperCase(dniLetter);
        }
        int num = Integer.parseInt(dniNum);
        num = num % 23;
        if (letterCheck.get(num) == dniLetter) {
            System.out.println("The letter of you DNI is correct.");
        }
        else {
            System.out.println("The letter of you DNI is not correct.");
            dniLetter = letterCheck.get(num);
            System.out.println("The correct letter is: " + dniLetter);
        }
    }
}
