package Modulo8.Ejercicio3;

public class Account {
    private int accountNumber;
    private int accountBalance;

    public Account(int accountNumber) {
        this.accountNumber = accountNumber;
        this.accountBalance = 0;
    }
    public int getAccountNumber() {
        return accountNumber;
    }
    public int getAccountBalance() {
        return accountBalance;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    public void setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;
    }
    public int deposit(int amount) {
        accountBalance += amount;
        return accountBalance;
    }
    public int withdraw(int amount) {
        accountBalance -= amount;
        return accountBalance;
    }
    @Override
    public String toString() {
        return ("\nAccount number: " + accountNumber + "\nCurrent balance: " + accountBalance);
    }
}
