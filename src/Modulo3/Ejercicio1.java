package Modulo3;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);
            String nombre;
            String apellido;
            int edad;

            System.out.println("\nEscribe tu nombre");
            nombre = entrada.next();
            System.out.println("\nEscribe tu apellido");
            apellido = entrada.next();
            System.out.println("\nQue edad tienes?");
            edad = entrada.nextInt();

            System.out.println("\nTe llamas " + nombre + " " + apellido + " y tienes " + edad + " años.\n");

    }

}

