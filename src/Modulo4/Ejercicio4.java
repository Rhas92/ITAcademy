package Modulo4;

import java.util.Scanner;

public class Ejercicio4
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        int mes;
        int diasMes;

        IO.println("\nIntroduzca el numero del mes:");
        mes = entrada.nextInt();
        switch (mes)
        {
            case 1:
                diasMes = 31;
                IO.println("\nEl mes de Enero tiene " + diasMes + " dias.");
                break;
            case 2:
                diasMes = 28;
                IO.println("\nEl mes de Febrero tiene " + diasMes + " dias.");
                break;
            case 3:
                diasMes = 31;
                IO.println("\nEl mes de Marzo tiene " + diasMes + " dias.");
                break;
            case 4:
                diasMes = 30;
                IO.println("\nEl mes de Abril tiene " + diasMes + " dias.");
                break;
            case 5:
                diasMes = 31;
                IO.println("\nEl mes de Mayo tiene " + diasMes + " dias.");
                break;
            case 6:
                diasMes = 30;
                IO.println("\nEl mes de Junio tiene " + diasMes + " dias.");
                break;
            case 7:
                diasMes = 31;
                IO.println("\nEl mes de Julio tiene " + diasMes + " dias.");
                break;
            case 8:
                diasMes = 31;
                IO.println("\nEl mes de Agosto tiene " + diasMes + " dias.");
                break;
            case 9:
                diasMes = 30;
                IO.println("\nEl mes de Septiembre tiene " + diasMes + " dias.");
                break;
            case 10:
                diasMes = 31;
                IO.println("\nEl mes de Octubre tiene " + diasMes + " dias.");
                break;
            case 11:
                diasMes = 30;
                IO.println("\nEl mes de Noviembre tiene " + diasMes + " dias.");
                break;
            case 12:
                diasMes = 31;
                IO.println("\nEl mes de Diciembre tiene " + diasMes + " dias.");
                break;
            default:
                IO.println("\nPor favor introduzca un dato correcto.");
        }
    }
}
