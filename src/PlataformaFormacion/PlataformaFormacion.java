package PlataformaFormacion;

import java.util.ArrayList;
import java.util.List;

public class PlataformaFormacion {
    private String name;
    private List<Curso> cursos;

    public PlataformaFormacion(String name) {
        verifyName(name);
        this.name = name;
        this.cursos = new ArrayList<>();
    }
    private void verifyName(String name) {
        if (name == null)
            throw new IllegalArgumentException("The name can't be null");
        if (name.isBlank())
            throw new IllegalArgumentException("The name can't be empty");
    }
    public String getName() {
        return name;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public void registerCourse(Curso c) {
        for (Curso curso : cursos){
            if ((curso.getTitle().equals(c.getTitle())))
                throw new IllegalArgumentException("There is already a course with that name");
        }
        cursos.add(c);
    }
    public int calculateTotalLevel() {
        int total = 0;
        for (Curso curso : cursos){
            total += curso.getTotalLevel();
        }
        return total;
    }
    public Curso obtainMostCompleteCourse() {
        Curso completeCourse = cursos.getFirst();
        for (Curso curso : cursos){
            if(curso.getTotalLevel() > completeCourse.getTotalLevel())
                completeCourse = curso;
        }
        return completeCourse;
    }
    public void listModulesOnline(String area) {
        for (Curso curso : cursos) {
            if (curso instanceof CursoOnline cursoOnline && curso.getArea().equals(area)) {
                System.out.println(curso.getTitle() + ":");
                for (Modulo modulo : cursoOnline.getModulos()) {
                    System.out.println("- " + modulo.getName() + " (+" + modulo.getWeight() + ")");
                }
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name).append("\n");
        for (Curso curso : cursos) {
            sb.append(curso.toString()).append("\n");
        }
        return sb.toString();
    }
}
