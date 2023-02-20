package Unit.Fighter;

import Unit.units;

public abstract class Fighter extends units {
    public Fighter(int maxHealth, int healthPoints, int movePoints, int defence, int attack, int dmg, int init, int price) {
        super(maxHealth, healthPoints, movePoints,  defence, attack, dmg, init, price);
    }
}
