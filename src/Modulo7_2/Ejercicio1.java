package Modulo7_2;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = userInput(sc);
        System.out.println(ep(n));
    }
    public static int userInput(Scanner sc) {
        System.out.println("Escoge un número: ");
        return(sc.nextInt());
    }
    public static boolean ep(int n) {
        boolean p = true;
        int i = 2;
        if(n > 1) {
            while (p && i < n) {
                if (n % i == 0) {
                    p = false;
                }
                i++;
            }
        }
        return p;
    }
}
