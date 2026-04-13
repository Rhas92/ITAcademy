package Modulo8.Extra2;

public class Spectator {
    String name;
    int age;
    double money;

    public Spectator(String name, int age, double money) {
        this.name = name;
        this.age = age;
        this.money = money;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public double getMoney() {
        return money;
    }

    @Override
    public String toString() {
        return("\nSpectator info:\nName: " + this.name + "\nAge: " + this.age + "\nMoney: " + this.money);
    }
}
