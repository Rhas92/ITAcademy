package ArraylistEnJava;

import java.util.ArrayList;
import java.util.Arrays;

public class Ejercicio3 {
    public static void main(String[] args){
        ArrayList<Integer> notas = new ArrayList<>(Arrays.asList(
                2, 6, 8, 3, 9, 7, 5
        ));
        int mejorNota = 0;
        for (int i = 0; i < notas.size(); i++){
            System.out.println("\nExamen " + (i + 1) + " -> Nota: " + notas.get(i));
            if (notas.get(i) > mejorNota)
                mejorNota = notas.get(i);
        }
        System.out.println("\nNota más alta: " + mejorNota);
    }
}
