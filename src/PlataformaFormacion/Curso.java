package PlataformaFormacion;

public abstract class Curso {
    private String title;
    private String area;
    private int baseLevel;

    public Curso (String title, String area, int baseLevel) {
        cursoValidation(title, area, baseLevel);
        this.title = title;
        this.area = area;
        this.baseLevel = baseLevel;
    }
    private void cursoValidation(String title, String area, int baseLevel) {
        titleValidation(title);
        areaValidation(area);
        baseLevelValidation(baseLevel);
    }
    private void titleValidation(String title) {
        if (title == null)
            throw new IllegalArgumentException("The title can't be null");
        if (title.isBlank())
            throw new IllegalArgumentException("The title can't be empty");
    }
    private void areaValidation(String area) {
        if (area == null)
            throw new IllegalArgumentException("The area can't be null");
        if (area.isBlank())
            throw new IllegalArgumentException("The area can't be empty");
    }
    private void baseLevelValidation(int baseLevel) {
        if (baseLevel < 0 || baseLevel > 100)
            throw new IllegalArgumentException("The base level has to be between 0 and 100");

    }
    public abstract int getTotalLevel();

    public String getTitle() {
        return title;
    }

    public String getArea() {
        return area;
    }

    public int getBaseLevel() {
        return baseLevel;
    }

    @Override
    public String toString() {
        return "Curso" +
                " title:'" + getTitle() + '\'' +
                " area:'" + getArea() + '\'' +
                " baseLevel:" + getBaseLevel();
    }
}
