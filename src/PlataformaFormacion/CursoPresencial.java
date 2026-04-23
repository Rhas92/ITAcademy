package PlataformaFormacion;

public class CursoPresencial extends Curso {
    int hours;
    String evaluation;

    public CursoPresencial (String title, String area, int baseLevel, int hours, String evaluation) {
        super(title, area, baseLevel);
        verifyCursoPresencial(hours, evaluation);
        this.hours = hours;
        this.evaluation = evaluation;
    }
    private void verifyCursoPresencial(int hours, String evaluation) {
        validateHours(hours);
        validateEvaluation(evaluation);
    }
    private void validateHours(int hours) {
        if (hours < 0)
            throw new IllegalArgumentException("Hours must be positive.");
    }
    private void validateEvaluation(String evaluation) {
        String evaluationCopy = evaluation.toLowerCase();
        if (!evaluation.equalsIgnoreCase("Exam") && !evaluation.equalsIgnoreCase("Project"))
            throw new IllegalArgumentException("Evaluation must be either Exam or Project");
    }

    public int getHours() {
        return hours;
    }

    public String getEvaluation() {
        return evaluation;
    }

    @Override
    public int getTotalLevel() {
        int totalLevel = 0;
        if (hours < 20)
            totalLevel += 5;
        else
            totalLevel += 10;
        if (evaluation.equalsIgnoreCase("Exam"))
            totalLevel += 5;
        else
            totalLevel += 10;
        return totalLevel;
    }

    @Override
    public String toString() {
        return "\nCursoPresencial " + super.toString() +
                " hours=" + hours +
                ", evaluation='" + evaluation + '\'';
    }
}
