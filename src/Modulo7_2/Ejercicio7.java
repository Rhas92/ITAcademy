package Modulo7_2;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int year = inputYear(sc);
        System.out.println(isLeap(year));
    }
    public static Integer inputYear(Scanner sc) {
        System.out.println("Please input the year you wish to check");
        int year = sc.nextInt();
        if (year < 0)
            throw new IllegalArgumentException("The year must be AD");
        return year;
    }
    public static String isLeap(int year) {
        if (year % 400 == 0) {
            return("\nThe year " + year + " is a leap year.");
        } else if (year % 4 == 0 && year % 100 != 0) {
            return("\nThe year " + year + " is a leap year.");
        }
        else
            return("\nThe year " + year + " is not a leap year.");
    }
}
