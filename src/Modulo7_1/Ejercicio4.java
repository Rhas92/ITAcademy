package Modulo7_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**El usuario debe introducir **dos números**.

El programa mostrará el mensaje:

        > "Uno de los dos números es negativo"

        ✔️ Solo cuando **al menos uno de los dos números sea negativo**.*/
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
        numUser(numbers, sc);
        System.out.println(numNegative(numbers));
    }
    static void numUser(List<Integer> numbers, Scanner sc) {
        System.out.println("\nEnter the first number: ");
        int num1 = sc.nextInt();
        System.out.println("\nEnter the second number: ");
        int num2 = sc.nextInt();
        numbers.add(num1);
        numbers.add(num2);
    }
    static String numNegative(List<Integer> numbers) {
        if (numbers.get(0) < 0 || numbers.get(1) < 0)
            return ("\nOne of the numbers is negative.");
        else
            return ("\nNone of the numbers are negative.");
    }
}
