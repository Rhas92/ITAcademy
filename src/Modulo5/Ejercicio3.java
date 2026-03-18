package Modulo5;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double numRandom = Math.ceil((Math.random() * 10));

        System.out.println("\nAdivine un numero del 1 al 10.");
        double numUsuario = sc.nextDouble();
        while (numRandom != numUsuario){
            System.out.println("\nLo siento no es " + numUsuario + " Adivine un numero del 1 al 10.");
            numUsuario = sc.nextDouble();
        }
        if (numRandom == numUsuario){
            System.out.println("\nEnhorabuena, el número era: " + numRandom);
        }
    }
}
