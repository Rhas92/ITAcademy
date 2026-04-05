package Modulo8.Ejercicio2;
/**
 * Representa un hotel con sus características principales.
 * Permite calcular el personal y coste de mantenimiento necesarios.
 */
public class Hotel {
    String nombre; /** Nombre del hotel. */
    int numHabitaciones;
    int numPlantas;
    int superficieTotal; /** Superficie total del hotel en metros cuadrados. */

    /**
     * Constructor que inicializa todos los atributos del hotel.
     *
     * @param nombre          nombre del hotel
     * @param numHabitaciones número de habitaciones
     * @param numPlantas      número de plantas
     * @param superficieTotal superficie total en m²
     */
    public Hotel(String nombre, int numHabitaciones, int numPlantas, int superficieTotal) {
        this.nombre = nombre;
        this.numHabitaciones = numHabitaciones;
        this.numPlantas = numPlantas;
        this.superficieTotal = superficieTotal;
    }
    /**
     * Devuelve el nombre del hotel.
     *
     * @return nombre del hotel
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Devuelve el número de habitaciones del hotel.
     *
     * @return número de habitaciones
     */
    public int getNumHabitaciones() {
        return numHabitaciones;
    }
    /**
     * Devuelve el número de plantas del hotel.
     *
     * @return número de plantas
     */
    public  int getNumPlantas() {
        return numPlantas;
    }
    /**
     * Devuelve la superficie total del hotel.
     *
     * @return superficie total en m²
     */
    public int getSuperficieTotal() {
        return superficieTotal;
    }
    /**
     * Establece el nombre del hotel.
     *
     * @param nombre nuevo nombre del hotel
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Establece el número de habitaciones del hotel.
     *
     * @param numHabitaciones nuevo número de habitaciones
     */
    public void setNumHabitaciones(int numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }
    /**
     * Establece el número de plantas del hotel.
     *
     * @param numPlantas nuevo número de plantas
     */
    public void setNumPlantas(int numPlantas) {
        this.numPlantas = numPlantas;
    }
    /**
     * Establece la superficie total del hotel.
     *
     * @param superficieTotal nueva superficie total en m²
     */
    public void setSuperficieTotal(int superficieTotal) {
        this.superficieTotal = superficieTotal;
    }
    /**
     * Calcula y muestra el número de empleados necesarios para el servicio de habitaciones
     * y el coste mensual total asociado.
     * Cada empleado puede atender un máximo de 20 habitaciones y cobra 1.500 € al mes.
     */
    public void calcularMantenimiento() {
        double personas = Math.ceil((double) numHabitaciones / 20);
        System.out.println("\nYou'll need " + personas + " employees to service the hotel");
        double costeTotal = personas * 1500;
        System.out.println("\nTotal cost: " + costeTotal + " €.");
    }
    /**
     * Devuelve una representación en texto del hotel con sus datos principales.
     *
     * @return cadena con nombre, habitaciones, plantas y superficie del hotel
     */
    @Override
    public String toString() {
        return ("\nName: " + nombre + "\nNumber of rooms: " + numHabitaciones
                + "\nNumber of floors: " + numPlantas + "\nTotal surface: " + superficieTotal + " m²");
    }
}
