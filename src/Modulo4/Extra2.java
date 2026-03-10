package Modulo4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Extra2 {
    public static void main(String[] args){
        /*
        Pide al usuario un número entre 0 y 99 y muéstralo escrito en letras.
        * Scanner + ArrayList
        * Crear Array con decenas y otro con digitos
        * Array con numeros especiales.
        */
        Scanner entrada = new Scanner(System.in);
        int num;
        int digito;
        int decena;
        ArrayList<String> digitos = new ArrayList<>(Arrays.asList(
                "cero", "uno", "dos", "tres", "cuatro", "cinco",
                "seis", "siete", "ocho", "nueve"
        ));
        ArrayList<String> decenas = new ArrayList<>(Arrays.asList(
                "veinte", "trenta", "cuarenta", "cincuenta",
                "sesenta", "setenta", "ochenta", "noventa"
        ));
        ArrayList<String> especiales = new ArrayList<>(Arrays.asList(
                "diez", "once", "doce", "trece", "catorce",
                "quince", "dieciseis", "diecisiete",
                "dieciocho", "diecinueve"
        ));

        System.out.println("\nIntroduzca un número del 0 al 99");
        num = entrada.nextInt();
        if (num < 0 || num > 100)
            System.out.println("\nEl número que has introducido está fuera del rango.");
        else if (num < 10)
            System.out.println("\nEl número " + num + " en texto es: " + digitos.get(num));
        else if (num < 20)
            // 11 - 10 = 1 posición correcta dentro del array.
            System.out.println("\nEl número " + num + " en texto es: " + especiales.get(num - 10));
        else {
            digito = num % 10; // obtiene el digito del num ej: 85 % 10 = 5
            decena = num / 10; // obtiene la decena del num ej: 85 / 10 = 8

            if (digito == 0){
                // si num == 20, 20 / 2 = 2, - 2 lleva al indice indicado en el array
                System.out.println("\nEl número " + num + " en texto es: " + decenas.get(decena - 2));
            }
            else {
                System.out.println("\nEl número " + num + " en texto es: " + decenas.get(decena - 2) + " y " + digitos.get(digito));
            }
        }
    }
}
