package EventManagementSystem;

import java.util.List;

public class App {
    public void execute() {
        CulturalAgenda agenda = new CulturalAgenda("Agenda BCN 2026");
        Event e1 = new InPersonEvent(
                "UX Summit",
                "Design",
                60,
                80,
                "Conference"
        );
        List<Speaker> speakers = List.of(
                new Speaker("Marta Gil", 20),
                new Speaker("Joan Puig", 25)
        );

        Event e2 = new OnlineEvent(
                "Clean Code",
                "Programming",
                35,
                speakers
        );
        agenda.registerEvent(e1);
        agenda.registerEvent(e2);

        System.out.println(agenda);
        System.out.println("Total score: " + agenda.calculateTotalScore());
        Event notable = agenda.getMostNotableEvent();
        System.out.println("Most notable: " + notable.getName()
                + " (Total Score = " + notable.calculateTotalScore() + ")");
        System.out.println("\nEXTRA: Online speakers in category 'Programming':");
        agenda.listOnlineSpeakers("Programming");
    }
}
