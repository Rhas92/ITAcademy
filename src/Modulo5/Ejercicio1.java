package Modulo5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main (String[] args){
        /*pregunta al usuario cuántas palabras quiere introducir.
        A continuación, muestra el mensaje `"Introduce la palabra"` tantas veces como el número indicado.
        Las palabras se van guardando en un `ArrayList` y, una vez introducidas todas, se muestran por pantalla.*/
        Scanner sc = new Scanner(System.in);
        List<String> wordList = new ArrayList<>();
        System.out.println("\nIndica cuantas palabras quieres introducir");
        int wordNum = sc.nextInt();

        for (int i = 1; i < wordNum; i++){
        System.out.println("\nIntroduce la palabra: ");
        String wordInput = sc.next();
        wordList.add(wordInput);
        }
        for (String i : wordList) {
            System.out.println("\n" + i);
        }
        sc.close();
    }
}
