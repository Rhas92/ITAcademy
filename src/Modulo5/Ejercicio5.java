package Modulo5;

import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int i = 0;

        while (i < 5) {
            System.out.println("\nIndique su edad:");
            int edad = entrada.nextInt();
            System.out.println("\nEstá usted en Paro? (y/n)");
            boolean enParo = entrada.next().equalsIgnoreCase("y");
            System.out.println("\nPosee titulo universitario? (y/n)");
            boolean titulo = entrada.next().equalsIgnoreCase("y");
            boolean beca = (edad >= 18 && titulo) || enParo;
            if (beca) {
                System.out.println("\n Beca concedida.");
                i++;
            }
            else
                System.out.println("\n No cumple los requisitos para la beca");
        }
        entrada.close();
    }
}
