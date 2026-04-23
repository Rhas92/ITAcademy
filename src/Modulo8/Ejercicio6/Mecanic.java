package Modulo8.Ejercicio6;

public class Mecanic extends Worker{
    private boolean hasStudies;

    public Mecanic(String name, String lastName, int age, int yearsInTeam, boolean hasStudies) {
        super(name, lastName, age, yearsInTeam);
        this.hasStudies = hasStudies;
        this.salary = getSalary() + (10000 * yearsInTeam);
    }
    public boolean getHasStudies() {
        return hasStudies;
    }
    @Override
    public String toString() {
        return ("\nName: " + getName() + "\nLast Name: " + getLastName() + "\nAge: " + getAge() + "Years in the team: " +
                getYearsInTeam() + "\nHas superior studies: " + getHasStudies() + "Salary: " + getSalary());
    }
}
