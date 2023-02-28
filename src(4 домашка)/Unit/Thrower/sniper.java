package Unit.Thrower;

public class sniper extends Thrower {
    int shootdmg;
    int headshoot;// = shootdmg *2;
    int ammo;



    public sniper(int posX, int posY,int maxHealth, int healthPoints, int movePoints,  int defence, int attack,int dmgMax, int dmgMin, int init, int price,int ammo,
                  int quantity, int leadership) {
        super( posX,  posY,maxHealth,healthPoints, movePoints,  defence, attack,dmgMax, dmgMin, init, price, ammo, quantity,leadership);

    }
    public sniper(int posX, int posY, int quantity){
        super(posX,posY,5,5,2,2,3,7,5,3,10, 5, quantity,20);
        super.name = "Снайпер";
    }
    public String shoot() {
        return ("в разработке)");
    }
    @Override
    public String get_Info() {
        return ("Снайпер");
}
    @Override
    public int get_init() {
        return (init);
    }
}
