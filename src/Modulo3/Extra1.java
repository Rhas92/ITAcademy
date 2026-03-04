package Modulo3;

import java.util.Scanner;

public class Extra1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num1 = 0;
        int multi = 0;
        int triple = 0;

        System.out.println("indica el numero que quieras utilizar: ");
        num1 = entrada.nextInt();
        multi = (num1 * 2);
        triple = (num1 * 3);
        System.out.println("el doble de " + num1 + " es: " + multi);
        System.out.println("el triple es: " + triple);
    }
}
