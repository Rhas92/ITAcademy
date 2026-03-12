package Modulo5;

import java.util.Scanner;

public class Ejercicio2 {
    /*
    El programa pide dos números enteros y calcula la suma de todos los valores comprendidos entre ellos,
    **ambos incluidos**.
    **Ejemplo:** `4` y `10` → `4 + 5 + 6 + 7 + 8 + 9 + 10 = 49`
    */

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("\nIndica el primer numero a utilizar:");
        int num1 = sc.nextInt();
        System.out.println("\nIndica el segundo numero a utilizar:");
        int num2 = sc.nextInt();
        int suma = 0;

        if (num1 > num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }

        for (int i = num1; i <= num2; i++){
            suma += i;
        }

        System.out.print("\nla suma de todos los valores comprendidos entre ellos es: ");
        for (int i = num1; i <= num2; i++){
            if (i == num2){
                System.out.print(i);
                break;
            }
            System.out.print(i + " + ");
        }
        System.out.println(" = " + suma);
        sc.close();
    }
}

