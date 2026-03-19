package Modulo7_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**programa en el cual el usuario introduce dos numeros
 * e indica si alguno de los numeros es negativo.*/
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
        numUser(numbers, sc);
        System.out.println(numNegative(numbers));
    }
    /** Solicita al usuario la cantidad de notas a introducir y las almacena en la lista.
     *
     * @param numbers lista donde se guardarán los numeros introducidos
     * @param sc    Scanner para leer la entrada del usuario*/
    static void numUser(List<Integer> numbers, Scanner sc) {
        System.out.println("\nEnter the first number: ");
        int num1 = sc.nextInt();
        System.out.println("\nEnter the second number: ");
        int num2 = sc.nextInt();
        numbers.add(num1);
        numbers.add(num2);
    }
    /**
     * Calcula la media de las notas y devuelve un mensaje según el resultado.
     *
     * @param numbers lista con los numeros introducidos por el usuario
     * @return mensaje que indica si hay un numero negativo o no.
     */
    static String numNegative(List<Integer> numbers) {
        if (numbers.get(0) < 0 || numbers.get(1) < 0)
            return ("\nOne of the numbers is negative.");
        else
            return ("\nNone of the numbers are negative.");
    }
}
