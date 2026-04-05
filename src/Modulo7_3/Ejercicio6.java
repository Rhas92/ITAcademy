package Modulo7_3;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numsToAdd = userInput(sc);
        ArrayList<Integer> nums = fillArray(sc, new ArrayList<>(), numsToAdd);
        ArrayList<Integer> newList = deleteDuplicates(new ArrayList<>(), nums);
        System.out.println();
        for (Integer num : newList)
            System.out.println(num);
    }
    public static int userInput(Scanner sc) {
        System.out.println("\nPlease input the amount of numbers you will enter in the list: ");
        System.out.println();
        return (sc.nextInt());
    }
    public static ArrayList<Integer> fillArray(Scanner sc, ArrayList<Integer> nums, int numsToadd) {
        System.out.println("\nYou will input " + numsToadd + " numbers.");
        for (int i = 0; i < numsToadd; i++) {
            System.out.println("\nInput a number: ");
            System.out.println();
            nums.add(sc.nextInt());
        }
        return (nums);
    }
    public static ArrayList<Integer> deleteDuplicates(ArrayList<Integer> newList, ArrayList<Integer> nums) {
        for (Integer num : nums) {
            if (!newList.contains(num))
                newList.add(num);
        }
        return (newList);
    }
}
