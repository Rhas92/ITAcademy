package Modulo4;

import java.util.Scanner;

public class Ejercicio3
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        int edad;
        boolean enParo;
        boolean titulo;
        boolean beca;

        IO.println("\nIndique su edad:");
        edad = entrada.nextInt();
        IO.println("\nEstá usted en Paro? (y/n)");
        enParo = entrada.next().equalsIgnoreCase("y");
        IO.println("\nPosee titulo universitario? (y/n)");
        titulo = entrada.next().equalsIgnoreCase("y");
        beca = (edad >= 18 && titulo) || enParo;

        if (beca)
            IO.println("\n Beca concedida.");
        else
            IO.println("\n No cumple los requisitos para la beca");
    }
}
