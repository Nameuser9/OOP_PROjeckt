package Unit;

public class cleric extends units{
    int heal;
    int shootdmg;
    public cleric(int maxHealth, int healthPoints, int movePoints, boolean range, int defence, int attack, int dmg, int init, int price) {
        super(maxHealth, healthPoints, movePoints, range, defence, attack, dmg, init, price);
    }
}
