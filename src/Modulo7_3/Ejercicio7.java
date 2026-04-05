package Modulo7_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> menu = new ArrayList<>(Arrays.asList(
                "\n(1) — \uD83C\uDFC4 **Surf Board Material**",
                "\n(2) — \uD83C\uDF0A **Print Forecast**",
                "\n(3) — \uD83D\uDCB0 **Assess cost for reservation**",
                "\n(4) — \uD83D\uDEAA **Exit App**"
        ));

        startApp(menu, sc);
        sc.close();
    }
    static public void startApp(List<String> menu, Scanner sc) {
        int option = 0;
        boolean hasExperience = hasExperience(sc);
        int reservationTime = reservationTime(sc);
        while(option != 4) {
            option = displayMenu(menu, sc);
            switch(option) {
                case 1 -> boardMaterial(sc, hasExperience);
                case 2 -> printForecast(sc);
                case 3 -> assessCost(reservationTime, hasExperience);
                case 4 -> exitApp();
                default -> throw new IllegalArgumentException("\n That option doesn't exist.");
            }
        }
    }
    static public Integer displayMenu(List<String> menu, Scanner sc) {
        System.out.println("\nChoose one of the following options (be sure to use the correct number 1-4): ");
        for(String option : menu){
            System.out.println(option);
        }
        int userChoice = sc.nextInt();
        sc.nextLine();
        return (userChoice);
    }
    static public boolean hasExperience(Scanner sc) {
        System.out.println("\nDo you have experience surfing? Enter 1 if yes, 2 if no");
        System.out.println();
        if(sc.nextInt() == 1){
            return true;
        }
        else if(sc.nextInt() == 2){
            return false;
        }
        else
            throw new IllegalArgumentException("You must select a correct option (1) or (2).");
    }
    static public int reservationTime(Scanner sc) {
        System.out.println("\nHow long will your reservation be in minutes: ");
        System.out.println();
        return sc.nextInt();
    }

    static public void boardMaterial(Scanner sc, boolean hasExperience) {
        if(hasExperience)
            System.out.println("\nFiber Board.");
        else
            System.out.println("\nFoam Board.");
    }
    static public void printForecast(Scanner sc) {
        System.out.println("\nInput the size of the waves in meters: ");
        System.out.println();
        int waveHeight = sc.nextInt();
        if(waveHeight > 2)
            System.out.println("\n⚠️ Big waves");
        else
            System.out.println("\n✅ Small waves.");
    }

    static public void assessCost(int reservationTime, boolean hasExperience) {
        int fiberPriceHour = 35;
        int foamPriceHour = 25;
        int hour = 60;
        if(hasExperience && (reservationTime >= hour)) {
            System.out.println("\nFiber board + " + reservationTime + " minutes = " + ((reservationTime / hour) * fiberPriceHour));
        }
        else if (hasExperience){
            System.out.println("\nFiber board + " + reservationTime + " minutes = " + ((int)(Math.ceil((double) reservationTime / hour) * fiberPriceHour)));
        }
        if (!hasExperience && (reservationTime >= hour)) {
            System.out.println("\nFoam board + " + reservationTime + " minutes = " + ((reservationTime / hour) * foamPriceHour));
        }
        else if (!hasExperience){
            System.out.println("\nFoam board + " + reservationTime + " minutes = " + ((int)(Math.ceil((double) reservationTime / hour) * foamPriceHour)));
        }

    }
    static public void exitApp() {
        System.out.println("\nThanks for using the app. Goodbye :).");
    }
}
