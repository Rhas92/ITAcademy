package calculadora_impuestos;

import java.util.Scanner;

public class CalculadoraImpuestos {
    public static void main(String[] args){
// inicializacion de Scanner y variables.
        Scanner entrada = new Scanner(System.in);
        double tipoAplicado;
        double salarioBruto;
        double impuesto;
        double salarioNeto;
/*
                            === Calculadora básica de impuestos ===

       - Pedir al usuario su salario bruto anual.
       - Verificar que el salario no sea negativo.
       - Aplicar un tipo de impuesto fijo según el tramo adecuado.
                | Salario bruto anual | Tipo de impuesto |
                | 0 € – 20.000 €      | 10 %             |
                | 20.001 € – 40.000 € | 20 %             |
                | 40.001 € – 60.000 € | 30 %             |
                | Más de 60.000 €     | 40 %             |
       Mostrar:
        - Salario bruto - Tipo aplicado - Impuesto total - Salario neto
*/
        System.out.println("\nIntroduzca su salario bruto en €:");
        salarioBruto = entrada.nextDouble();
        if (salarioBruto < 0) // chequeo si salario es negativo
            System.out.println("\nSu salario es negativo.");
        else {
            if (salarioBruto <= 20000) // 1er tramo
            {
                tipoAplicado = 10;
                impuesto = salarioBruto * (tipoAplicado / 100);
                salarioNeto = salarioBruto - impuesto;

                System.out.println("\nSu salario neto es: " + salarioNeto + " €");
                System.out.println("\nSus impuestos suman un total de: " + impuesto + " €");
                System.out.println("\nTipo aplicado: " + tipoAplicado + " %");
            }
            else if (salarioBruto > 20000 && salarioBruto <= 40000) // 2do tramo
            {
                tipoAplicado = 20;
                impuesto = salarioBruto * (tipoAplicado / 100);
                salarioNeto = salarioBruto - impuesto;

                System.out.println("\nSu salario neto es: " + salarioNeto + " €");
                System.out.println("\nSus impuestos suman un total de: " + impuesto + " €");
                System.out.println("\nTipo aplicado: " + tipoAplicado + " %");
            }
            else if (salarioBruto > 40000 && salarioBruto <= 60000) // 3er tramo
            {
                tipoAplicado = 30;
                impuesto = salarioBruto * (tipoAplicado / 100);
                salarioNeto = salarioBruto - impuesto;

                System.out.println("\nSu salario neto es: " + salarioNeto + " €");
                System.out.println("\nSus impuestos suman un total de: " + impuesto + " €");
                System.out.println("\nTipo aplicado: " + tipoAplicado + " %");
            }
            else if (salarioBruto > 60000) // 4to tramo
            {
                tipoAplicado = 40;
                impuesto = salarioBruto * (tipoAplicado / 100);
                salarioNeto = salarioBruto - impuesto;

                System.out.println("\nSu salario neto es: " + salarioNeto + " €");
                System.out.println("\nSus impuestos suman un total de: " + impuesto + " €");
                System.out.println("\nTipo aplicado: " + tipoAplicado + " %");
            }
        }
    }
}

