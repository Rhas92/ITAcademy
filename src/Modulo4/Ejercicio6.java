package Modulo4;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int dia;
        int mes;
        int diasMes;
        String signo;

        IO.println("Indroduzca su día de nacimiento en numeros (1-31):");
        dia = entrada.nextInt();
        IO.println("Indroduzca su mes de nacimiento en numeros (1-12):");
        mes = entrada.nextInt();

        switch (mes) {
            case 1:
                diasMes = 31;
                if (dia >= 20) {
                    signo = "Acuario";
                    IO.println("\nNaciste el " + dia + " del mes " + mes + " tu signo es " + signo);
                }
                else {
                    signo = "Capricornio";
                    IO.println("\nNaciste el " + dia + " del mes " + mes + " tu signo es " + signo);
                }
                break;
            case 2:
                diasMes = 28;
                if (dia >= 19) {
                    signo = "Piscis";
                    IO.println("\nNaciste el " + dia + " del mes " + mes + " tu signo es " + signo);
                }
                else {
                    signo = "Acuario";
                    IO.println("\nNaciste el " + dia + " del mes " + mes + " tu signo es " + signo);
                }
                break;
            case 3:
                diasMes = 31;
                if (dia >= 21) {
                    signo = "Aries";
                    IO.println("\nNaciste el " + dia + " del mes " + mes + " tu signo es " + signo);
                }
                else {
                    signo = "Piscis";
                    IO.println("\nNaciste el " + dia + " del mes " + mes + " tu signo es " + signo);
                }
                break;
            case 4:
                diasMes = 30;
                if (dia >= 20) {
                    signo = "Tauro";
                    IO.println("\nNaciste el " + dia + " del mes " + mes + " tu signo es " + signo);
                }
                else {
                    signo = "Aries";
                    IO.println("\nNaciste el " + dia + " del mes " + mes + " tu signo es " + signo);
                }
                break;
            case 5:
                diasMes = 31;
                if (dia >= 21) {
                    signo = "Geminis";
                    IO.println("\nNaciste el " + dia + " del mes " + mes + " tu signo es " + signo);
                }
                else {
                    signo = "Tauro";
                    IO.println("\nNaciste el " + dia + " del mes " + mes + " tu signo es " + signo);
                }
                break;
            case 6:
                diasMes = 31;
            case 7
            case 8
            case 9
            case 10
            case 11
            case 12
        }
    }
}
