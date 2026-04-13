package Modulo8.Ejercicio6;

public class Mecanic extends Worker{
    boolean hasStudies;

    public Mecanic(String name, String lastName, int age, int yearsInTeam, boolean hasStudies) {
        super(name, lastName, age, yearsInTeam);
        this.hasStudies = hasStudies;
        this.salary = salary + (10000 * yearsInTeam);
    }
    public boolean getHasStudies() {
        return hasStudies;
    }
    @Override
    public String toString() {
        return ("\nName: " + name + "\nLast Name: " + lastName + "\nAge: " + age + "Years in the team: " +
                yearsInTeam + "\nHas superior studies: " + hasStudies + "Salary: " + salary);
    }
}
