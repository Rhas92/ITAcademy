package Modulo8.Ejercicio6;

public class Pilot extends Worker{
    double height;
    double weight;

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
        return ("\nName: " + name + "\nLast Name: " + lastName + "\nAge: " + age + "Years in the team: " +
                yearsInTeam + "\nHeight: " + height + "\nWeight: " + weight + "Salary: " + salary);
    }
}
