package Modulo4;

import java.util.Scanner;

public class Extra1 {
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);
        int dividendo;
        int divisor;
        int resto;

        System.out.println("\nEste programa requiere de dos números enteros.");
        System.out.println("\nIntroduzca un divisor entre 2 y 7:");
        divisor = entrada.nextInt();
        System.out.println("\nIntroduzca el dividendo:");
        dividendo = entrada.nextInt();

        if (divisor >= 2 && divisor <= 7) {
            System.out.println("\nEl divisor está en el rango correcto");
            resto = dividendo % divisor;
            if (resto == 0)
                System.out.println("\nEl dividendo es multiplo del divisor");
            else
                System.out.println("\nEl dividendo no es multiplo del divisor");
        }
        else
            System.out.println("\nERROR el divisor NO está en el rango correcto");

    }
}
