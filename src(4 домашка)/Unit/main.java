package Unit;

import Unit.Fighter.bandit;
import Unit.Fighter.peasent;
import Unit.Fighter.spearman;
import Unit.Thrower.cleric;
import Unit.Thrower.crossbower;
import Unit.Thrower.sniper;
import Unit.Thrower.wizzard;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;
public  class main {
    public static void main(String[] args) {
        ArrayList<units> army1 = new ArrayList<>();

        System.out.println("Армия первая ");
        add_army1(army1,2000);
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




    public static void add_army1(ArrayList<units> army , int leadership) {

        for (int i = 0; i < 10; i++) {
            int a = new Random().nextInt(5);
            if (a == 1) {
                //peasent peasent = new peasent(1,2);
                army.add(new  peasent(1,2,12));
               // System.out.print(peasent.get_Info());

            }
            if (a == 2) {
                army.add(new  sniper(1,3 ,5));
//                army.add(sniper);
//                System.out.println(sniper.get_Info());

            }
            if (a == 3) {
                army.add(new  bandit(1,4,8));
//                army.add(bandit);
//                System.out.println(bandit.get_Info());

            }

            if (a == 4) {
                army.add(new  wizzard(1,5 ,3));
//                army.add(wizzard);
//                System.out.println(wizzard.get_Info());

            }

            }
        }

        public static void add_army2(ArrayList<units> army) {

            for (int i = 0; i < 10; i++) {
                int a = new Random().nextInt(5);
                if (a == 1) {
                    army.add(new  peasent(10,1,12));
//                    army.add(peasent);
//                    System.out.println(peasent.get_Info());

                }
                if (a == 2) {
                    army.add(new  spearman(10,2 ,10));
//                    army.add(spearman);
//                    System.out.println(spearman.get_Info());

                }
                if (a == 3) {
                    army.add(new  crossbower(10,3 ,5));
//                    army.add(crossbower);
//                    System.out.println(crossbower.get_Info());

                }
                if (a == 4) {
                    army.add(new  cleric(10,4 ,5));
//                    army.add(cleric);
//                    System.out.println(cleric.get_Info());


                }}
    }



    /*public static void armyalt(ArrayList<units> team, int offset, int posY){
        for( int i = 0; i <; i++)

    }*/
}