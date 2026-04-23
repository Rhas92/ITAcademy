package PlataformaFormacion;

public class Modulo {
    private String name;
    private int weight;

    public Modulo (String name, int weight) {
        verifyModulo(name, weight);
        this.name = name;
        this.weight = weight;
    }
    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }
    private void verifyModulo(String name, int weight) {
        verifyName(name);
        verifyWeight(weight);
    }
    private void verifyName(String name) {
        if (name == null)
            throw new IllegalArgumentException("The name can't be null");
        if (name.isBlank())
            throw new IllegalArgumentException("The name can't be empty");
    }
    private void verifyWeight(int weight) {
        if (weight <= 0)
            throw new IllegalArgumentException("The weight has to be superior to 0.");
    }
    @Override
    public String toString() {
        return " Modulo" +
                " name='" + name + '\'' +
                " weight='" + weight + '\'';
    }
}
