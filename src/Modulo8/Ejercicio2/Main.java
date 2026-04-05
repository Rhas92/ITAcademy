package Modulo8.Ejercicio2;

import Modulo8.Ejercicio1.Ordenador;

import java.util.ArrayList;
import java.util.Scanner;
/**
 * Clase principal de la aplicación de gestión de hoteles.
 * Permite crear, eliminar, consultar y modificar hoteles mediante un menú interactivo.
 */
public class Main {
    /** Lista de hoteles registrados en la aplicación. */
    static ArrayList<Hotel> hotels = new ArrayList<>();
    /** Scanner compartido para la lectura de datos del usuario. */
    static Scanner sc = new Scanner(System.in);

    /**
     * Punto de entrada de la aplicación.
     */
    public static void main(String[] args) {
        startApp();
    }
    /**
     * Inicia la aplicación y muestra el menú principal en bucle
     * hasta que el usuario selecciona la opción de salida (5).
     * Cierra el Scanner al terminar.
     */
    public static void startApp() {
        int userOption = 0;
        while (userOption != 5) {
            System.out.println("\nWelcome to your Hotel Management App \uD83C\uDFE8."
                    + "\nThere are currently " + hotels.size() + " hotels registered on the app"
                    +"\nPlease select an option: ");
            System.out.println("\n(1) Create hotel. ➕" + "\n(2) Delete hotel. ❌" + "\n(3) See hotel. \uD83D\uDC41️" +
                    "\n(4) Modify hotel. ✏️" + "\n(5) Exit App. \uD83D\uDD34");
            System.out.println();
            userOption = sc.nextInt();
            sc.nextLine();
            switch (userOption) {
                case 1 -> crearHotel();
                case 2 -> darDeBajaHotel();
                case 3 -> verHotel();
                case 4 -> modificarHotel();
                case 5 -> {
                    System.out.println("\nThanks for using the App. Goodbye.");
                }
                default -> throw new IllegalArgumentException("\nYou have to select a correct option.");
            }
        }
        sc.close();
    }
    /**
     * Solicita al usuario los datos de un nuevo hotel por teclado,
     * crea el objeto {@link Hotel} y lo añade a la lista de hoteles.
     */
    public static void crearHotel() {
        System.out.println("\nPlease enter the name of the hotel: ");
        String nombre = sc.nextLine();
        System.out.println("\nPlease enter the number of rooms: ");
        int numHabitaciones = sc.nextInt();
        System.out.println("\nPlease enter the number of floors: ");
        int numPlantas = sc.nextInt();
        System.out.println("\nPlease enter the total surface of the hotel: ");
        int superficieTotal = sc.nextInt();
        Hotel newHotel = new Hotel(nombre, numHabitaciones, numPlantas, superficieTotal);
        hotels.add(newHotel);
    }
    /**
     * Solicita el nombre de un hotel y lo elimina de la lista si existe.
     * Muestra un mensaje de confirmación si se elimina correctamente,
     * o un aviso si el hotel no se encuentra.
     */
    public static void darDeBajaHotel() {
        System.out.println("\nPlease enter the name of the hotel you want to delete ❌: ");
        String nombre = sc.nextLine();
        int i = buscarHotel(nombre);
        if (i == -1)
            System.out.println("\nThe hotel is not on the list.");
        else {
                System.out.println("\nThe hotel " + nombre + " has been deleted.");
                hotels.remove(i);
        }
    }
    /**
     * Solicita el nombre de un hotel y muestra su información por pantalla,
     * incluyendo los datos del hotel y el cálculo de mantenimiento.
     * Muestra un aviso si el hotel no se encuentra.
     */
    public static void verHotel() {
        System.out.println("\nPlease enter the name of the hotel you want to see: \uD83D\uDC41️");
        int i = buscarHotel(sc.nextLine());
        if (i == -1)
            System.out.println("\nThe hotel is not on the list.");
        else {
                System.out.println(hotels.get(i));
                hotels.get(i).calcularMantenimiento();
            }
        }
    /**
     * Solicita el nombre de un hotel y permite modificar uno de sus atributos:
     * número de habitaciones, número de plantas o superficie total.
     * Muestra un aviso si el hotel no se encuentra.
     */
    public static void modificarHotel() {
        System.out.println("\nPlease enter the name of the hotel you want to modify: ✏️");
        int i = buscarHotel(sc.nextLine());
        if (i == -1)
            System.out.println("\nThe hotel is not on the list.");
        else {
            int userOption = 0;
            while (userOption < 1 || userOption > 3){
                System.out.println("\nWhat do you want to modify?" + "\n(1) Number of Rooms"
                            + "\n(2) Number of Floors" + "\n(3) Total Surface");
                userOption = sc.nextInt();
                switch (userOption) {
                    case 1 -> {
                        System.out.println("\nEnter the new number of rooms: ");
                        int numHabitaciones = sc.nextInt();
                        hotels.get(i).setNumHabitaciones(numHabitaciones);
                        System.out.println("\nThe new number of rooms is: " + hotels.get(i).getNumHabitaciones());
                    }
                    case 2 -> {
                        System.out.println("\nEnter the new number of floors: ");
                        int numPlantas = sc.nextInt();
                        hotels.get(i).setNumPlantas(numPlantas);
                        System.out.println("\nThe new number of floors is: " + hotels.get(i).getNumPlantas());
                    }
                    case 3 -> {
                        System.out.println("\nEnter the new total surface: ");
                        int superficieTotal = sc.nextInt();
                        hotels.get(i).setSuperficieTotal(superficieTotal);
                        System.out.println("\nThe new total surface is: " + hotels.get(i).getSuperficieTotal());
                    }
                    default -> {
                        System.out.println("\nNothing was modified.");
                        return;
                    }
                }
            }
        }
    }
    /**
     * Busca un hotel en la lista por su nombre.
     *
     * @param nombre el nombre del hotel a buscar
     * @return el índice del hotel en la lista, o {@code -1} si no se encuentra
     */
    public static int buscarHotel(String nombre) {
        for (int i = 0; i < hotels.size(); i++) {
            if (nombre.equals(hotels.get(i).getNombre())) {
                return i;
            }
        }
        return -1; // no encontrado
    }
}

