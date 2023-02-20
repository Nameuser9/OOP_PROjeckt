package Unit.Thrower;

import Unit.units;

public class crossbower extends Thrower
{

    int shootdmg;
    int ammo;

    public crossbower(int maxHealth, int healthPoints, int movePoints,  int defence, int attack, int dmg, int init, int price, int ammo) {
        super(maxHealth, healthPoints, movePoints,  defence, attack, dmg, init, price, ammo);
    }
    public crossbower(){
        super(5,5,1,1,4,5,3,20, 10);
        super.name = "Арбалетчик";
    }

    public String shoot() {
        return ("в разработке)");
    }
    @Override
    public String get_Info() {
        return ("Арбалетчик");
}}