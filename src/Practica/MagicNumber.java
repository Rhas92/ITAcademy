package Practica;

import java.util.Random;
import java.util.Scanner;


/**
 * Esta línea de código:
 *
 * Math.ceil((Math.random() * 10));
 * Devuelve un número entre el 1 y el 10 de forma aleatoria.
 *
 * El ejercicio consiste en que el usuario/a debe adivinar el número elegido aleatoriamente por el programa.
 *
 * El programa solicita números al usuario/a hasta que acierte el número aleatorio generado.
 *
 * Una vez el usuario/a haya adivinado el número, se mostrará por pantalla el siguiente mensaje:
 * “Enhorabuena, el número era X”
 */


public class MagicNumber {
    static void main() {

        IO.println("\nWelcome to number guessing game!");

        Random random = new Random();
        int magicNumber = random.nextInt(4) + 1;

        Scanner scanner = new Scanner(System.in);

        boolean haGanadoYa = false;
        int intentos = 5;

        while (!haGanadoYa && intentos > 0) {
            IO.print("\nPlease enter your number: ");
            int guess = scanner.nextInt();

            if (guess == magicNumber) {
                IO.println("\nCongrats! You've won!");
                IO.println("\nThe magic number is: " + magicNumber);
                haGanadoYa = true;
            }
            else {
                intentos--;
                IO.println("\nNice try! You're wrong :(");
                IO.println("\nYou have " + intentos + " guesses left.");
                if (intentos == 0) {
                    IO.println("\nIm sorry you lost.");
                }
                if (guess < magicNumber) {
                    IO.println("\nThe magic number is larger than your guess.");
                }
                else {
                    IO.println("\nThe magic number is smaller than your guess.");

                }
            }
        }

        scanner.close();

    }
}
