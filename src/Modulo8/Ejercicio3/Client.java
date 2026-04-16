package Modulo8.Ejercicio3;

import java.util.ArrayList;

public class Client {
    private ArrayList<Account> accounts = new ArrayList<>();
    private String name;
    private String lastName;

    public Client(String name, String lastName) {
        verifyClient(name, lastName);
        this.name = name;
        this.lastName = lastName;
    }
    private void verifyClient(String name, String lastName) {
        verifyName(name);
        verifyLastName(lastName);
    }
    private void verifyName(String name) {
        if (name == null)
            throw new IllegalArgumentException("The name of the client can't be null.");
        if (name.isBlank())
            throw new IllegalArgumentException("The name of the client can't be blank.");
    }
    private void verifyLastName(String lastName) {
        if (lastName == null)
            throw new IllegalArgumentException("The Last name of the client can't be null.");
        if (lastName.isBlank())
            throw new IllegalArgumentException("The Last name of the client can't be blank.");
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
        verifyName(name);
        this.name = name;
    }
    public void setLastName(String lastName) {
        verifyLastName(lastName);
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
