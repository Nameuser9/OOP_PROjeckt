package Unit.Thrower;

import Unit.units;

public class sniper extends Thrower {
    int shootdmg;
    int headshoot;// = shootdmg *2;
    int ammo;



    public sniper(int maxHealth, int healthPoints, int movePoints, boolean range, int defence, int attack, int dmg, int init, int price,int ammo) {
        super(maxHealth,healthPoints, movePoints,  defence, attack, dmg, init, price, ammo);;

    }
    public sniper(){
        super(5,5,2,2,3,5,3,10, 5);
        super.name = "Снайпер";
    }
    public String shoot() {
        return ("в разработке)");
    }
    @Override
    public String get_Info() {
        return ("Снайпер");
}}
