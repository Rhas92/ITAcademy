package Modulo8.Ejercicio4;

public class Hospital extends Building {
    int numSick;

    public Hospital(String name, int floors, int surface, int numSick) {
        super(name, floors, surface);
        this.numSick = numSick;
    }

    public int getNumSick() {
        return numSick;
    }
    public void setNumSick(int numSick) {
        this.numSick = numSick;
    }
    public void securityCost() {
        double personnel = Math.ceil((double) this.surface / 1000);
        double personnelExpenses = personnel * (1300);
        System.out.println("\nThe cost for security is: " + personnelExpenses + " €");
    }
    public void deliverFood() {
        int rations = this.numSick * 3;
        System.out.println("\nCurrently delivering " + rations + " rations.");
    }
}
