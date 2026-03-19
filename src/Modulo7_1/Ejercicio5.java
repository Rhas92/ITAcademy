package Modulo7_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Aplicacion que funciona como una lista de tareas
 * Debe tener un menu y el usuario debe poder elegir entre las opciones disponibles
 * */
public class Ejercicio5 {
    /**
     * Punto de entrada de la aplicación.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> menu = new ArrayList<>(Arrays.asList(
                "Add Task (1)", "Show tasks (2)", "Delete task (3)", "Exit App (4)"
        ));
        List<String> tasks = new ArrayList<>();
        startApp(menu, tasks, sc);
        sc.close();
    }
    /**
     * Muestra el menú, lee la opción del usuario y ejecuta la acción correspondiente.
     * El bucle continúa hasta que el usuario selecciona la opción 4 (salir).
     *
     * @param menu  lista de opciones a mostrar al usuario
     * @param tasks lista donde se almacenan las tareas
     * @param sc    Scanner utilizado para leer la entrada por consola
     *
     * @throws IllegalArgumentException si el usuario introduce una opción no válida
     */
    static void startApp(List<String> menu, List<String> tasks, Scanner sc) {
        int option = 0;
        while (option != 4) {
            option = displayMenu(menu, sc);
            switch (option) {
                case 1 -> addTask(tasks, sc);
                case 2 -> showTasks(tasks);
                case 3 -> deleteTask(tasks, sc);
                case 4 -> exitApp();
                default -> throw new IllegalArgumentException("\n That option doesn't exist.");
            }
        }
    }
    /**
     * Muestra el menú por pantalla y devuelve la opción elegida por el usuario.
     *
     * @param menu lista de opciones
     * @param sc Scanner para leer input
     * @return número introducido por el usuario
     */
    static Integer displayMenu(List<String> menu, Scanner sc) {
        System.out.println("\nChoose one of the following options (be sure to use the correct number): ");
        for (String option : menu){
            System.out.println(option);
        }
        int userChoice = sc.nextInt();
        sc.nextLine();
        return (userChoice);
    }
    /**
     * Añade una nueva tarea a la lista.
     *
     * @param tasks lista de tareas
     * @param sc Scanner para input del usuario
     */
    static void addTask(List<String> tasks, Scanner sc) {
        System.out.println("\nPlease state the task you want to add: ");
        String newTask = sc.nextLine();
        tasks.add(newTask);
    }
    /**
     * Borra una tarea de la lista.
     *
     * @param tasks lista de tareas
     * @param sc Scanner para input del usuario
     */
    static void deleteTask(List<String> tasks, Scanner sc) {
        if (isTaskEmpty(tasks))
            return;
        System.out.println("\nSelect the task to delete: ");
        int taskDelete = sc.nextInt();
        int correctIndex = taskDelete - 1;
        if (taskDelete < 1 || taskDelete > tasks.size()) {
            System.out.println("\nInvalid task number.");
            return;
        }
        System.out.println("\nYou deleted task (" + taskDelete + ") " + tasks.get(correctIndex));
        tasks.remove(correctIndex);
    }
    /**
     * Muestra todas las tareas con índice.
     *
     * @param tasks lista de tareas
     */
    static void showTasks(List<String> tasks) {
        if (isTaskEmpty(tasks))
            return;
        int i = 1;
        System.out.println("\nThe following tasks are currently in the list: ");
        for (String task : tasks)
            System.out.println(task + " " + "(" + i++ + ")");
    }
    /**
     * Comprueba si la lista de tareas está vacía o es null.
     *
     * @param tasks lista de tareas
     * @return true si está vacía/null, false en caso contrario
     */
    static boolean isTaskEmpty(List<String> tasks) {
        if (tasks == null || tasks.isEmpty()) {
            System.out.println("\nThere are currently no tasks in the list.");
            return true;
        }
        return false;
    }
    /**
     * Muestra mensaje de salida.
     */
    static void exitApp() {
        System.out.println("\nThanks for using the app. Goodbye :).");
    }
}

