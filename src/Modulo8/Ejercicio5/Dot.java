package Modulo8.Ejercicio5;

public class Dot {
    double positionX;
    double positionY;
    public Dot(double positionX, double positionY) {
        this.positionX = positionX;
        this.positionY = positionY;
    }
    public double getPositionX() {
        return positionX;
    }

    public double getPositionY() {
        return positionY;
    }
    public void setPositionX(double positionX) {
        this.positionX = positionX;
    }
    public void setPositionY(double positionY) {
        this.positionY = positionY;
    }
    @Override
    public String toString(){
        return ("\nPosition X: " + positionX + "\nPosition Y: " + positionY);
    }
}
