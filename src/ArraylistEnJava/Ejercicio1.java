package ArraylistEnJava;

import java.util.ArrayList;
import java.util.Arrays;

public class Ejercicio1 {
    public static void main (String[] args) {
        ArrayList<Integer> edades = new ArrayList<>(Arrays.asList(
                18, 28, 33, 45
        ));
        int suma = 0;
        for (int i = 0; i < edades.size(); i++){
            suma += edades.get(i);
            System.out.println("\nAlumno " + (i + 1) + " -> Edad: " + edades.get(i) + " | Suma acumulada: " + suma);
        }
        System.out.println("\nSu total de edades: " + suma);
    }
}
