package Lesson_07.Ex007;

public class Healer extends BaseHero {
    int skillPoint; int MaxSkillPoint;

    public Healer() {
        super(String.format("Hero_Healer #%d", ++Healer.number),
                Healer.r.nextInt(50, 100));
        this.MaxSkillPoint = Healer.r.nextInt(150, 250);
        this.skillPoint = MaxSkillPoint;
    }

    public String getInfo() {
        return String.format("%s  Skill Points: %d",super.getInfo(), this.skillPoint);
    }
}
