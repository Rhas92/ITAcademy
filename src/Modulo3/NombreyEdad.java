package Modulo3;

import java.util.Scanner;

public class NombreyEdad {

    public static void main(String[] args) {
        try (// TODO Auto-generated method stub
             Scanner entrada = new Scanner(System.in)) {
            String nom = "";
            int edad = 0;

            System.out.println("Escribe tu nombre");
            nom = entrada.next();
            System.out.println("Que edad tienes?");
            edad = entrada.nextInt();

            if (edad > 17)
            {
                System.out.println("Puedes entrar, eres mayor de edad");
            }
            else
            {
                System.out.println("No puedes entrar, eres menor de edad");
            }
        }
    }

}

