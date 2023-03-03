package Unit.Fighter;

import Unit.Thrower.sniper;
import Unit.units;

public class bandit extends Fighter {
boolean run;
boolean distattack;//Задумка такова: разбойник может нанести удар через клетку
    //пока вижу из препятствий(наверное стоит ввести характеристику дистанции) и (второе неясно как расчитывать дистанцию, именно через клетку)
    public bandit(int posX, int posY,int maxHealth, int healthPoints, int movePoints,  int defence, int attack,int dmgMax, int dmgMin, int init, int price, int quantity, int leadership) {
        super(posX,posY,maxHealth,healthPoints, movePoints,  defence, attack,dmgMax, dmgMin, init, price,quantity, leadership);

    }
    public bandit(int posX, int posY, int quantity){
        super(posX, posY,10,10,2,2,4,12,8,4,15, quantity, 10);
        super.name = "Разбойник";
    }

    @Override
    public StringBuilder get_Info() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Разбойник: \t").append(bandit.super.name)
                .append("\t| КОЛ:\t").append(bandit.super.quantity)
                .append("\t| ATK:\t").append(bandit.super.attack)
                .append("\t| HP:\t").append(bandit.super.healthPoints)
                .append("\t|").append("\t| (X.Y) : ").append(bandit.super.coords.posX).append(".").append(bandit.super.coords.posY);
    }

    @Override
    public void strike(units target) {

    }
    @Override
    public int get_init() {
        return (init);
    }
}
