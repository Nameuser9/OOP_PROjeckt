package Unit.Fighter;

import Unit.Vector2D;
import Unit.units;

public abstract class Fighter extends units {
    public Fighter(int posX, int posY, int maxHealth, int healthPoints, int movePoints, int defence, int attack, int dmgMax, int dmgMin, int init, int price, int quantity, int leadership) {
        super(posX,posY,maxHealth, healthPoints, movePoints,  defence, attack,dmgMax, dmgMin, init, price,quantity, leadership);
    }


}
