package Modulo7_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Programa que comprueba si el primer número introducido
 * es múltiplo del segundo.
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> nums = new ArrayList<>();
        numeros(nums, sc);
        System.out.println(multiplo(nums));
    }
    /**
     * Solicita dos números al usuario y los almacena en la lista.
     *
     * @param nums lista donde se guardarán los dos números introducidos
     * @param sc   Scanner para leer la entrada del usuario
     */
    static void numeros(List<Integer> nums, Scanner sc) {
        System.out.println("\nIntroduzca el primer número: ");
        int num1 = sc.nextInt();
        System.out.println("\nIntroduzca el segundo número: ");
        int num2 = sc.nextInt();
        nums.add(num1);
        nums.add(num2);
    }
    /**
     * Comprueba si el primer número es múltiplo del segundo.
     *
     * @param nums lista con exactamente 2 números enteros
     * @return mensaje indicando si el primer número es múltiplo del segundo o no
     */
    static String multiplo(List<Integer> nums) {
        if (nums.get(0) % nums.get(1) == 0)
            return ("\nEl número " + nums.get(0) + " es multiplo de " + nums.get(1));
        else
            return ("\nEl número " + nums.get(0) + " no es multiplo de " + nums.get(1));
    }
}
