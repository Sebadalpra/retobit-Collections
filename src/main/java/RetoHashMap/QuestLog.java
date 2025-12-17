package RetoHashMap;

import java.util.HashMap;

public class QuestLog {
    private HashMap<String, Quest> quests;  // Mapa: ID → Quest

    // El constructor no hace falta modificarlo
    public QuestLog() {
        this.quests = new HashMap<>();
    }

    public void addQuest(Quest quest) {
        this.quests.put(quest.getId(), quest);
    }

    public Quest getQuest(String questId) {
        for (Quest quest : quests.values())
            if (quest.getId().equals(questId)) {
                System.out.println(quest.toString());
                return quest;
            }
        return null;
    }

    public void completeQuest(String questId) {
        Quest quest = this.quests.get(questId);
        if (quest != null) {
            quest.setCompleted(true);
        }
    }

    // Este getter no lo vamos a modificar
    public HashMap<String, Quest> getQuests() {
        return quests;
    }

}