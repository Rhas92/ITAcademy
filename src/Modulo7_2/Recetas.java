package Modulo7_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Recetas {
    public static void main (String[] args) {
        List<String> recetas = new ArrayList<>(Arrays.asList(
                "Ensalada verde", "Crema de calabaza", "Pollo al vapor", "Tofu con verduras",
                "Batido detox", "Sopa de lentejas", "Hummus casero"
        ));
        List<Integer> tiempo = new ArrayList<>(Arrays.asList(
                10, 25, 35, 20, 5, 40, 15
        ));
        int tiempoMaximo = 20;
        List<String> nuevaLista = nuevaLista(recetas, tiempo, tiempoMaximo);
        System.out.println(nuevaLista);
        System.out.println(recetaMasRapida(recetas, tiempo, tiempoMaximo));
    }

    /**
     * Metodo que crea una nueva lista con las recetas que se pueden hacer en 20 o menos minutos
     *
     * @param recetas: lista con recetas.
     * @param tiempo: lista con el tiempo que toma hacer cada receta.
     * @param tiempoMaximo tiempo máximo para hacer una receta rápida.
     * @return la lista nueva.
     * */
    public static List<String> nuevaLista(List<String> recetas, List<Integer> tiempo, int tiempoMaximo) {
        List<String> nuevaLista = new ArrayList<>();
        int i = 0;
        while (i < recetas.size()) {
            if (tiempo.get(i) <= tiempoMaximo) {
                nuevaLista.add(recetas.get(i));
            }
            i++;
        }
        return nuevaLista;
    }

    /**
     * Metodo que toma las recetas y busca cúal es la más rápida.
     *
     * @param recetas lista con recetas.
     * @param tiempo lista con el tiempo que toma hacer cada receta.
     * @param tiempoMaximo tiempo máximo para hacer una receta rápida.
     * @return la receta más rápida.
     */
    public static String recetaMasRapida(List<String> recetas, List<Integer> tiempo, int tiempoMaximo) {
        String recetaMasRapida = "";
        int i = 0;
        while (i < recetas.size()) {
            if (tiempo.get(i) < tiempoMaximo) {
                tiempoMaximo = tiempo.get(i);
                recetaMasRapida = recetas.get(i);
            }
            i++;
        }
        return recetaMasRapida;
    }
}
