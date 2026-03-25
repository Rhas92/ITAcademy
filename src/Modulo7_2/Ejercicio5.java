package Modulo7_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(
                1, 2, 3, 4, 5
        ));
        printArray(numbers);
        printReverseArray(numbers);
    }
    public static void printArray(List<Integer> numbers) {
        System.out.println("\nThese are the contents of the Array: ");
        for (int num : numbers) {
            System.out.println(num);
        }
    }
    /**
     * Imprime el nuevo array en orden inverso
     * @param numbers el array de numeros original
     */
    public static void printReverseArray(List<Integer> numbers) {
        List<Integer> reverseNumbers = new ArrayList<>();
        System.out.println("\nThese are the contents of the Array in reverse order: ");
        for (int i = (numbers.size() - 1); i >= 0; i--) {
            reverseNumbers.add(numbers.get(i));
        }
        for (int num : reverseNumbers) {
            System.out.println(num);
        }
    }
}
