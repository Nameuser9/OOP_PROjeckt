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
    public StringBuilder get_Info() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Снайпер: \t").append(sniper.super.name)
                .append("\t| КОЛ:\t").append(sniper.super.quantity)
                .append("\t| ATK:\t").append(sniper.super.attack)
                .append("\t| HP:\t").append(sniper.super.healthPoints)
                .append("\t|").append("\t| (X.Y) : ").append(sniper.super.coords.posX).append(".").append(sniper.super.coords.posY);}
    @Override
    public int get_init() {
        return (init);
    }
}
