package Unit.Fighter;

import Unit.Vector2D;
import Unit.units;

import java.util.ArrayList;

public abstract class Fighter extends units  {
    public Fighter(int posX, int posY, int maxHealth, int healthPoints, int movePoints, int defence, int attack, int dmgMax, int dmgMin, int init, int price, int quantity, int leadership) {
        super(posX,posY,maxHealth, healthPoints, movePoints,  defence, attack,dmgMax, dmgMin, init, price,quantity, leadership);
    }



    @Override
    public void step(ArrayList<units> team1, ArrayList<units> team2) {

        if (state.equals("eliminated") ) return;
        int target = findNearest(team2);
        if (target > movePoints){
           // move(); НЕ ЗНАЮ КАК УКАЗАТЬ НОВЫЕ КООРДИНАТЫ ПЕРЕМЕЩЕНИЯ КРОМЕ ТОГО ЧТО ДИСТАНЦИЯ(таргет) должна стремится к 1(возможно её можно как-то подбирать
        }
        int damage = (team2.get(target).get_defence() - attack > 0) ? dmgMin : (team2.get(target).get_defence() - attack < 0) ? dmgMax : (dmgMax+dmgMin)/2;
        team2.get(target).getDamage(damage);

    }
}
