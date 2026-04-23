package Modulo8.Ejercicio6;

public class Pilot extends Worker{
    private double height;
    private double weight;

    public Pilot(String name, String lastName, int age, int yearsInTeam, double height, double weight) {
        super(name, lastName, age, yearsInTeam);
        this.height = height;
        this.weight = weight;
        this.salary = salary + (10000 * yearsInTeam) + 50000;
    }
    public double getHeight() {
        return height;
    }
    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return ("\nName: " + getName() + "\nLast Name: " + getLastName() + "\nAge: " + getAge() + "Years in the team: " +
                getYearsInTeam() + "\nHeight: " + getHeight() + "\nWeight: " + getWeight() + "Salary: " + getSalary());
    }
}
