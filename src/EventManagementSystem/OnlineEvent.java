package EventManagementSystem;

import java.util.List;

public class OnlineEvent extends Event {
    List<Speaker> speakers;

    public OnlineEvent(String name, String category, int baseRating, List<Speaker> speakers) {
        super(name, category, baseRating);
        verifySpeakers(speakers);
        this.speakers = speakers;
    }

    private void verifySpeakers(List<Speaker> speakers) {
        if (speakers.isEmpty())
            throw new IllegalArgumentException("The list of speakers can't be empty.");
    }

    public List<Speaker> getSpeakers() {
        return List.copyOf(speakers);
    }
    @Override
    public int calculateTotalScore() {
        int totalRelevance = 0;
        for (Speaker speaker: speakers) {
            totalRelevance += speaker.getRelevance();
            if (totalRelevance > 50)
                throw new IllegalArgumentException("The total relevance can't be superior to 50.");
        }
        return getBaseRating() + totalRelevance;
    }

    @Override
    public String toString() {
        return "Online Event: " +
                "speakers: " + speakers;
    }
}
