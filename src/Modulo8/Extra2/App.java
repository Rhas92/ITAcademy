package Modulo8.Extra2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class App {
    public void execute() {
        Random random = new Random();
        List<String> names = new ArrayList<>(List.of("Pedro", "Ana", "Silvia", "Daniel", "Luis", "Maria", "Carlos", "Laura"));
        int numSpectators = random.nextInt(6) + 5;
        Film film = new Film("Project Hail Mary", 156, 14, "Phil Lord");
        Cinema cinema = new Cinema(film, 8);
        System.out.println("\nFilling cinema for the movie " + film.getTitle() +
                "\nTicket price: " + cinema.getTicketPrice() + " €"+ " for " + film.getMinAge() + " years old or older.");
        for (int i = 0; i < numSpectators; i++){
            String name = names.get(random.nextInt(names.size()));
            int money = random.nextInt(20);
            int age = random.nextInt(80);
            Spectator spectator = new Spectator(name, age, money);
            cinema.asignSeat(spectator);
        }
    }
}
