package Modulo8.Ejercicio6;

import java.util.ArrayList;

public class Scuderia {
    ArrayList<Car> cars = new ArrayList<>();
    String name;
    double budget;
    String country;

    public Scuderia(String name, double budget, String country) {
        this.name = name;
        this.budget = budget;
        this.country = country;
    }
    public void addCar(Car car) {
        cars.add(car);
    }
    public ArrayList<Car> getCars() {
        return cars;
    }
    public String getName(){
        return name;
    }
    public double getBudget(){
        return budget;
    }
    public String getCountry(){
        return country;
    }
    @Override
    public String toString() {
        return ("\nScuderia " + name + "\nBudget: " + budget + " €" + "\nCountry of origin: " + country);
    }
}
