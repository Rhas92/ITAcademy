package Modulo8.Ejercicio4;

public class Building {
    String name;
    int floors;
    int surface;
    public Building(String name, int floors, int surface) {
        this.name = name;
        this.floors = floors;
        this.surface = surface;
    }
    public String getName() {
        return name;
    }

    public int getFloors() {
        return floors;
    }
    public int getSurface() {
        return surface;
    }
    public void clean() {
        int basicTime = this.surface / 5;
        double timeFloors = (this.floors - 1) * 0.5;
        double totalTime = basicTime + timeFloors;
        double dailyCost = totalTime * 1;
        double monthlyCost = dailyCost * 30;
        System.out.println("\nThis building would take " + totalTime + " minutes to maintain." +
                            "\nThe monthly cost of maintenance is: " + monthlyCost + " €");
    }
}
