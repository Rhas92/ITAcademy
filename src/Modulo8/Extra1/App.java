package Modulo8.Extra1;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    Scanner sc = new Scanner(System.in);
    public void execute() {
        int userOption = 1;
        while (userOption != 0) {
            System.out.println("\nWelcome to your Suicide facilitation App \uD83D\uDD2B." + "\nPlease input the amount of players: 1-6 or exit (0)");
            userOption = sc.nextInt();
            if (userOption >= 1 && userOption <= 6) {
                play(userOption);
            } else if (userOption != 0) {
                play(6);
            }
        }
    }
    public void play(int numPlayers) {
        ArrayList<Player> players = new ArrayList<>();
        for (int i = 1; i <= numPlayers; i++) {
            System.out.println("\nInput the player number " + i + "'s name: ");
            String userName = sc.next();
            players.add(new Player(i, userName));
        }
        Revolver revolver = new Revolver();
        Game game = new Game(players, revolver);
        while(!game.gameOver())
            game.round();
    }
}
