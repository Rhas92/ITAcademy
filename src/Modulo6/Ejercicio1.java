package Modulo6;

import java.util.Scanner;

public class Ejercicio1
{
    static double suma(double num1, double num2) {
        return num1 + num2;
    }
    static double resta(double num1, double num2) {
        return num1 - num2;
    }
    static double multiplicacion(double num1, double num2) {
        return num1 * num2;
    }
    static double division(double num1, double num2) {
        if (num2 == 0)
            throw new IllegalArgumentException("\nNo puedes dividir por 0");
        return num1 / num2;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nIntroduzca el primer numero:");
        double num1 = sc.nextInt();
        System.out.println("\nIntroduzca el segundo numero:");
        double num2 = sc.nextInt();
        System.out.println("\nIntroduzca el operador que desea utilizar:");
        String operador = sc.next();
        double resultado = 0;

        switch(operador)
        {
            case "+" ->
                    resultado = suma(num1, num2);
            case "-" ->
                    resultado = resta(num1, num2);
            case "*" ->
                    resultado = multiplicacion(num1, num2);
            case "/" ->
                    resultado = division(num1, num2);
            default ->
                    throw new IllegalArgumentException("\nPor favor introduzca un operador correcto (+,-,*,/)");
        }
        System.out.println("\nEl resultado de la operacion es: " + num1 + " " + operador + " " + num2 + " = " + resultado);
        sc.close();
    }
}