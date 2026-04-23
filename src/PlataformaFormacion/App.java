package PlataformaFormacion;

import java.util.List;

public class App {
    public void execute() {
        PlataformaFormacion p = new PlataformaFormacion("Plataforma 2026");

        Curso c1 = new CursoPresencial(
                "Java Básico",
                "Programación",
                50,
                25,
                "EXAM"
        );
        Curso c2 = new CursoPresencial(
                "Php Básico",
                "Programación",
                50,
                25,
                "EXAM"
        );
        List<Modulo> mods1 = List.of(
                new Modulo("Introducción", 10),
                new Modulo("Parcial", 5),
                new Modulo("Proyecto final", 20)
        );
        List<Modulo> mods2 = List.of(
                new Modulo("Introducción", 10),
                new Modulo("Parcial", 1),
                new Modulo("Proyecto final", 30)
        );

        Curso c3 = new CursoOnline(
                "Arquitectura",
                "Arquitectura",
                40,
                mods1
        );
        Curso c4 = new CursoOnline(
                "Ingenieria",
                "Ingenieria",
                40,
                mods2
        );

        p.registerCourse(c1);
        p.registerCourse(c2);
        p.registerCourse(c3);
        p.registerCourse(c4);

        System.out.println(p);

        System.out.println("\nNivel total: " + p.calculateTotalLevel());

        Curso masCompleto = p.obtainMostCompleteCourse();
        System.out.println("\nMás completo: " + masCompleto.getTitle()
                + " (Nivel TOTAL = " + masCompleto.getTotalLevel() + ")");
        System.out.println("\nEXTRA: Módulos online del área 'Arquitectura':");
        p.listModulesOnline("Arquitectura");
        System.out.println("\nEXTRA: Módulos online del área 'Ingenieria':");
        p.listModulesOnline("Ingenieria");
    }
}
