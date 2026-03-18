package Modulo5;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double numRandom = Math.ceil((Math.random() * 10));

        System.out.println("\nAdivine un numero del 1 al 10.");
        double numUsuario = sc.nextDouble();
        int i = 1;
        while (numRandom != numUsuario && i != 5) {
                System.out.println("\nLo siento no es " + numUsuario + " Adivine un numero del 1 al 10.");
                i++;
                numUsuario = sc.nextDouble();
                System.out.println("\nTe quedan " + (5 - i) + " intentos.");
                }
        if (numRandom == numUsuario) {
            System.out.println("\nEnhorabuena, el número era: " + numRandom);
        }
        else {
            System.out.println("\nHas perdido.");
        }
        sc.close();
    }
}