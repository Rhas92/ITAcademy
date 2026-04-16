package Modulo8.Ejercicio3;

public class Account {
    private int accountNumber;
    private int accountBalance;

    public Account(int accountNumber) {
        verifyAccount(accountNumber);
        this.accountNumber = accountNumber;
        this.accountBalance = 0;
    }
    private void verifyAccount(int accountNumber) {
        if (accountNumber < 1000000) {
            throw new IllegalArgumentException("El account number must be superior to 1000000");
        }
    }
    public int getAccountNumber() {
        return accountNumber;
    }
    public int getAccountBalance() {
        return accountBalance;
    }

    public void setAccountNumber(int accountNumber) {
        verifyAccount(accountNumber);
        this.accountNumber = accountNumber;
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
