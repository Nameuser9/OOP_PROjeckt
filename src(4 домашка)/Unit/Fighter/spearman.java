package Unit.Fighter;

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
    public String get_Info() {
        return ("Копейщик");
    }



    @Override
    public void strike(units target) {

    }
    @Override
    public int get_init() {
        return (init);
    }
}
