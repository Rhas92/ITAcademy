package ExamenFinalMinions;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MainMinionConstructor {
    static void main() {

        String nullString = null;

        System.out.println("Is the string null? " + (nullString == null));

        String vacio = "       ";

        System.out.println("Is the string empty? " + vacio.isEmpty());
        System.out.println("Is the string blank? " + vacio.isBlank());

        List<Track> lista = new ArrayList<>();

        lista.add(new Track("Track 1", 120));
        lista.add(new Track("Track 2", 150));
        lista.add(null);







//        MinionConstructor minionConstructor = new MinionConstructor("Bob", "Yellow", 5, 4);
//        MinionConstructor minionConstructor2 = new MinionConstructor("Bob", "Yellow", 5,10);
//
//
//        boolean areEqual = minionConstructor.equals(minionConstructor2);
//        System.out.println("Are the two minions equal? " + areEqual);
//
//        String prueba = "Prueba";
//        boolean areEqual2 = minionConstructor.equals(prueba);
//        System.out.println("Is the minion equal to a string? " + areEqual2);


    }

}

