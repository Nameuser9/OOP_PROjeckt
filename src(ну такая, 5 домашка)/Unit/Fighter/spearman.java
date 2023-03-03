package Unit.Fighter;

import Unit.Thrower.sniper;
import Unit.units;

public class spearman extends Fighter {
    boolean defposition;
    public spearman(int posX, int posY,int maxHealth, int healthPoints, int movePoints,  int defence, int attack,int dmgMax, int dmgMin, int init, int price, int quantity, int leadership) {
        super( posX,  posY,maxHealth,healthPoints, movePoints, defence, attack,dmgMax, dmgMin, init, price, quantity,leadership);
    }
    public spearman(int posX, int posY, int quantity){
        super(posX, posY,20,20,2,5,5,10,5,3,20, quantity, 15);
        this.name = "Копейщик";
    }

    @Override
    public StringBuilder get_Info() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Копейщик: \t").append(spearman.super.name)
                .append("\t| КОЛ:\t").append(spearman.super.quantity)
                .append("\t| ATK:\t").append(spearman.super.attack)
                .append("\t| HP:\t").append(spearman.super.healthPoints)
                .append("\t|").append("\t| (X.Y) : ").append(spearman.super.coords.posX).append(".").append(spearman.super.coords.posY);}


    @Override
    public void strike(units target) {

    }
    @Override
    public int get_init() {
        return (init);
    }
}
