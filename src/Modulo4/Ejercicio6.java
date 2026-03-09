package Modulo4;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int dia;
        int mes;
        int diasMes;
        String signo;
        String nombreMes;

        System.out.println("Introduzca su día de nacimiento en numeros (1-31):");
        dia = entrada.nextInt();
        System.out.println("Introduzca su mes de nacimiento en numeros (1-12):");
        mes = entrada.nextInt();

        switch (mes) {
            case 1:
                diasMes = 31;
                nombreMes = "Enero";
                if (dia <= diasMes) {
                    if (dia >= 20) {
                        signo = "Acuario";
                        System.out.println("\nNaciste el " + dia + " del mes " + nombreMes + " tu signo es " + signo);
                    } else {
                        signo = "Capricornio";
                        System.out.println("\nNaciste el " + dia + " del mes " + nombreMes + " tu signo es " + signo);
                    }
                }
                else
                    System.out.println("\nEl mes de " + nombreMes + " no tiene mas de " + diasMes + " dias");
                break;

            case 2:
                diasMes = 28;
                nombreMes = "Febrero";
                if (dia <= diasMes) {
                    if (dia >= 19) {
                        signo = "Piscis";
                        System.out.println("\nNaciste el " + dia + " del mes " + nombreMes + " tu signo es " + signo);
                    } else {
                        signo = "Acuario";
                        System.out.println("\nNaciste el " + dia + " del mes " + nombreMes + " tu signo es " + signo);
                    }
                }
                else
                    System.out.println("\nEl mes de " + nombreMes + " no tiene mas de " + diasMes + " dias");
                break;
            case 3:
                diasMes = 31;
                nombreMes = "Marzo";
                if (dia <= diasMes) {
                    if (dia >= 21) {
                        signo = "Aries";
                        System.out.println("\nNaciste el " + dia + " del mes " + nombreMes + " tu signo es " + signo);
                    } else {
                        signo = "Piscis";
                        System.out.println("\nNaciste el " + dia + " del mes " + nombreMes + " tu signo es " + signo);
                    }
                }
                else
                    System.out.println("\nEl mes de " + nombreMes + " no tiene mas de " + diasMes + " dias");
                break;
            case 4:
                diasMes = 30;
                nombreMes = "Abril";
                if (dia <= diasMes) {
                    if (dia >= 20) {
                        signo = "Tauro";
                        System.out.println("\nNaciste el " + dia + " del mes " + nombreMes + " tu signo es " + signo);
                    } else {
                        signo = "Aries";
                        System.out.println("\nNaciste el " + dia + " del mes " + nombreMes + " tu signo es " + signo);
                    }
                }
                else
                    System.out.println("\nEl mes de " + nombreMes + " no tiene mas de " + diasMes + " dias");
                break;
            case 5:
                diasMes = 31;
                nombreMes = "Mayo";
                if (dia <= diasMes) {
                    if (dia >= 21) {
                        signo = "Geminis";
                        System.out.println("\nNaciste el " + dia + " del mes " + nombreMes + " tu signo es " + signo);
                    } else {
                        signo = "Tauro";
                        System.out.println("\nNaciste el " + dia + " del mes " + nombreMes + " tu signo es " + signo);
                    }
                }
                else
                    System.out.println("\nEl mes de " + nombreMes + " no tiene mas de " + diasMes + " dias");
                break;
            case 6:
                diasMes = 30;
                nombreMes = "Junio";
                if (dia <= diasMes) {
                    if (dia >= 21) {
                        signo = "Cancer";
                        System.out.println("\nNaciste el " + dia + " del mes " + nombreMes + " tu signo es " + signo);
                    } else {
                        signo = "Geminis";
                        System.out.println("\nNaciste el " + dia + " del mes " + nombreMes + " tu signo es " + signo);
                    }
                }
                else
                    System.out.println("\nEl mes de " + nombreMes + " no tiene mas de " + diasMes + " dias");
                break;
            case 7:
                diasMes = 31;
                nombreMes = "Julio";
                if (dia <= diasMes) {
                    if (dia >= 23) {
                        signo = "Leo";
                        System.out.println("\nNaciste el " + dia + " del mes " + nombreMes + " tu signo es " + signo);
                    } else {
                        signo = "Cancer";
                        System.out.println("\nNaciste el " + dia + " del mes " + nombreMes + " tu signo es " + signo);
                    }
                }
                else
                    System.out.println("\nEl mes de " + nombreMes + " no tiene mas de " + diasMes + " dias");
                break;
            case 8:
                diasMes = 31;
                nombreMes = "Agosto";
                if (dia <= diasMes) {
                    if (dia >= 23) {
                        signo = "Virgo";
                        System.out.println("\nNaciste el " + dia + " del mes " + nombreMes + " tu signo es " + signo);
                    } else {
                        signo = "Leo";
                        System.out.println("\nNaciste el " + dia + " del mes " + nombreMes + " tu signo es " + signo);
                    }
                }
                else
                    System.out.println("\nEl mes de " + nombreMes + " no tiene mas de " + diasMes + " dias");
                break;
            case 9:
                diasMes = 30;
                nombreMes = "Septiembre";
                if (dia <= diasMes) {
                    if (dia >= 23) {
                        signo = "Libra";
                        System.out.println("\nNaciste el " + dia + " del mes " + nombreMes + " tu signo es " + signo);
                    } else {
                        signo = "Virgo";
                        System.out.println("\nNaciste el " + dia + " del mes " + nombreMes + " tu signo es " + signo);
                    }
                }
                else
                    System.out.println("\nEl mes de " + nombreMes + " no tiene mas de " + diasMes + " dias");
                break;
            case 10:
                diasMes = 31;
                nombreMes = "Octubre";
                if (dia <= diasMes) {
                    if (dia >= 23) {
                        signo = "Escorpio";
                        System.out.println("\nNaciste el " + dia + " del mes " + nombreMes + " tu signo es " + signo);
                    } else {
                        signo = "Libra";
                        System.out.println("\nNaciste el " + dia + " del mes " + nombreMes + " tu signo es " + signo);
                    }
                }
                else
                    System.out.println("\nEl mes de " + nombreMes + " no tiene mas de " + diasMes + " dias");
                break;
            case 11:
                diasMes = 30;
                nombreMes = "Noviembre";
                if (dia <= diasMes) {
                    if (dia >= 22) {
                        signo = "Sagitario";
                        System.out.println("\nNaciste el " + dia + " del mes " + nombreMes + " tu signo es " + signo);
                    } else {
                        signo = "Escorpio";
                        System.out.println("\nNaciste el " + dia + " del mes " + nombreMes + " tu signo es " + signo);
                    }
                }
                else
                    System.out.println("\nEl mes de " + nombreMes + " no tiene mas de " + diasMes + " dias");
                break;
            case 12:
                diasMes = 31;
                nombreMes = "Diciembre";
                if (dia <= diasMes) {
                    if (dia >= 22) {
                        signo = "Capricornio";
                        System.out.println("\nNaciste el " + dia + " del mes " + nombreMes + " tu signo es " + signo);
                    } else {
                        signo = "Sagitario";
                        System.out.println("\nNaciste el " + dia + " del mes " + nombreMes + " tu signo es " + signo);
                    }
                }
                else
                    System.out.println("\nEl mes de " + nombreMes + " no tiene mas de " + diasMes + " dias");
                break;
            default:
                System.out.println("\nIntroduce un mes adecuado.");
        }
    }
}
