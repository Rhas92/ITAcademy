package Modulo7_2;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ep(sc);
        sc.close();
    }
    public static Integer inputNumber(Scanner sc) {
        System.out.println("\nPor favor introduzca el numero que desea verificar:");
        return (sc.nextInt());
    }
    public static void ep(Scanner sc) {
        boolean prime = false;
        while (!prime) {
            int num = inputNumber(sc);
            if (num <= 1) {
                System.out.println("\nDividiendo " + num + " no es primo.");
                return;
            }
            else {
                int i = 2;
                while (i < num) {
                    if (num % i == 0) {
                        System.out.println("\nEl número " + num + " es divisible entre " + i + ", por lo tanto NO es primo.");
                        break;
                    }
                    i++;
                }
                if (i == num) {
                    System.out.println("\nEl número " + num + " no es divisible entre ningún número entre 2 y " + (num - 1) + ", por lo tanto es primo.");
                    prime = true;
                }
            }
        }
    }
}
