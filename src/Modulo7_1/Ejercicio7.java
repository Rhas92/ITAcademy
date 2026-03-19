package Modulo7_1;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputNumber = inputNumber(sc);
        char inputChar = inputChar(sc);
        square(inputChar, inputNumber);
        sc.close();
    }

    public static Integer inputNumber(Scanner sc) {
        System.out.println("Please input the number that will be used as the height and length of the square.");
        return (sc.nextInt());
    }

    public static char inputChar(Scanner sc) {
        System.out.println("Please input the character that will be used to fill the square.");
        return (sc.next().charAt(0));
    }
    public static void square(char inputChar, int inputNumber) {
        int i = 0;
        while (i < inputNumber) {
            i++;
            for (int j = 0; j < inputNumber; j++) {
                System.out.print(inputChar);
            }
            System.out.print("\n");
        }
    }
}
