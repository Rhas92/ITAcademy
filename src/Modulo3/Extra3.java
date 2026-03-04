package Modulo3;

import java.util.Scanner;

public class Extra3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        final int coberturaLitro = 12;
        float ancho;
        float alto;
        int manos;
        float superficie;
        float litros;

        IO.println("\nIndica el alto de la pared a pintar en metros:");
        alto = entrada.nextFloat();
        IO.println("Indica el ancho de la pared a pintar en metros:");
        ancho = entrada.nextFloat();
        IO.println("Cuantas manos de pintura vas a aplicar?");
        manos = entrada.nextInt();
        superficie = (alto * ancho);
        litros = (superficie * manos) / coberturaLitro;
        IO.println("Necesitas " + litros + " litros para pintar la pared.\n");
    }
}
