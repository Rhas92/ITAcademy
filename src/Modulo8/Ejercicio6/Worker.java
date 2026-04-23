package Modulo8.Ejercicio6;

public class Worker {
    private String name;
    private String lastName;
    private int age;
    private int yearsInTeam;
    private double salary;

    public Worker(String name, String lastName, int age, int yearsInTeam) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.yearsInTeam = yearsInTeam;
        this.salary = 50000;
    }
    public String getName() {
        return name;
    }
    public String getLastName() {
        return lastName;
    }
    public int getAge() {
        return age;
    }
    public int getYearsInTeam() {
        return yearsInTeam;
    }
    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", yearsInTeam=" + yearsInTeam +
                ", salary=" + salary +
                '}';
    }
}
