package Modulo8.Ejercicio5;

import java.util.Scanner;

public class App {
    Scanner sc = new Scanner(System.in);
    public void exec() {
        Circle one = createCircle();
        Circle two = createCircle();
        System.out.println("\nThe distance between the circle's centers is: " + one.distanceCenters(two) + " cm");
        if(one.equals(two)) {
            System.out.println("\nThe circles are equal.");
        }
        else
            System.out.println("\nThe circles are not equal.");

        if(one.areConcentric(two)) {
            System.out.println("\nThe circles are concentric.");
        }
        else
            System.out.println("\nThe circles are not concentric.");

        if(one.sameRadio(two)) {
            System.out.println("\nThe circles have the same radius.");
        }
        else
            System.out.println("\nThe circles don't have the same radius.");

        if(one.areTangents(two)) {
            System.out.println("\nThe circles are tangents.");
        }
        else
            System.out.println("\nThe circles are not tangents.");

        if(one.areSecant(two)) {
            System.out.println("\nThe circles are secants.");
        }
        else
            System.out.println("\nThe circles are not secants.");

        if(one.dontTouch(two)) {
            System.out.println("\nThe circles dont touch.");
        }
        else
            System.out.println("\nThe circles touch.");
    }
    public Circle createCircle() {
        System.out.println("\nPlease enter the positionX of the circle");
        double positionX = sc.nextDouble();
        System.out.println("\nPlease enter the positionY of the circle");
        double positionY = sc.nextDouble();
        Dot center = new Dot(positionX,positionY);
        System.out.println("\nPlease enter the radius of the circle");
        double radius = sc.nextDouble();
        return new Circle(center,radius);
    }
}
