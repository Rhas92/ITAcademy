package Modulo3;

import java.util.Scanner;

public class Extra2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num1;
        int varInt;

        IO.println("indica el numero entero que quieras utilizar: ");
        num1 = entrada.nextInt();

        varInt = (num1 < 10) ? num1 : 1;
        IO.println("Tabla de multiplicar de: " + varInt);

        for (int i = 1; i <= 10; i++) {
            IO.println(varInt + " x " + i + " = " + (varInt * i));
        }
    }
}
