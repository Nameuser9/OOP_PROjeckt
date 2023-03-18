package Unit.Thrower;

import Unit.Shooting;
import Unit.Vector2D;
import Unit.units;

import java.util.ArrayList;

public abstract class Thrower extends units implements Shooting {
    protected int ammo;
    public Thrower(int posX, int posY,int maxHealth, int healthPoints, int movePoints, int defence, int attack,int dmgMax, int dmgMin, int init, int price, int ammo,
                   int  quantity, int leadership) {
        super( posX, posY,maxHealth, healthPoints, movePoints, defence, attack,dmgMax, dmgMin, init, price, quantity,leadership);

    }


    @Override
    public void step(ArrayList<units> team1, ArrayList<units> team2) {
            if (state.equals("eliminated") || ammo == 0) return;
            int target = findNearest(team2);
            int damage = (team2.get(target).get_defence() - attack > 0) ? dmgMin : (team2.get(target).get_defence() - attack < 0) ? dmgMax : (dmgMax+dmgMin)/2;
            team2.get(target).getDamage(damage);
            ammo--;

    }


    @Override
    public void strike(units target) {

    }

    @Override
    public void shoot(units target) {

    }
}
