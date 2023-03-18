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
import java.util.Scanner;
public  class main {
    public static ArrayList<units> everyone = new ArrayList<>();
    public static ArrayList<units> army1 = new ArrayList<>();
    public static ArrayList<units> army2 = new ArrayList<>();
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        System.out.print("Press Enter to begin.");
        user_input.nextLine();


        add_army1(army1,100);



        add_army2(army2,100);



        everyone.addAll(army1);
        everyone.addAll(army2);

        everyone.sort(new Comparator<units>() {
            @Override
            public int compare(units o1, units o2) {
                return (o1.init - o2.init);
            }
        });
        System.out.println("На поле в порядке очереди");
        System.out.println(everyone.toString());

        while (true){
           View.view ();
            user_input.nextLine();
            for (units units: everyone) {
                if (army1.contains(units)) units.step(army1, army2);
                else units.step(army2, army1);
            }
        }



    }




    public static void add_army1(ArrayList<units> army , int lead) {

        for (int i = 0; i < 10; i++) {
            int a = new Random().nextInt(5);
            if (a == 1) {

                //peasent peasent = new peasent(1,2);
                // army.get(1).get_leadership();

                army.add(new  peasent(1,i+1,lead/peasent.leadership));//ПРОБЛЕМА попытка деления на 0(а почему?) ведь лидерство величина статическая и имеется у каждого класса отдельно
               System.out.print(army.get(i).get_Info());


            }
            if (a == 2) {
                army.add(new  sniper(1,i+1 ,lead/sniper.leadership));
//                army.add(sniper);
//                System.out.println(sniper.get_Info());
                System.out.print(army.get(i).get_Info());

            }
            if (a == 3) {
                army.add(new  bandit(1,i+1,lead/bandit.leadership));
//                army.add(bandit);
//                System.out.println(bandit.get_Info());
                System.out.print(army.get(i).get_Info());

            }

            if (a == 4) {
                army.add(new  wizzard(1,i+1 ,lead/wizzard.leadership));
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
                    army.add(new  peasent(10,i+1,(lead/peasent.leadership)));
//                    army.add(peasent);
//                    System.out.println(peasent.get_Info());
                    army.get(i).get_Info();

                }
                if (a == 2) {
                    army.add(new  spearman(10,i+1 ,(lead/spearman.leadership)));
//                    army.add(spearman);
//                    System.out.println(spearman.get_Info());

                }
                if (a == 3) {
                    army.add(new  crossbower(10,i+1 ,lead/crossbower.leadership));
//                    army.add(crossbower);
//                    System.out.println(crossbower.get_Info());

                }
                if (a == 4) {
                    army.add(new  cleric(10,i+1 ,lead/cleric.leadership));
//                    army.add(cleric);
//                    System.out.println(cleric.get_Info());


                }}
    }



    /*public static void armyalt(ArrayList<units> team, int offset, int posY){
        for( int i = 0; i <; i++)

    }*/
}