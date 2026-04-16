package Pokemon;

import java.util.ArrayList;
import java.util.List;

public class App {
    public void execute() {
        List<Pokemon> equipo = new ArrayList<>();

        equipo.add(new FirePokemon("Charmander", 12, 50, 80));
        equipo.add(new WaterPokemon("Squirtle", 10, 55, 20));
        equipo.add(new FirePokemon("Vulpix", 14, 48, 90));
        equipo.add(new WaterPokemon("Psyduck", 11, 52, 15));

        System.out.println("=== EQUIPO POKÉMON ===");
        for (Pokemon pokemon : equipo) {
            System.out.println(pokemon);
            System.out.println("Defensa especial: " + pokemon.useSpecialDefense());
            System.out.println("Ataque lanzado: " + pokemon.attack());
            System.out.println();
        }

        System.out.println("=== ENTRENAMIENTO DE COMBATE ===");

        Pokemon atacante1 = equipo.get(0); // Charmander
        Pokemon defensor1 = equipo.get(1); // Squirtle

        System.out.println(atacante1.getName() + " ataca a " + defensor1.getName());
        int danio1 = atacante1.attack();
        defensor1.takeDamage(danio1);

        System.out.println(defensor1);
        System.out.println("¿Está debilitado? " + defensor1.isDebilitated());

        System.out.println();

        Pokemon atacante2 = equipo.get(2); // Vulpix
        Pokemon defensor2 = equipo.get(3); // Psyduck

        System.out.println(atacante2.getName() + " ataca a " + defensor2.getName());
        int danio2 = atacante2.attack();
        defensor2.takeDamage(danio2);

        System.out.println(defensor2);
        System.out.println("¿Está debilitado? " + defensor2.isDebilitated());
    }
}
