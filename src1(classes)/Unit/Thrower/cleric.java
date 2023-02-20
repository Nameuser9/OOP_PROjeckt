package Unit.Thrower;

import Unit.units;

public class cleric extends Thrower {
    int heal;
    int shootdmg;
    public cleric(int maxHealth, int healthPoints, int movePoints,  int defence, int attack, int dmg, int init, int price,int ammo,int heal) {
        super(maxHealth, healthPoints, movePoints,  defence, attack, dmg, init, price, ammo );
    }
    public cleric(){
        super(7,7,2,1,3,5,3,15,10);
        super.name =  cleric.class.getName() /*"Клирик"*/;
    }
    @Override
    public String get_Info() {
        return ("Клирик");

}}
