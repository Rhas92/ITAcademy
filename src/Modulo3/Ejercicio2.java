package Modulo3;

import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		
		
		System.out.println("\nindica el primer numero entero:\n");
		num1 = entrada.nextInt();
		System.out.println("\nindica el segundo numero entero:\n");
		num2 = entrada.nextInt();

		System.out.println("\nEl resultat de la suma és: " + (num1 + num2));
		System.out.println("\nEl resultat de la resta és: " + (num1 - num2));
		System.out.println("\nEl resultat de la multiplicació és: " + (num1 * num2));
		System.out.println("\nEl resultat de la divisió és: " + (num1 / num2));
		
	}

}
