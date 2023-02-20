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
        ArrayList <units> army = new ArrayList<>();
                for(int i =0 ; i < 10; i++) {
            int a = new Random().nextInt(7);
            if (a == 1) {
                peasent peasent = new peasent();
                army.add(peasent);
                System.out.println(peasent.get_Info());
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

            if (a == 5) {
                spearman spearman = new spearman();
                army.add(spearman);
                System.out.println(spearman.get_Info());
            }
            if (a == 6) {
                crossbower crossbower = new crossbower();
                army.add(crossbower);
                System.out.println(crossbower.get_Info());
            }
            if (a == 7) {
                cleric cleric = new cleric();
                army.add(cleric);
                System.out.println(cleric.get_Info());
            }
        }
        }}





