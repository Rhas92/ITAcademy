package Modulo8.Ejercicio3;

import java.util.ArrayList;

public class Client {
    private ArrayList<Account> accounts = new ArrayList<>();
    private String name;
    private String lastName;

    public Client(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }
    public Account getAccount(int index) {
        return accounts.get(index);
    }
    public int getAccountCount() {
        return accounts.size();
    }
    public String getName() {
        return name;
    }
    public String getLastName() {
        return lastName;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void addAccount(Account account) {
        accounts.add(account);
    }
    public void removeAccount(int accountNumber) {
        for(int i = 0; i < accounts.size(); i++) {
            if(accounts.get(i).getAccountNumber() == accountNumber) {
                accounts.remove(i);
                return;
            }
        }
    }
    @Override
    public String toString() {
        return ("\nClient full name: " + name + " " + lastName);
    }
}
