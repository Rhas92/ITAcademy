package Modulo7_1;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        tablaMulti(sc);

    }
    public static void tablaMulti(Scanner sc) {
        int num1;
        int varInt;

        System.out.println("indica el numero entero que quieras utilizar (1 - 10): ");
        num1 = sc.nextInt();

        varInt = (num1 < 10) ? num1 : num1/10;
        System.out.println("Tabla de multiplicar de: " + varInt);

        for (int i = 1; i <= 10; i++) {
            System.out.println(varInt + " x " + i + " = " + (varInt * i));
        }
    }
}
