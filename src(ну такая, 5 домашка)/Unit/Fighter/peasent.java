package Unit.Fighter;

import Unit.Thrower.Thrower;
import Unit.Thrower.sniper;
import Unit.units;

import java.util.ArrayList;

public class peasent extends Fighter {

    //задумка оссобенности крутиться вокруг количества крестьян(за каждое n(ну допустим 10 или 100)
    //  атака и защита будет увеличиваться на 1)
    protected int reserve_ammo;

    public peasent(int posX, int posY, int maxHealth , int healthPoints, int movePoints, int defence, int attack, int dmgMax, int dmgMin , int init, int price, int quantity, int leadership) {
        super( posX,  posY,maxHealth,healthPoints, movePoints,  defence, attack,dmgMax, dmgMin, init, price, quantity, leadership);
    }
    public peasent(int posX, int posY,int quantity){
        super( posX,  posY,5,5,2,1,1,2,1,1,5, quantity, 5);
        super.name = "Крестьянин";
    }
    public int getReserve_ammo(){
        return reserve_ammo;
}
    public boolean findThrower(ArrayList<units> team){
    ArrayList<units> arrayThrower = new ArrayList<>();
        for (int i = 0; i < team.size(); i++) {
            if (team.get(i).getClass() == Thrower.class) {
                if(((peasent) team.get(i)).getReserve_ammo() > 0) {
                    arrayThrower.add(team.get(i));
                }
            }

            }
        if (arrayThrower.size()== 0)
            return false;
        else return true;
    }
//    public void giveReserve_ammo(ArrayList<units> alles,Thrower ally){//если коротко для того чтобы передать стрелку аммуницию крестьянин должен к нему подойти
//        if (findThrower(alles )== true){
//            ally.ammo
//
//
//        }
//    }
//    @Override
//    public String get_Info() {
//        return ("Крестьян);
//    }
    @Override
    public StringBuilder get_Info() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Крестьянин: \t").append(peasent.super.name)
                .append("\t| КОЛ:\t").append(peasent.super.quantity)
                .append("\t| ATK:\t").append(peasent.super.attack)
                .append("\t| HP:\t").append(peasent.super.healthPoints)
                .append("\t|").append("\t| (X.Y) : ").append(peasent.super.coords.posX).append(".").append(peasent.super.coords.posY);
    }

    @Override
    public void strike(units target) {

    }
    @Override
    public int get_init() {
        return (init);
    }
}
