package Unit;

public class bandit extends units{
boolean run;
boolean distattack;//Задумка такова: разбойник может нанести удар через клетку
    //пока вижу из препятствий(наверное стоит ввести характеристику дистанции) и (второе неясно как расчитывать дистанцию, именно через клетку)
    public bandit(int maxHealth, int healthPoints, int movePoints, boolean range, int defence, int attack, int dmg, int init, int price) {
        super(maxHealth,healthPoints, movePoints, range, defence, attack, dmg, init, price);

    }
}
