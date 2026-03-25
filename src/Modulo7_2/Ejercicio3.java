package Modulo7_2;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputNumber = inputNumber(sc);
        printChar(inputNumber);
        sc.close();
    }
    /**
     * Solicita al usuario que introduzca un número entero por consola.
     *
     * @param sc el Scanner usado para leer la entrada del usuario
     * @return el número entero introducido por el usuario
     */
    public static Integer inputNumber(Scanner sc) {
        System.out.println("Please input the number that will be used as the number of lines to be displayed.");
        return (sc.nextInt());
    }
    /**
     * Imprime un asterisco con tantas líneas como indique inputNumber.
     * Comenzando desde el numero superior y haciendo un bucle decreciente j--.
     * @param inputNumber el número de líneas a imprimir; debe ser mayor que 0
     */
    public static void printChar(int inputNumber) {
        char asterix = '*';
        for (int i = 1; i <= inputNumber; i++) {
            for (int j = inputNumber; i <= j; j--) {
                System.out.print(asterix);
            }
            System.out.println();
        }
    }
}