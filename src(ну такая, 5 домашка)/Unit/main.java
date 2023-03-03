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
        add_army1(army1,100);
//        ArrayList<units> army2 = new ArrayList<>();
//
//        System.out.println("Армия вторая ");
//        add_army2(army2);
//        ArrayList<units> battlefield = new ArrayList<>();
//
//
//        battlefield.addAll(army1);
//        battlefield.addAll(army2);
//
//        battlefield.sort(new Comparator<units>() {
//            @Override
//            public int compare(units o1, units o2) {
//                return (o1.init - o2.init);
//            }
//        });
//        System.out.println("На поле в порядке очереди");
//        System.out.println(battlefield.toString());



    }




    public static void add_army1(ArrayList<units> army , int lead) {

        for (int i = 1; i < 11; i++) {
            int a = new Random().nextInt(5);
            if (a == 1) {

                //peasent peasent = new peasent(1,2);
                // army.get(1).get_leadership();

                army.add(new  peasent(1,2,lead/army.get(i).leadership));//Проблема. определение количества как лидерства армии (Lead) и лидерства юнита( в характеристиках Leadership
               // просто не работает, я прям совсем не знаю в чём тут дело  Exception in thread "main" java.lang.IndexOutOfBoundsException: Index 1 out of bounds for length 0
               System.out.print(army.get(i).get_Info());


            }
            if (a == 2) {
                army.add(new  sniper(1,3 ,lead/army.get(i).leadership));
//                army.add(sniper);
//                System.out.println(sniper.get_Info());
                System.out.print(army.get(i).get_Info());

            }
            if (a == 3) {
                army.add(new  bandit(1,4,lead/army.get(i).leadership));
//                army.add(bandit);
//                System.out.println(bandit.get_Info());
                System.out.print(army.get(i).get_Info());

            }

            if (a == 4) {
                army.add(new  wizzard(1,5 ,lead/army.get(i).leadership));
//                army.add(wizzard);
//                System.out.println(wizzard.get_Info());
                System.out.print(army.get(i).get_Info());

            }

            }
        }

        public static void add_army2(ArrayList<units> army, int lead) {

            for (int i = 0; i < 10; i++) {
                int a = new Random().nextInt(5);
                if (a == 1) {
                    army.add(new  peasent(10,1,(lead/army.get(i).leadership)));
//                    army.add(peasent);
//                    System.out.println(peasent.get_Info());
                    army.get(i).get_Info();

                }
                if (a == 2) {
                    army.add(new  spearman(10,2 ,(lead/army.get(i).leadership)));
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