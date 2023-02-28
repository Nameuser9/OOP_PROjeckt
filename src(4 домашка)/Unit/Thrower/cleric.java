package Unit.Thrower;

import Unit.Healing;
import Unit.units;

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
    public String get_Info() {
        return ("Клирик");

}

    @Override
    public void heal(units target) {

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
