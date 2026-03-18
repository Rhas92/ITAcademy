package Modulo7_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio1 {
    /**
     * Metodo principal que ejecuta el programa.
     * Solicita las notas al usuario, calcula la media y muestra el resultado.
     */
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> notas = new ArrayList<>();
        introducirNotas(notas, sc);
        System.out.println(calculoNota(notas));
        sc.close();
    }
    /**
     * Solicita al usuario que introduzca 3 notas por teclado y las almacena en la lista.
     * Cada nota dispone de 2 intentos para ser válida, si no se lanza una excepción.
     *
     * @param notas lista donde se guardarán las notas introducidas
     * @param sc    Scanner para leer la entrada del usuario
     * @throws IllegalArgumentException si la nota introducida en el segundo intento sigue siendo inválida
     */
    static void introducirNotas (List<Integer> notas, Scanner sc){
        for (int i = 0; i < 3; i++) {
            System.out.println("\nIntroduzca la nota número " + (i + 1));
            int nota = sc.nextInt();
            if (nota < 0 || nota > 10) {
                System.out.println("\nLa nota número " + (i + 1) + " debe ser del 0 al 10");
                nota = sc.nextInt();
                if (nota < 0 || nota > 10)
                    throw new IllegalArgumentException("La nota debe ser entre 0 y 10");
            }
            notas.add(nota);
        }
    }
    /**
     * Calcula la media de las notas y devuelve un mensaje según el resultado.
     *
     * @param notas lista con exactamente 3 notas enteras introducidas por el usuario
     * @return mensaje indicando si el alumno ha superado, aprobado o debe recuperar
     */
    static String calculoNota(List<Integer> notas) {
        double media = (double) (notas.get(0) + notas.get(1) + notas.get(2)) / 3;
        String mediaFormateada = String.format("%.2f", media);
        if (media > 7)
            return ("\nTu media es: " + mediaFormateada + " Enhorabona! Has superat el curs! Passa ja al següent nivell!");
        else if (media < 5)
            return ("\nTu media es: " + mediaFormateada + " No has superat el curs. Has de recuperar");
        else
            return ("\nTu media es: " + mediaFormateada + " Enhorabona! Has aprovat, però hauries de continuar practicant");
    }
}

