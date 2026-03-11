package Modulo4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MenuRestaurante {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        List<String> menuRestaurante = new ArrayList<>(
                List.of("Pizza", "Ensalada", "Hamburguesa", "Pasta")
        );
        ArrayList<String> precio = new ArrayList<>(Arrays.asList(
                "8 €", "6 €", "9 €", "7 €"
        ));
        System.out.println("\n\uD83C\uDF7D\uFE0FMenú del restaurante:\n");
        System.out.println("| Número | Plato       | Precio |\n" +
                "| ------ | ----------- | ------ | ");
        System.out.println("| 1      | Pizza       | 8 €    |\n" +
                "| ------ | ----------- | ------ |");
        System.out.println("| 2      | Ensalada    | 6 €    |\n" +
                "| ------ | ----------- | ------ |");
        System.out.println("| 3      | Hamburguesa | 9 €    |\n" +
                "| ------ | ----------- | ------ |");
        System.out.println("| 4      | Pasta       | 7 €    |\n" +
                "| ------ | ----------- | ------ |");
        System.out.println("\nElige una opción: (1-4)");
        int opcion = entrada.nextInt();

        if (opcion < 1 || opcion > 4)
            throw new IllegalArgumentException("❌ Opción no válida");

        System.out.println("\nHas elegido: " + menuRestaurante.get(opcion - 1));
        System.out.println("\nPrecio: " + precio.get(opcion - 1));

/*        switch (opcion) {
            case 1 -> System.out.println("Pizza - 8€");
            case 2 -> System.out.println("Ensalada - 6€");
            case 3 -> System.out.println("Hamburguesa - 9€");
            default -> System.out.println("Pasta - 7€");
        }*/
    }
}
