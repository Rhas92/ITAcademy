package Modulo8.Extra2;

import java.util.Random;

public class Cinema {
    Film film;
    double ticketPrice;
    Seat[][] seats;
    public Cinema (Film film, double ticketPrice) {
        this.film = film;
        this.ticketPrice = ticketPrice;
        this.seats = new Seat[3][5];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                seats[i][j] = new Seat(i + 1, (char) ('A' + j));
            }
        }
    }
    public double getTicketPrice() {
        return ticketPrice;
    }
    public void asignSeat(Spectator spectator) {
        System.out.println("\nSitting " + spectator.getName() + " " + spectator.getAge() + " years old, has " + spectator.getMoney() + " €");
        if (spectator.getAge() < this.film.getMinAge()) {
            System.out.println("\n" + spectator.getName() + " is not old enough.");
            return;
        }
        if (spectator.money < this.ticketPrice) {
            System.out.println("\n" + spectator.getName() + " doesn't have enough money.");
            return;
        }
        Random random = new Random();
        int i = random.nextInt(3);
        int j = random.nextInt(5);
        if (!seats[i][j].getBusy()) {
            seats[i][j].setBusy(true);
            System.out.println("\n" + spectator.getName() + " seated in seat " + seats[i][j]);
            spectator.money -= ticketPrice;
        }
        else {
            System.out.println("\nSeat " + seats[i][j] + " is busy... Searching for another seat.");
            searchSeat(spectator);
        }
    }

    public void searchSeat(Spectator spectator) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                if(!seats[i][j].getBusy()) {
                    seats[i][j].setBusy(true);
                    System.out.println("\n" + spectator.getName() + "seated in seat " + seats[i][j]);
                    spectator.money -= ticketPrice;
                    return;
                }
            }
        }

    }
}
