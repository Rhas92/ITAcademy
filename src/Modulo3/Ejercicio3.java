package Modulo3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		float num1;
		float num2;
		float num3;
		float prom;
		
		System.out.println("indica la primera nota: ");
		num1 = entrada.nextFloat();
		System.out.println("indica la segunda nota: ");
		num2 = entrada.nextFloat();
		System.out.println("indica la tercera nota: ");
		num3 = entrada.nextFloat();
		prom = (num1 + num2 + num3) / 3;
		System.out.println("El promedio de tus notas es: " + prom);
	}

}
