package Modulo8.Ejercicio4;

public class Cinema extends Building {
    int maxCapacity;

    public Cinema(String name, int floors, int surface, int maxCapacity) {
        super(name, floors, surface);
        this.maxCapacity = maxCapacity;
    }
    public int getMaxCapacity(){
        return maxCapacity;
    }
    public void securityCost() {
        double personnel = Math.ceil((double) this.surface / 3000);
        double personnelExpenses = personnel * (1300);
        System.out.println("\nThe cost for security is: " + personnelExpenses + " €");
    }
    public void screening(int assistants, double ticketPrice) {
        if (assistants <= this.maxCapacity) {
            double income = assistants * ticketPrice;
            System.out.println("\n " + income + " € collected.");
        }
        else
            System.out.println("\nThe number of people in the session exceeds the maximum capacity.");
    }
}
