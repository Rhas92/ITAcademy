package Modulo8.Ejercicio3;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Application {
    ArrayList<Client> clients = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    public void execute () {
        int userOption = 1;
        while (userOption != 0) {
            System.out.println("\nWelcome to your Bank App \uD83C\uDFE6." + "\nPlease select an option: ");
            System.out.println("\n(0) Exit App. \uD83D\uDD34" + "\n(1) Create clients. \uD83D\uDC64" +
                    "\n(2) Delete clients. \uD83D\uDDD1\uFE0F️" + "\n(3) Create clients account. \uD83C\uDFE7"
                    + "\n(4) Deposit in a clients account. \uD83D\uDCB0"
                    + "\n(5) Withdraw from a clients account. \uD83D\uDCB8");
            System.out.println();
            userOption = sc.nextInt();
            switch (userOption) {
                case 0 -> System.out.println("\nThanks for using the App, goodbye :).");
                case 1 -> addClient();
                case 2 -> deleteClient();
                case 3 -> createAccount();
                case 4 -> depositAccount();
                case 5 -> withdrawAccount();
                default -> System.out.println("\nPlease select a valid option 0-5.");
            }
        }
    }
    public void addClient() {
        System.out.println("\nEnter the name of the client: ");
        String name = sc.next();
        System.out.println("\nEnter the last name of the client: ");
        String lastName = sc.next();
        Client c = new Client(name,lastName);
        clients.add(c);
    }
    public void deleteClient() {
        int i = searchClient();
        if(i != -1) {
            System.out.println("\nThe client has been deleted.");
            clients.remove(i);
        }
        else {
            System.out.println("\nThat client doesn't exist.");
        }
    }
    public void createAccount() {
        Random random = new Random();
        int accountNumber = random.nextInt(1000000);
        Account newAccount = new Account(accountNumber);
        int i = searchClient();
        if(i != -1) {
            clients.get(i).addAccount(newAccount);
        }
        else {
            System.out.println("\nThat client doesn't exist.");
        }
    }
    public void depositAccount() {
        int i = searchClient();
        if(i != -1) {
            int j = searchAccount(i);
            if(j != -1) {
                System.out.println("\nPlease enter the amount to deposit: ");
                int amount = sc.nextInt();
                clients.get(i).getAccount(j).deposit(amount);
            }
            else {
                System.out.println("\nChoose a correct account.");
            }
        }
        else {
            System.out.println("\nThat client doesn't exist.");
        }
    }
    public void withdrawAccount() {
        int i = searchClient();
        if(i != -1) {
            int j = searchAccount(i);
            if(j != -1) {
                System.out.println("\nPlease enter the amount to withdraw: ");
                int amount = sc.nextInt();
                clients.get(i).getAccount(j).withdraw(amount);
            }
            else {
                System.out.println("\nChoose a correct account.");
            }
        }
        else {
            System.out.println("\nThat client doesn't exist.");
        }
    }
    public int searchClient() {
        System.out.println("\nEnter the first name of the client: ");
        String name = sc.next();
        System.out.println("\nEnter the last name of the client: ");
        String lastName = sc.next();
        for (int i = 0; i < clients.size(); i++) {
            if (name.equals(clients.get(i).getName()) && lastName.equals(clients.get(i).getLastName())) {
                return i;
            }
        }
        return -1; // no encontrado
    }
    public int searchAccount(int accountIndex) {
        System.out.println("\nSelect an account: ");
        for(int i = 0; i < clients.get(accountIndex).getAccountCount(); i++) {
            System.out.println("(" + (i + 1) + ") " + clients.get(accountIndex).getAccount(i));
        }
        return sc.nextInt() -1;
    }
}
