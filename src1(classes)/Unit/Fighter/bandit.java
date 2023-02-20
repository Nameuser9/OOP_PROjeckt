package Unit.Fighter;

import Unit.units;

public class bandit extends Fighter {
boolean run;
boolean distattack;//Задумка такова: разбойник может нанести удар через клетку
    //пока вижу из препятствий(наверное стоит ввести характеристику дистанции) и (второе неясно как расчитывать дистанцию, именно через клетку)
    public bandit(int maxHealth, int healthPoints, int movePoints,  int defence, int attack, int dmg, int init, int price) {
        super(maxHealth,healthPoints, movePoints,  defence, attack, dmg, init, price);

    }
    public bandit(){
        super(10,10,2,2,4,8,4,15);
        super.name = "Разбойник";
    }

    @Override
    public String get_Info() {
        return ("Разбойник");
    }
}
