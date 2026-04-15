package Modulo8.Ejercicio6;

public class Car {
    private int power;
    private int maxSpeed;
    private String colour;
    private double price;

    public Car(int power, int maxSpeed, String colour, double price) {
        this.power = power;
        this.maxSpeed = maxSpeed;
        this.colour = colour;
        this.price = price;
    }
    public int getPower() {
        return power;
    }
    public int getMaxSpeed() {
        return maxSpeed;
    }
    public String getColour() {
        return colour;
    }
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return ("\nCar power: " + power + "\nMaximum Speed: " + maxSpeed +
                "\nCar colour: " + colour + "\nMarket price: " + price);
    }
}
