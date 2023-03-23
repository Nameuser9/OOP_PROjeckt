package Unit.Thrower;

import Unit.Fighter.bandit;
import Unit.Healing;
import Unit.units;

import java.util.ArrayList;
import java.util.Random;

public class cleric extends Thrower implements Healing {
    int heal;
    int shootdmg;
    public cleric(int posX, int posY,int maxHealth, int healthPoints, int movePoints,  int defence, int attack,int dmgMax, int dmgMin, int init, int price,int ammo,int heal, int quantity, int leadership) {
        super( posX,  posY,maxHealth, healthPoints, movePoints,  defence, attack,dmgMax, dmgMin, init, price, ammo,quantity,leadership);
    }
    public cleric(int posX, int posY, int quantity){
        super( posX, posY,7,7,2,1,3,8,5,3,15,10,quantity, 20);
        super.name =  cleric.class.getName() /*"Клирик"*/;
    }
    @Override
    public StringBuilder get_Info() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Клирик: \t").append(cleric.super.name)
                .append("\t| КОЛ:\t").append(cleric.super.quantity)
                .append("\t| ATK:\t").append(cleric.super.attack)
                .append("\t| HP:\t").append(cleric.super.healthPoints)
                .append("\t|").append("\t| (X.Y) : ").append(cleric.super.coords.posX).append(".").append(cleric.super.coords.posY);}

    @Override
    public void heal(units target) {

    }
    @Override
    public void step(ArrayList<units> team1, ArrayList<units> team2) {
        for (units units:team1) {
            if (state.equals("eliminated") || maxHealth == healthPoints) return;
            else
            units.getDamage(-1 * (new Random().nextInt(4, 9)));

        }
        }

    @Override
    public void shoot(units target) {
        super.shoot(target);
    }

    @Override
    public void strike(units target) {
        super.strike(target);
    }
    @Override
    public int get_init() {
        return (init);
    }
}
