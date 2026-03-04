package Modulo3;

import java.util.Scanner;

public class Enteros {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		
		
		System.out.println("indica el primer numero entero: ");
		num1 = entrada.nextInt();
		System.out.println("indica el segundo numero entero: ");
		num2 = entrada.nextInt();

		System.out.println("El resultat de la suma és: " + (num1 + num2));
		System.out.println("El resultat de la resta és: " + (num1 - num2));
		System.out.println("El resultat de la multiplicació és: " + (num1 * num2));
		System.out.println("El resultat de la divisió és: " + (num1 / num2));
		
	}

}
