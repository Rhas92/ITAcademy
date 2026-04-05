package Modulo7_2;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = inputNumber(sc);
        fibonacci(number);
    }
    public static Integer inputNumber(Scanner sc) {
        System.out.println("Please input the number you wish to check");
        return sc.nextInt();
    }
    public static void fibonacci(int number) {
        int a = 0;
        int b = 1;
        for (int i = 0; i < number; i++) {
            System.out.print(a + " ");
            int temp = a + b;
            a = b;
            b = temp;
        }
    }
}
