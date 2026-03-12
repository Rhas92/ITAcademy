package ArraylistEnJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Ejercicio2 {
    public static void main(String[] args){
        List<Integer> notas = new ArrayList<>(Arrays.asList(
                2, 6, 8, 3, 9, 7, 5
        ));
        int aprobados = 0;
        int suspendidos = 0;
        for (int i = 0; i < notas.size(); i++) {
            System.out.println("\nAlumno " + (i + 1) + " -> Nota: " + notas.get(i));
            if (notas.get(i) >= 5)
                aprobados++;
            else
                suspendidos++;

        }
        System.out.println("\nAprobados: " + aprobados);
        System.out.println("\nSuspendidos: " + suspendidos);
    }
}