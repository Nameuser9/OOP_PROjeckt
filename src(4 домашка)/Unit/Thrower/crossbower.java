package Unit.Thrower;

import Unit.Vector2D;

public class crossbower extends Thrower
{

    int shootdmg;
    int ammo;

    public crossbower(int posX, int posY,int maxHealth, int healthPoints, int movePoints,  int defence, int attack,int dmgMax, int dmgMin, int init, int price, int ammo,
                      int quantity,int leadership) {
        super( posX,  posY,maxHealth, healthPoints, movePoints,  defence, attack,dmgMax, dmgMin, init, price, ammo , quantity, leadership);
    }
    public crossbower(int posX, int posY, int quantity){
        super( posX,  posY,5,5,1,1,4,10,7,3,20, 10 ,quantity, 15);
        super.name = "Арбалетчик";
    }

    public String shoot() {
        return ("в разработке)");
    }
    @Override
    public String get_Info() {
        return ("Арбалетчик");
}
    @Override
    public int get_init() {
        return (init);
    }}