package Unit;

import Unit.Fighter.bandit;
import Unit.Fighter.peasent;
import Unit.Fighter.spearman;
import Unit.Thrower.cleric;
import Unit.Thrower.crossbower;
import Unit.Thrower.sniper;
import Unit.Thrower.wizzard;

import java.util.ArrayList;
import java.util.Random;
public class main {
    public static void main(String[] args) {
        ArrayList<units> army1 = new ArrayList<>();

        System.out.println("Армия первая ");
        add_army1(army1);
        ArrayList<units> army2 = new ArrayList<>();

        System.out.println("Армия вторая ");
        add_army2(army2);
        ArrayList<units> battlefield = new ArrayList<>();


        battlefield.addAll(army1);
        battlefield.addAll(army2);

        battlefield.sort(new Comparator<units>() {
            @Override
            public int compare(units o1, units o2) {
                return (o1.init - o2.init);
            }
        });
        System.out.println("На поле в порядке очереди");
        System.out.println(battlefield.toString());



    }




    public static void add_army1(ArrayList<units> army) {

        for (int i = 0; i < 10; i++) {
            int a = new Random().nextInt(5);
            if (a == 1) {
                peasent peasent = new peasent();
                army.add(peasent);
                System.out.print(peasent.get_Info());

            }
            if (a == 2) {
                sniper sniper = new sniper();
                army.add(sniper);
                System.out.println(sniper.get_Info());

            }
            if (a == 3) {
                bandit bandit = new bandit();
                army.add(bandit);
                System.out.println(bandit.get_Info());

            }

            if (a == 4) {
                wizzard wizzard = new wizzard();
                army.add(wizzard);
                System.out.println(wizzard.get_Info());

            }

            }
        }

        public static void add_army2(ArrayList<units> army) {

            for (int i = 0; i < 10; i++) {
                int a = new Random().nextInt(5);
                if (a == 1) {
                    peasent peasent = new peasent();
                    army.add(peasent);
                    System.out.println(peasent.get_Info());

                }
                if (a == 2) {
                    spearman spearman = new spearman();
                    army.add(spearman);
                    System.out.println(spearman.get_Info());

                }
                if (a == 3) {
                    crossbower crossbower = new crossbower();
                    army.add(crossbower);
                    System.out.println(crossbower.get_Info());

                }
                if (a == 4) {
                    cleric cleric = new cleric();
                    army.add(cleric);
                    System.out.println(cleric.get_Info());


                }}
    }

}


