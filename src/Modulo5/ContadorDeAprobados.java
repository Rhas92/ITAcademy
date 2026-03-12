package Modulo5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ContadorDeAprobados {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        List<Integer> gradesList = new ArrayList<>(Arrays.asList(
                2, 6, 8, 3
        ));
        for (int i = 0; i < gradesList.size(); i++) {
            System.out.println("\nVoy a revisar al alumno número " + (i + 1));
            System.out.println("Nota: " + gradesList.get(i));
            if (gradesList.get(i) >= 5)
                System.out.println("Ha aprobado");
            else
                System.out.println("No ha aprobado");
        }
        sc.close();
    }
}
