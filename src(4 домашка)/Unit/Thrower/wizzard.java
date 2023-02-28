package Unit.Thrower;

public class wizzard extends Thrower {
    int lightningStrike;
    public wizzard(int posX, int posY,int maxHealth, int healthPoints, int movePoints,  int defence, int attack,int dmgMax, int dmgMin, int init, int price, int ammo,
                   int quantity,int leadership) {
        super( posX, posY,maxHealth,healthPoints, movePoints, defence, attack,dmgMax, dmgMin, init, price,ammo, quantity,leadership);
    }
    public wizzard(int posX, int posY,int quantity){
        super( posX,  posY,5,5,2,0,4,12,8,5,30, 10, quantity,25);
        super.name = "Волшебник";

    }
    public String shoot() {
        return ("в разработке)");
    }
    @Override
    public String get_Info() {
        return ("Волшебник");
}
    @Override
    public int get_init() {
        return (init);
    }}
