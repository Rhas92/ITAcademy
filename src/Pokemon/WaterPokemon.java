package Pokemon;

public class WaterPokemon extends Pokemon {
    private int accuracy;

    public WaterPokemon (String name, int level, int health, int accuracy) {
        super(name, level, health);
        this.accuracy = accuracy;
    }

    public int getAccuracy() {
        return accuracy;
    }

    @Override
    public int attack() {
        return getLevel() + accuracy / 5;
    }
    @Override
    public String useSpecialDefense () {
        return (getName() + " crea un escudo de burbujas");
    }
    @Override
    public String toString() {
        return "WaterPokemon{" +
                "accuracy=" + accuracy +
                '}';
    }
}
