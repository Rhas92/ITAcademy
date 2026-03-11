package Modulo4;

import java.util.ArrayList;
import java.util.Scanner;

public class Extra3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        ArrayList<String> opciones = new ArrayList<String>();
        opciones.add("Piedra");
        opciones.add("Papel");
        opciones.add("Tijera");

        System.out.println("Elije una opción 1(Piedra), 2(Papel), 3(Tijera)");
        int eleccionUsuario = entrada.nextInt();
        int numRandom = (int)(Math.random() * 3) + 1;

        if (eleccionUsuario < 1 || eleccionUsuario > 3)
            throw new IllegalArgumentException("\nEntenc que no vols jugar. Adeu.");
        System.out.println("\nYo " + opciones.get(numRandom - 1) + " tu " + opciones.get(eleccionUsuario - 1));
        if (numRandom == eleccionUsuario)
            System.out.println(("\nHemos empatado."));
        else switch (eleccionUsuario){
            case 1 -> {
                if (numRandom == 2)
                    System.out.println(("\nLo lamento, has perdido."));
                else
                    System.out.println(("\nFelicidades, has ganado."));
            }
            case 2 -> {
                if (numRandom == 3)
                    System.out.println(("\nLo lamento, has perdido."));
                else
                    System.out.println(("\nFelicidades, has ganado."));
            }
            case 3 -> {
                if (numRandom == 1)
                    System.out.println(("\nLo lamento, has perdido."));
                else
                    System.out.println(("\nFelicidades, has ganado."));
            }
        }
    }
}
