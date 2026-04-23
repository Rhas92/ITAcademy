package Pokemon;

public abstract class Pokemon {
    private String name;
    private int level;
    private int health;

    public Pokemon (String name, int level, int health) {
        verifyPokemon(name, level, health);
        this.name = name;
        this.level = level;
        this.health = health;
    }
    private void verifyPokemon(String name, int level, int health) {
        verifyName(name);
        verifyLevel(level);
        verifyHealth(health);
    }
    private void verifyName(String name) {
        if (name == null)
            throw new IllegalArgumentException("Name can't be null.");
        if (name.isBlank())
            throw new IllegalArgumentException("Name can't be empty");
    }
    private void verifyLevel(int level) {
        if (level <= 0)
            throw new IllegalArgumentException("The level has to be positive.");
        if (level > 100)
            throw new IllegalArgumentException("The level can't be higher than 100");
    }
    private void verifyHealth(int health){
        if (health < 0)
            throw new IllegalArgumentException("Health has to be 0 or more.");
    }
    public String getName() {
        return name;
    }
    public int getLevel() {
        return level;
    }
    public int getHealth() {
        return health;
    }
    public void takeDamage(int damage) {
        health -= damage;
        if (health < 0)
            health = 0;
    }
    public boolean isDebilitated() {
        return health <= 0;
    }
    public abstract void attack(Pokemon pokemon);
    public abstract String useSpecialDefense();

    @Override
    public String toString() {
        return "Pokemon{" +
                "name='" + name + '\'' +
                ", level=" + level +
                ", health=" + health +
                '}';
    }
}
