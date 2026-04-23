package Pokemon;

public class FirePokemon extends Pokemon{
    private int flameTemp;

    public FirePokemon (String name, int level, int health, int flameTemp) {
        super(name, level, health);
        verifyFirePokemon(flameTemp);
        this.flameTemp = flameTemp;
    }
    private void verifyFirePokemon (int flameTemp) {
        if (flameTemp <= 0 ) {
            throw new IllegalArgumentException("The flame has to be positive.");
        }
    }
    public int getFlameTemp() {
        return flameTemp;
    }
    @Override
    public void attack(Pokemon pokemon) {
        int damage = getLevel() + flameTemp / 10;
        pokemon.takeDamage(damage);
    }
    @Override
    public String useSpecialDefense() {
        return (getName() + " se envuelve en un muro de brasas");
    }

    @Override
    public String toString() {
        return "FirePokemon{" +
                "flameTemp=" + flameTemp +
                '}';
    }
}
