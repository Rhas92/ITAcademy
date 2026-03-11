package Modulo4;

import java.util.Scanner;

public class Extra1 {
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("\nEste programa requiere de dos números enteros.");
        System.out.println("\nIntroduzca un divisor entre 2 y 7:");
        int divisor = entrada.nextInt();
        System.out.println("\nIntroduzca el dividendo:");
        int dividendo = entrada.nextInt();
        int resto = dividendo % divisor;

        if (divisor < 2 || divisor > 7)
            throw new IllegalArgumentException("El numero está fuera del rango");
        if (resto == 0)
            System.out.println("\nEl dividendo es multiplo del divisor");
        else
            System.out.println("\nEl dividendo no es multiplo del divisor");
    }
}
