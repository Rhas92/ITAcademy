package Modulo8.Extra1;

import java.util.Random;

public class Revolver {
    private int currentPosition;
    private int bulletPosition;

    public Revolver() {
        Random random = new Random();
        this.currentPosition = random.nextInt(6) + 1;
        this.bulletPosition = random.nextInt(6) + 1;
    }
    public int getCurrentPosition() {
        return currentPosition;
    }
    public int getBulletPosition() {
        return bulletPosition;
    }
    public boolean shoot() {
        return this.currentPosition == this.bulletPosition;
    }
    public void nextBullet() {
        if (currentPosition < 6)
            this.currentPosition += 1;
        else
            this.currentPosition = 1;
    }
    public void info() {
        System.out.println("\nCurrent position: " + this.currentPosition +
                "\nBullet position: " + this.bulletPosition);
    }
}
