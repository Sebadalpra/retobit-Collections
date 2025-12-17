package RetoHashSet;

import java.util.HashSet;

public abstract class Character {
    private HashSet<Skill> skills = new HashSet<>();

    public boolean learnSkill(Skill skill) {
        return skills.add(skill);
    }

    public boolean hasSkill(Skill skill) {
        return skills.contains(skill);
    }
}