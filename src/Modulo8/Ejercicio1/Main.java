package Modulo8.Ejercicio1;
/**
 * Clase principal para probar la funcionalidad de la clase {@link Ordenador}.
 * <p>
 * Contiene dos métodos de prueba: uno que crea un ordenador con datos básicos
 * (marca y modelo) y otro que crea un ordenador con especificaciones completas,
 * mostrando también la actualización de atributos mediante setters.
 * </p>
 *
 * @author Ramon
 * @version 1.0
 */
public class Main {
    /**
     * Punto de entrada de la aplicación.
     * <p>
     * Ejecuta las pruebas {@link #brandName()} y {@link #fullSpec()} en orden.
     * </p>
     */
    public static void main(String[] args) {
        brandName();
        fullSpec();

    }
    /**
     * Crea un {@link Ordenador} con datos básicos y muestra su marca y modelo.
     * <p>
     * Utiliza el constructor de dos parámetros, dejando el resto de atributos
     * con sus valores por defecto.
     * </p>
     */
    public static void brandName() {
        Ordenador myComputer = new Ordenador("HP", "Pavilion");
        System.out.println("\nMarca: " + myComputer.getMarca());
        System.out.println("\nModelo: " + myComputer.getModelo());


    }
    /**
     * Crea un {@link Ordenador} con especificaciones completas, muestra todos
     * sus atributos y luego los actualiza mediante setters, mostrando el
     * resultado final.
     * <p>
     * Demuestra el uso del constructor completo, los getters individuales,
     * el método {@code toString()} y la modificación de atributos con setters.
     * </p>
     */
    public static void fullSpec() {
        Ordenador myComputer = new Ordenador("HP", "Pavilion", "I5", 8000, 500000);
        System.out.println("\nMarca: " + myComputer.getMarca());
        System.out.println("\nModelo: " + myComputer.getModelo());
        System.out.println("\nProcesador: " + myComputer.getProcesador());
        System.out.println("\nCantidad RAM: " + myComputer.getCantidadRAM() + " MB");
        System.out.println("\nCapacidad Disco Duro: " + myComputer.getCapacidadDiscoDuro() + " MB");
        System.out.println(myComputer);

        myComputer.setProcesador("I7");
        myComputer.setCantidadRAM(16000);
        myComputer.setCapacidadDiscoDuro(1000000);
        System.out.println(myComputer);
    }
}
