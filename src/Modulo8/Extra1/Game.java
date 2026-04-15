package Modulo8.Extra1;

import java.util.ArrayList;

public class Game {
    private ArrayList<Player> players = new ArrayList<>();
    private Revolver revolver;

    public Game(ArrayList<Player> players, Revolver revolver) {
        this.players = players;
        this.revolver = revolver;
    }
    public ArrayList<Player> getPlayers() {
        return players;
    }
    public Revolver getRevolver() {
        return revolver;
    }
    public boolean gameOver() {
        for (Player player : players) {
            if (!player.getAlive()) {
                return true;
            }
        }
        return false;
    }
    public void round() {
        for (Player player : players) {
            boolean shot = player.play(revolver);
            revolver.nextBullet();
            if(shot) {
                System.out.println("\nThe player " + player.getNickname() + " shoots ... and dies :(");
                return;
            }
            else
                System.out.println("\nThe player " + player.getNickname() + " shoots ... and misses :)");
        }
    }
}
