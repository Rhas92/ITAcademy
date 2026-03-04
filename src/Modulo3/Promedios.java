package Modulo3;

import java.util.Scanner;

public class Promedios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		float prom = 0;
		
		System.out.println("indica la primera nota: ");
		num1 = entrada.nextInt();
		System.out.println("indica la segunda nota: ");
		num2 = entrada.nextInt();
		System.out.println("indica la tercera nota: ");
		num3 = entrada.nextInt();
		prom = (num1 + num2 + num3) / 3;
		System.out.println("El promedio de tus notas es: " + prom);
	}

}
