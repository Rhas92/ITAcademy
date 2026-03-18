package Modulo6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * Programa que calcula la media de edades de un grupo de personas.
 * El usuario introduce el número de personas y sus edades, y el programa muestra la media.
 */
public class Ejercicio2 {
    /**
     * Metodo principal que ejecuta el programa.
     * Solicita el número de personas, calcula la media de edades y muestra el resultado.
     *
     * @param args argumentos de la línea de comandos (no se utilizan)
     * @throws IllegalArgumentException si el numero de personas es 0 o negativo.
     */
    public static void main (String[] args) {
        List<Integer> ageList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("\nIntroduzca el número de personas.");
        int personas = sc.nextInt();
        if (personas <= 0)
            throw new IllegalArgumentException("no puedes elegir menos de una persona");
        double media = promedio(ageList, sc, personas);
        System.out.println("\nLa media de las edades introducidas es: " + media);
        sc.close();
    }
    /**
     * Solicita las edades de cada persona, las almacena en la lista y calcula la media.
     * Las edades deben estar entre 0 y 120 años, de lo contrario se lanza una excepción.
     *
     * @param ageList lista donde se almacenarán las edades introducidas
     * @param sc      Scanner para leer la entrada del usuario
     * @param personas número de personas cuyas edades se van a introducir
     * @return la media de todas las edades introducidas
     * @throws IllegalArgumentException si una edad está fuera del rango 0-120
     */
    static double promedio(List<Integer> ageList, Scanner sc, int personas) {
        int i = personas;
        int numPersona = 0;
        while (i != 0){
            i--;
            numPersona++;
            System.out.println("\nIntroduzca la edad de la persona " + numPersona);
            int edad = sc.nextInt();
            if (edad >= 0 && edad <= 120) {
                ageList.add(edad);
            }
            else
                throw new IllegalArgumentException("La edad debe estar comprendida entre 0 y 120 años.");
        }
        int suma = 0;
        for (int num : ageList) {
            suma += num;
        }
        return((double) suma / personas);
    }
}
