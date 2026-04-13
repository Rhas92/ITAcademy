package Modulo8.Ejercicio6;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    ArrayList<Pilot> pilots = new ArrayList<>();
    ArrayList<Mecanic> mecanics = new ArrayList<>();
    ArrayList<Scuderia> scuderias = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void execute() {
        initData();
        int userOption = 1;
        while (userOption != 0) {
            System.out.println("\nWelcome to your Suderia Management App \uD83C\uDFC1." + "\nPlease select an option: ");
            System.out.println("\n(0) Exit App. \uD83D\uDD34" + "\n(1) Add a Worker. ➕" +
                    "\n(2) Delete a Worker. \uD83D\uDDD1\uFE0F" + "\n(3) See all info. \uD83D\uDC41️");
            System.out.println();
            userOption = sc.nextInt();
            switch (userOption) {
                case 0 -> System.out.println("\nThanks for using the App, goodbye :).");
                case 1 -> addWorker();
                case 2 -> deleteWorker();
                case 3 -> seeInfo();
                default -> System.out.println("\nPlease select a valid option 0-3.");
            }
        }
    }
    public void initData() {
        Scuderia ferrari = new Scuderia("Ferrari", 200000000, "Italy");
        Scuderia mclaren = new Scuderia("Mclaren", 150000000, "England");
        ferrari.addCar(new Car(1000, 350, "Red", 1500000));
        ferrari.addCar(new Car(1300, 380, "Red", 1800000));
        mclaren.addCar(new Car(900, 340, "Papaya", 1300000));
        mclaren.addCar(new Car(100, 350, "Silver", 1600000));
        scuderias.add(ferrari);
        scuderias.add(mclaren);
    }
    public void addWorker() {
        System.out.println("\nWhat kind of worker do you want to add: " + "\n(1) Pilot" + "\n(2) Mecanic");
        int userInput = sc.nextInt();
        switch (userInput) {
            case 1 -> addPilot();
            case 2 -> addMecanic();
            default -> System.out.println("\nPlease choose a valid option 1-2.");
        }
    }
    /// String name, String lastName, int age, int yearsInTeam, double height, double weight
    public void addPilot() {
        System.out.println("\nPlease enter the first name of the pilot: ");
        String pilotName = sc.next();
        System.out.println("\nPlease enter the last name of the pilot: ");
        String pilotLastName = sc.next();
        System.out.println("\nPlease enter the age of the pilot: ");
        int age = sc.nextInt();
        System.out.println("\nPlease enter the amount of years the pilot has been on the team: ");
        int yearsInTeam = sc.nextInt();
        System.out.println("\nPlease enter the pilot's height: ");
        double height = sc.nextDouble();
        System.out.println("\nPlease enter the pilot's weight: ");
        double weight = sc.nextDouble();
        Pilot p = new Pilot(pilotName, pilotLastName, age, yearsInTeam, height, weight);
        pilots.add(p);
    }
    /// String name, String lastName, int age, int yearsInTeam, boolean hasStudies
    public void addMecanic() {
        System.out.println("\nPlease enter the first name of the mecanic: ");
        String pilotName = sc.next();
        System.out.println("\nPlease enter the last name of the mecanic: ");
        String pilotLastName = sc.next();
        System.out.println("\nPlease enter the age of the mecanic: ");
        int age = sc.nextInt();
        System.out.println("\nPlease enter the amount of years the mecanic has been on the team: ");
        int yearsInTeam = sc.nextInt();
        int userInput = 0;
        boolean hasStudies = false;
        while (userInput != 1 && userInput != 2) {
            System.out.println("\nDoes the Mecanic have higher studies?" + "\n(1) Yes" + "\n(2) No");
            userInput = sc.nextInt();
            if (userInput == 1) {
                hasStudies = true;
            } else if (userInput != 2) {
                System.out.println("\nPlease choose a valid option 1-2.");
            }
        }
        Mecanic m = new Mecanic(pilotName, pilotLastName, age, yearsInTeam, hasStudies);
        mecanics.add(m);
    }
    public void deleteWorker() {
        System.out.println("\nWhat kind of worker do you want to delete: " + "\n(1) Pilot" + "\n(2) Mecanic");
        int userInput = sc.nextInt();
        switch (userInput) {
            case 1 -> deletePilot();
            case 2 -> deleteMecanic();
            default -> System.out.println("\nPlease choose a valid option 1-2.");
        }
    }
    public void deletePilot() {
        System.out.println("\nEnter the first name of the pilot you want to delete: ");
        String name = sc.next();
        System.out.println("\nEnter the last name of the pilot you want to delete: ");
        String lastName = sc.next();
        for (int i = 0; i < pilots.size(); i++) {
            if (name.equals(pilots.get(i).getName()) && lastName.equals(pilots.get(i).getLastName())) {
                System.out.println("\nThe pilot " + name + " " + lastName + " has been deleted.");
                pilots.remove(i);
                return;
            }
        }
        System.out.println("\nThat pilot doesn't exits.");
    }
    public void deleteMecanic() {
        System.out.println("\nEnter the first name of the mecanic you want to delete: ");
        String name = sc.next();
        System.out.println("\nEnter the last name of the mecanic you want to delete: ");
        String lastName = sc.next();
        for (int i = 0; i < mecanics.size(); i++) {
            if (name.equals(mecanics.get(i).getName()) && lastName.equals(mecanics.get(i).getLastName())) {
                System.out.println("\nThe mecanic " + name + " " + lastName + " has been deleted.");
                mecanics.remove(i);
                return;
            }
        }
        System.out.println("\nThat mecanic doesn't exits.");
    }
    public void seeInfo() {
        for (Scuderia scuderia : scuderias) {
            System.out.println(scuderia);
            for (Car car : scuderia.getCars()) {
                System.out.println(car);
            }
        }

        for (Mecanic mecanic : mecanics) {
            System.out.println(mecanic);
        }
        for (Pilot pilot : pilots) {
            System.out.println(pilot);
        }

    }
}
