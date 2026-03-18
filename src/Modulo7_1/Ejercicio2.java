package Modulo7_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * Programa que calcula la media de las notas de una clase
 * y muestra un mensaje según el resultado obtenido.
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> notas = new ArrayList<>();
        introducirNotas(notas, sc);
        System.out.println(mediaNotas(notas));
        sc.close();
    }
    /**
     * Solicita al usuario la cantidad de notas a introducir y las almacena en la lista.
     *
     * @param notas lista donde se guardarán las notas introducidas
     * @param sc    Scanner para leer la entrada del usuario
     * @throws IllegalArgumentException si la cantidad de notas es 0 o negativa
     */
    static void introducirNotas(List<Integer> notas, Scanner sc) {
        System.out.println("\nIndique cuantas notas va a introducir: ");
        int cantidadNotas = sc.nextInt();
        if (cantidadNotas <= 0)
            throw new IllegalArgumentException("No pueden haber 0 o menos notas.");
        int i = 0;
        while (cantidadNotas > 0) {
            i++;
            System.out.println("\nIndique la nota numero " + i);
            int nota = sc.nextInt();
            notas.add(nota);
            cantidadNotas--;
        }
    }
    /**
     * Calcula la media de las notas y devuelve un mensaje según el resultado.
     *
     * @param notas lista con las notas introducidas por el usuario
     * @return mensaje con la media formateada y una valoración del rendimiento de la clase
     */
    static String mediaNotas(List<Integer> notas) {
        int suma = 0;
        for (int num : notas) {
            suma += num;
        }
        double media = (double) suma / notas.size();
        String mediaFormateada = String.format("%.2f", media);
        if (media < 5)
            return ("\nTu media es: " + mediaFormateada + " La nota media de la clase está suspensa. Los alumnos deberían preguntar sus dudas y trabajar más.");
        else if (media < 7)
            return ("\nTu media es: " + mediaFormateada + " La nota media de la clase es buena, pero los alumnos deberían mejorar el trabajo personal.");
        else
            return ("\nTu media es: " + mediaFormateada + " ¡Enhorabuena! La nota media de la clase se corresponde con el esfuerzo realizado.");
    }
}
