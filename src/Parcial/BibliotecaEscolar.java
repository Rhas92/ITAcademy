package Parcial;

import java.util.ArrayList;
import java.util.List;

public class BibliotecaEscolar {
    public static void main(String[] args) {
        List<String> actividades = new ArrayList<>(List.of(
           "Club de lectura", "Taller de Dibujo", "Cuentacuentos",
           "Concurso de poesía", "Intercambio de libros", "Taller de ajedrez",
           "Teatro escolar", "Rincón de escritura"
        ));

        List<Integer> duracion = new ArrayList<>(List.of(
               40, 35, 20, 50, 25, 30, 60, 45
        ));
        List<Integer> inscritos = new ArrayList<>(List.of(18, 12, 25, 10, 20, 16, 14, 22));
        int maxDuracion = 40;
        int minInscritos = 15;
        int umbralParticipacionAlta = 22;
        System.out.println(filtrarActividadesAdecuadas( actividades, duracion,
                inscritos, maxDuracion, minInscritos));
        System.out.println(obtenerActividadMasCorta(actividades, duracion));
        System.out.println(existeParticipacionAlta(inscritos, umbralParticipacionAlta));
        System.out.println(contarActividadesLargas(duracion,maxDuracion));
        System.out.println(promedioInscritos(inscritos));
    }

    /**
     * Metodo que retorna una lista con las actividades que tienen una duracion superior o igual a maxDuración
       asi como una cantidad de inscritos superior o igual a minInscritos.
     *
     * @param actividades lista con todas las actividades.
     * @param duracion lista con la duración de cada actividad.
     * @param inscritos lista con la cantidad de inscritos en cada actividad.
     * @param maxDuracion duración máxima permitida.
     * @param minInscritos cantidad mínima de inscritos para las actividades.
     * @throws IllegalArgumentException si:
     * - Alguna lista es null .
     * - Las listas que se comparan entre sí no tienen la misma longitud.
     * - Ninguna lista puede estar vacía cuando el metodo necesite datos para devolver un
         resultado.
     * - En actividades no puede haber null
     * @return nueva lista con actividades que cumplan los parametros.
     */
    static List<String> filtrarActividadesAdecuadas( List<String> actividades, List<Integer> duracion,
                                                     List<Integer> inscritos, int maxDuracion, int minInscritos) {
        if (actividades == null || duracion == null || inscritos == null) {
            throw new IllegalArgumentException("Ninguna lista puede ser null");
        }
        else if (actividades.size() != duracion.size() || actividades.size() != inscritos.size() || inscritos.size() != duracion.size()) {
            throw new IllegalArgumentException("Las listas que se comparan entre sí deben tener la misma longitud.");
        }
        else if (actividades.isEmpty() || duracion.isEmpty() || inscritos.isEmpty()) {
            throw new IllegalArgumentException("Las listas que se comparan entre sí deben tener la misma longitud.");
        }
        List<String> actividadesAdecuadas = new ArrayList<>();
        for (int i = 0; i < actividades.size(); i++) {
            if (actividades.get(i) == null)
                throw new IllegalArgumentException("En actividades no puede haber null");
            if (duracion.get(i) <= maxDuracion && inscritos.get(i) >= minInscritos) {
                actividadesAdecuadas.add(actividades.get(i));
            }
        }
        return actividadesAdecuadas;
    }
    /**
     * Metodo que retorna la actividad de la lista con la menor duración.
     *
     * @param actividades lista con todas las actividades.
     * @param duracion lista con la duración de cada actividad.
     * @throws IllegalArgumentException si:
     * -Alguna lista es null
     * -Las listas que se comparan entre si no tienen la misma longitud
     * -Alguna lista está vacía
     * -En actividades hay un null
     *
     * @return nueva lista con actividades que cumplan los parametros.
     */
    static String obtenerActividadMasCorta(List<String> actividades, List<Integer> duracion) {
        if (actividades == null || duracion == null) {
            throw new IllegalArgumentException("Ninguna lista puede ser null");
        }
        else if (actividades.size() != duracion.size()) {
            throw new IllegalArgumentException("Las listas que se comparan entre sí deben tener la misma longitud.");
        }
        else if (actividades.isEmpty() || duracion.isEmpty()) {
            throw new IllegalArgumentException("Ninguna lista puede estar vacía cuando el método necesite datos para devolver un resultado.");
        }
        String actividadMasCorta = "";
        int temp = duracion.getFirst();
        for (int i = 0; i < actividades.size(); i++) {
            if (actividades.get(i) == null)
                throw new IllegalArgumentException("En actividades no puede haber null");
            if(duracion.get(i) <= temp) {
                actividadMasCorta = actividades.get(i);
                temp = duracion.get(i);
            }
        }
        return actividadMasCorta;
    }
    /**
     * Metodo que retorna true si en la lista de actividades hay una actividad con un umbral de participación alto.
     *
     * @param inscritos lista con la cantidad de inscritos en cada actividad.
     * @param umbralParticipacionAlta entero con el umbral para considerar la participacion alta.
     * @throws IllegalArgumentException si:
     * -La lista es null
     * -La lista está vacía
     *
     * @return boolean true si hay una actividad que cumple con el requisito.
     */
    static boolean existeParticipacionAlta(List<Integer> inscritos, int umbralParticipacionAlta) {
        if (inscritos == null) {
            throw new IllegalArgumentException("Ninguna lista puede ser null");
        }
        else if (inscritos.isEmpty()) {
            throw new IllegalArgumentException("Ninguna lista puede estar vacía cuando el método necesite datos para devolver un resultado.");
        }

        boolean participacionAlta = false;

        for (Integer inscrito : inscritos) {
            if (inscrito >= umbralParticipacionAlta) {
                participacionAlta = true;
                return participacionAlta;
            }
        }
        return participacionAlta;
    }
    /**
     * Metodo que retorna la cantidad de actividades que tienen una duración estrictamente superior a 40 minutos.
     *
     * @param duracion lista con la duración de cada actividad.
     * @param maxDuracion entero con el umbral para considerar una actividad larga.
     *
     * @return entero que indica la cantidad de actividades largas.
     */
    static int contarActividadesLargas(List<Integer> duracion, int maxDuracion) {
        if (duracion == null) {
            throw new IllegalArgumentException("Ninguna lista puede ser null");
        }
        else if (duracion.isEmpty()) {
            throw new IllegalArgumentException("Ninguna lista puede estar vacía cuando el método necesite datos para devolver un resultado.");
        }
        int actividadesLargas = 0;
        for (Integer duracionAct : duracion) {
            if (duracionAct > maxDuracion)
                actividadesLargas += 1;
        }
        return actividadesLargas;
    }
    /**
     * Metodo que retorna el promedio de inscritos en todas las actividades.
     *
     * @param inscritos lista con la cantidad de inscritos en cada actividad.
     * @throws IllegalArgumentException si:
     *      * -La lista es null
     *      * -La lista está vacía
     * @return entero que indica el promedio de inscritos.
     */
    static int promedioInscritos(List<Integer> inscritos) {
        if (inscritos == null) {
            throw new IllegalArgumentException("Ninguna lista puede ser null");
        }
        else if (inscritos.isEmpty()) {
            throw new IllegalArgumentException("Ninguna lista puede estar vacía cuando el método necesite datos para devolver un resultado.");
        }
        int inscritosTotal = 0;
        for (Integer inscritosAct : inscritos){
            inscritosTotal += inscritosAct;
        }
        return (inscritosTotal / inscritos.size());
    }
}
