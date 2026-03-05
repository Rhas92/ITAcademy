package Modulo4;

import java.util.Scanner;

public class Ejercicio5
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        String operador;
        double num1;
        double num2;
        double resultado;

        System.out.println("\nIntroduzca el primer numero:");
        num1 = entrada.nextInt();
        System.out.println("\nIntroduzca el segundo numero:");
        num2 = entrada.nextInt();
        System.out.println("\nIntroduzca el operador que desea utilizar:");
        operador = entrada.next();

        switch(operador)
        {
            case "+":
                resultado = num1 + num2;
                System.out.println("\nEl resultado de la operacion es: " + num1 + " " + operador + " " + num2 + " = " + resultado);
                break;
            case "-":
                resultado = num1 - num2;
                System.out.println("\nEl resultado de la operacion es: " + num1 + " " + operador + " " + num2 + " = " + resultado);
                break;
            case "*":
                resultado = num1 * num2;
                System.out.println("\nEl resultado de la operacion es: " + num1 + " " + operador + " " + num2 + " = " + resultado);
                break;
            case "/":
                resultado = num1 / num2;
                System.out.println("\nEl resultado de la operacion es: " + num1 + " " + operador + " " + num2 + " = " + resultado);
                break;
            default:
                System.out.println("\nPor favor introduzca un operador correcto (+,-,*,/)");
        }
    }
}
