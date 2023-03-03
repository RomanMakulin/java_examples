package ClassesWorkOOP.Lesson_07.Ex007;

import java.util.Random;

public class BaseHero {
    protected static int number;
    protected static Random r;

    protected String name;
    protected int hp;
    protected int maxHp;

    static {
        BaseHero.number = 0;
        BaseHero.r = new Random();
    }

    public BaseHero(String name, int hp) {
        this.name = name;
        this.hp = hp;
        this.maxHp = hp;
    }

    public String getInfo() {
        return String.format("Name: %s;  Hp: %d;  Type: %s",
                this.name, this.hp, this.getClass().getSimpleName());
    }

    public void GetDamage(int damage) {
        if (this.hp - damage > 0) {
            this.hp -= damage;
        }
        // else { die(); }
    }

    public void Attack(BaseHero target) {
        int damage = BaseHero.r.nextInt(10, 20);
        target.GetDamage(damage);
    }

    public void healed(int hp) {
        this.hp = hp + this.hp;
    }

    public void Heal(BaseHero target) {
        int hp = BaseHero.r.nextInt(1, 5);
        target.healed(hp);
    }
}
