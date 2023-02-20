package Unit.Thrower;

import Unit.units;

public class wizzard extends Thrower {
    int lightningStrike;
    public wizzard(int maxHealth, int healthPoints, int movePoints,  int defence, int attack, int dmg, int init, int price, int ammo) {
        super(maxHealth,healthPoints, movePoints, defence, attack, dmg, init, price,ammo);
    }
    public wizzard(){
        super(5,5,2,0,4,8,5,30, 10);
        super.name = "Волшебник";

    }
    public String shoot() {
        return ("в разработке)");
    }
    @Override
    public String get_Info() {
        return ("Волшебник");
}}
