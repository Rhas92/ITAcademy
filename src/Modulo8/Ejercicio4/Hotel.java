package Modulo8.Ejercicio4;

public class Hotel extends Building {
    int numRooms;

    public Hotel(String name, int floors, int surface, int numRooms) {
        super(name, floors, surface);
        this.numRooms = numRooms;
    }

    public int getNumRooms() {
        return numRooms;
    }

    public void securityCost() {
        double personnel = Math.ceil((double) this.surface / 1000);
        double personnelExpenses = personnel * (1300 + 500);
        System.out.println("\nThe cost for security is: " + personnelExpenses + " €");
    }
    public void roomService() {
        double numEmployees = Math.ceil((double)numRooms / 20);
        double totalCost = numEmployees * 1000;
        System.out.println("\nFor the room service, the Hotel needs: " + numEmployees + " employees." +
                "\nMonthly cost: " + totalCost + " €");
    }
}
