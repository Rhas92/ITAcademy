package EventManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class CulturalAgenda {
    private String name;
    private List<Event> events;

    public CulturalAgenda(String name) {
        verifyString(name);
        this.name = name;
        this.events = new ArrayList<>();
    }

    private void verifyString(String s) {
        if (s == null)
            throw new IllegalArgumentException("The name can't be null.");
        if (s.isBlank())
            throw new IllegalArgumentException("The name can't be empty.");
    }

    public String getName() {
        return name;
    }

    public List<Event> getEvents() {
        return events;
    }

    public void registerEvent(Event e) {
        for (Event event: events)
            if (event.getName().equals(e.getName()))
                throw new IllegalArgumentException("There is already an event with that name");
        events.add(e);
    }
    public int calculateTotalScore() {
        int total = 0;
        for(Event event : events) {
            total += event.calculateTotalScore();
        }
        return total;
    }
    public Event getMostNotableEvent() {
        Event notableEvent = events.getFirst();
        for (Event event : events)
            if (event.calculateTotalScore() > notableEvent.calculateTotalScore())
                notableEvent = event;
        return notableEvent;
    }
    public void listOnlineSpeakers(String category) {
        for (Event event : events)
            if (event instanceof OnlineEvent onlineEvent && event.getCategory().equals(category)) {
                System.out.println(event.getName() + ":");
                for (Speaker speaker : onlineEvent.getSpeakers()) {
                    System.out.println("- " + speaker.getName() + " (+" + speaker.getRelevance() + ")");
                }
            }
    }

    @Override
    public String toString() {
        return "Cultural Agenda: " +
                "name: " + name + ", events: " + events;
    }
}
