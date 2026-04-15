package Modulo8.Ejercicio1;
/**
 * Representa un ordenador con sus especificaciones técnicas principales.
 * <p>
 * Permite crear instancias con datos básicos (marca y modelo) o con
 * especificaciones completas. Los atributos de hardware (procesador, RAM
 * y disco duro) son modificables mediante setters.
 * </p>
 *
 * @author Ramon
 * @version 1.0
 */
public class Ordenador {
    private String marca;
    private String modelo;
    private String procesador;
    private int cantidadRAM;
    private double capacidadDiscoDuro;
    /**
     * Constructor básico. Crea un ordenador con marca y modelo.
     * <p>
     * Los atributos {@code procesador}, {@code cantidadRAM} y
     * {@code capacidadDiscoDuro} quedan con sus valores por defecto
     * ({@code null}, {@code 0} y {@code 0.0} respectivamente).
     * </p>
     *
     * @param marca  marca del ordenador
     * @param modelo modelo del ordenador
     */
    public Ordenador(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
    /**
     * Constructor completo. Crea un ordenador con todas sus especificaciones.
     *
     * @param marca               marca del ordenador
     * @param modelo              modelo del ordenador
     * @param procesador          tipo de procesador
     * @param cantidadRAM         cantidad de RAM en megabytes
     * @param capacidadDiscoDuro  capacidad del disco duro en megabytes
     */
    public Ordenador(String marca, String modelo, String procesador, int cantidadRAM, double capacidadDiscoDuro) {
        validacionOrdenador(marca, modelo, procesador, cantidadRAM, capacidadDiscoDuro);
        this.marca = marca;
        this.modelo = modelo;
        this.procesador = procesador;
        this.cantidadRAM = cantidadRAM;
        this.capacidadDiscoDuro = capacidadDiscoDuro;
    }

    /**
     * Método para validar los parametros del constructor
     * @param marca
     * @param modelo
     * @param procesador
     * @param cantidadRAM
     * @param capacidadDiscoDuro
     */
    private void validacionOrdenador(String marca, String modelo, String procesador, int cantidadRAM, double capacidadDiscoDuro) {
        if (marca == null || marca.isBlank())
            throw new IllegalArgumentException("La marca no puede estar vacía.");
        if (modelo == null || modelo.isBlank())
            throw new IllegalArgumentException("El modelo no puede estar vacío.");
        if (procesador == null || procesador.isBlank())
            throw new IllegalArgumentException("El procesador no puede estar vacío.");
        if (cantidadRAM < 2000)
            throw new IllegalArgumentException("La cantidad de RAM debe ser mayor o igual a 2000MB.");
        if (capacidadDiscoDuro < 200)
            throw new IllegalArgumentException("La cantidad del disco duro debe ser mayor o igual a 200MB.");
    }
    /**
     * Devuelve la marca del ordenador.
     *
     * @return marca del ordenador
     */
    public String getMarca() {
        return marca;
    }
    /**
     * Devuelve el modelo del ordenador.
     *
     * @return modelo del ordenador
     */
    public String getModelo() {
        return modelo;
    }
    /**
     * Devuelve el procesador del ordenador.
     *
     * @return procesador del ordenador, o {@code null} si no fue especificado
     */
    public String getProcesador() {
        return procesador;
    }
    /**
     * Devuelve la cantidad de RAM en megabytes.
     *
     * @return cantidad de RAM en MB
     */
    public int getCantidadRAM() {
        return cantidadRAM;
    }
    /**
     * Devuelve la capacidad del disco duro en megabytes.
     *
     * @return capacidad del disco duro en MB
     */
    public double getCapacidadDiscoDuro() {
        return capacidadDiscoDuro;
    }
    /**
     * Establece el procesador del ordenador.
     *
     * @param procesador nuevo procesador (ej: "I7", "Ryzen 5")
     */
    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }
    /**
     * Establece la cantidad de RAM del ordenador.
     *
     * @param cantidadRAM nueva cantidad de RAM en megabytes
     */
    public void setCantidadRAM(int cantidadRAM) {
        this.cantidadRAM = cantidadRAM;
    }
    /**
     * Establece la capacidad del disco duro del ordenador.
     *
     * @param capacidadDiscoDuro nueva capacidad del disco duro en megabytes
     */
    public void setCapacidadDiscoDuro(double capacidadDiscoDuro) {
        this.capacidadDiscoDuro = capacidadDiscoDuro;
    }
    /**
     * Simula la ejecución de un programa en el ordenador.
     *
     * @param programa nombre del programa a ejecutar
     * @return mensaje indicando el programa que se está ejecutando
     */
    public String ejecutar(String programa) {
        return ("\nEn este momento se está ejecutando: " + programa);
    }
    /**
     * Devuelve una representación en texto del ordenador con todas sus
     * especificaciones en una sola línea.
     *
     * @return cadena con marca, modelo, procesador, RAM y capacidad de disco
     */
    public String toString() {
        return ("\nMarca: " + marca + " | Modelo: " + modelo + " | Procesador: " + procesador + " | RAM: " + cantidadRAM + " | Capacidad Disco Duro (MB): " + capacidadDiscoDuro);
    }
}
