package Unit.Fighter;

import Unit.units;

public class spearman extends Fighter {
    boolean defposition;
    public spearman(int maxHealth, int healthPoints, int movePoints,  int defence, int attack, int dmg, int init, int price) {
        super(maxHealth,healthPoints, movePoints, defence, attack, dmg, init, price);
    }
    public spearman(){
        super(20,20,2,5,5,5,3,20);
        this.name = "Копейщик";
    }

    @Override
    public String get_Info() {
        return ("Копейщик");
    }
}
