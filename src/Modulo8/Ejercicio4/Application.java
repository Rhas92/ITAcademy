package Modulo8.Ejercicio4;

import java.util.ArrayList;
import java.util.Scanner;

public class Application {
    ArrayList<Building> buildings = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    public void execute () {
        int userOption = 1;
        while (userOption != 0) {
            System.out.println("\nWelcome to your Bank App \uD83C\uDFE6." + "\nPlease select an option: ");
            System.out.println("\n(0) Exit App. \uD83D\uDD34" + "\n(1) Add a Building. \uD83D\uDC64" +
                    "\n(2) Display a Building. \uD83D\uDDD1\uFE0F️" + "\n(3) Delete a building. \uD83C\uDFE7");
            System.out.println();
            userOption = sc.nextInt();
            switch (userOption) {
                case 0 -> System.out.println("\nThanks for using the App, goodbye :).");
                case 1 -> addBuilding();
                case 2 -> displayBuilding();
                case 3 -> deleteBuilding();
                default -> System.out.println("\nPlease select a valid option 0-5.");
            }
        }
    }
    public void addBuilding() {
        System.out.println("\nWhat kind of building are you adding?: " + "\n(0) Exit App." +
                            "\n(1) Hotel." + "\n(2) Hospital." + "\n(3) Cinema.");
        int buildingtype = sc.nextInt();
        switch(buildingtype) {
            case 0 -> System.out.println("\nThanks for using the app. Goodbye :)");
            case 1 -> addHotel();
            case 2 -> addHospital();
            case 3 -> addCinema();
            default -> System.out.println("\nPlease select a correct option.");
        }
    }
    public void displayBuilding() {
        for (int i = 0; i < buildings.size(); i++) {
            if (buildings.get(i) instanceof Hotel hot) {
                hot.clean();
                hot.securityCost();
                hot.roomService();
            }
            else if (buildings.get(i) instanceof Hospital hop) {
                hop.clean();
                hop.securityCost();
                hop.deliverFood();
            }
            else if (buildings.get(i) instanceof Cinema c) {
                c.clean();
                c.securityCost();
                System.out.println("\nHow many people are there in the cinema?");
                int assistants = sc.nextInt();
                System.out.println("\nHow much does a ticket cost?");
                double ticketPrice = sc.nextDouble();
                c.screening(assistants, ticketPrice);
            }
        }
    }
    public void deleteBuilding() {
        System.out.println("\nInput the name of the building you want to delete: ");
        String name = sc.next();
        for(int i = 0; i < buildings.size(); i++) {
            if (name.equals(buildings.get(i).getName())) {
                System.out.println("\nThe building " + name + " has been deleted.");
                buildings.remove(i);
                return;
            }
        }
        System.out.println("\nThe building " + name + " does not exist.");
    }
    public void addHotel() {
        System.out.println("\nEnter the name of the Hotel: ");
        String name = sc.next();
        System.out.println("\nEnter the amount of floors of the Hotel: ");
        int floors = sc.nextInt();
        System.out.println("\nEnter the surface of the Hotel in m²: ");
        int surface = sc.nextInt();
        System.out.println("\nEnter the amount of rooms: ");
        int numRooms = sc.nextInt();
        Hotel h = new Hotel(name, floors, surface, numRooms);
        buildings.add(h);
    }
    public void addHospital() {
        System.out.println("\nEnter the name of the Hospital: ");
        String name = sc.next();
        System.out.println("\nEnter the amount of floors of the Hospital: ");
        int floors = sc.nextInt();
        System.out.println("\nEnter the surface of the Hospital in m²: ");
        int surface = sc.nextInt();
        System.out.println("\nEnter the amount of sick people in the Hospital: ");
        int numSick = sc.nextInt();
        Hospital h = new Hospital(name, floors, surface, numSick);
        buildings.add(h);
    }
    public void addCinema() {
        System.out.println("\nEnter the name of the Cinema: ");
        String name = sc.next();
        System.out.println("\nEnter the amount of floors of the Cinema: ");
        int floors = sc.nextInt();
        System.out.println("\nEnter the surface of the Cinema in m²: ");
        int surface = sc.nextInt();
        System.out.println("\nEnter the maximum capacity of the Cinema: ");
        int maxCapacity = sc.nextInt();
        Cinema c = new Cinema(name, floors, surface, maxCapacity);
        buildings.add(c);
    }
}
