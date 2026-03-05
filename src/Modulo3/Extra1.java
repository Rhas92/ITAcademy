package Modulo3;

import java.util.Scanner;

public class Extra1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num1 = 0;
        int multi = 0;
        int triple = 0;

        System.out.println("\nindica el numero que quieras utilizar: \n");
        num1 = entrada.nextInt();
        multi = (num1 * 2);
        triple = (num1 * 3);
        System.out.println("\nel doble de " + num1 + " es: " + multi);
        System.out.println("\nel triple de " + num1 + " es: " + triple);
    }
}
