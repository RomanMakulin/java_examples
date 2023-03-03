package ClassesWorkOOP.Lesson_07.Ex007;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Program {
    public static void main(String[] args) {
      
        // #region ex1 Demo

        // BaseHero hero3 = new Magician();
        // System.out.println(hero3.getInfo());

        // BaseHero hero4 = new Priest();
        // System.out.println(hero4.getInfo());

        // #endregion

        // #region ex2 Attack
        // System.out.println("------");
        // System.out.println(hero3.getInfo());
        // System.out.println(hero4.getInfo());

        // hero3.Attack(hero4);
        
        // hero4.Attack(hero3);
        // System.out.println(hero3.getInfo());
        // System.out.println(hero4.getInfo());

        // #endregion

        // #region Teams

        int teamCount = 5;
        Random rand = new Random();
        int magicianCount = 0;
        int priestCount = 0;
        int healerCount = 0;
 

        List<BaseHero> teams = new ArrayList<>();
        for (int i = 0; i < teamCount; i++) {
            int TeamRandom = rand.nextInt(3);
            if (TeamRandom == 0) {
                teams.add(new Priest());
                priestCount++;
            }
            else if (TeamRandom == 1){
                teams.add(new Healer());
                healerCount++;
            }
            else if (TeamRandom == 2){
                teams.add(new Magician());
                magicianCount++;
            }

            System.out.println(teams.get(i).getInfo());
        }

        System.out.println();
        System.out.printf("Count members: [Magicals: %d]; [Priests: %d]; [Healers: %d]. \n\n", magicianCount, priestCount, healerCount);
        
        
        teams.get(1).Heal(teams.get(2));
        
        System.out.println(teams.get(1).getInfo());
        System.out.println(teams.get(2).getInfo());

    }
}