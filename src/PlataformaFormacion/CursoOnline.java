package PlataformaFormacion;

import java.util.ArrayList;
import java.util.List;

public class CursoOnline extends Curso {
    List<Modulo> modulos;

    public CursoOnline(String title, String area, int baseLevel, List<Modulo> modulos) {
        super(title, area, baseLevel);
        verifyModulos(modulos);
        verifyTotalWeight(modulos);
        this.modulos = modulos;
    }

    private void verifyModulos(List<Modulo> modulos) {
        if (modulos.isEmpty())
            throw new IllegalArgumentException("Modules list can't be empty");
    }

    public List<Modulo> getModulos() {
        return List.copyOf(modulos);
    }
    private void verifyTotalWeight(List<Modulo> modulos) {
        int totalWeight = 0;
        for (Modulo modulo : modulos)
            totalWeight += modulo.getWeight();
        if (totalWeight > 60)
            throw new IllegalArgumentException("ERROR: The online course " + getTitle() + " goes over the maximum permitted limit (60).");
    }
    @Override
    public int getTotalLevel() {
        int totalWeight = 0;
        for (Modulo modulo : modulos)
            totalWeight += modulo.getWeight();
        return getBaseLevel() + totalWeight;
    }

    @Override
    public String toString () {
        return "\nCursoOnline " +
                 super.toString();
    }
}
