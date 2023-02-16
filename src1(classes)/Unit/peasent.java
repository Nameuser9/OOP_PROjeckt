package Unit;

import java.util.ArrayList;

public class peasent extends units {

    //задумка оссобенности крутиться вокруг количества крестьян(за каждое n(ну допустим 10 или 100)
    //  атака и защита будет увеличиваться на 1)

    public peasent(int maxHealth ,int healthPoints, int movePoints, boolean range, int defence, int attack,int dmg , int init, int price/*,int quantity*/) {
        super(maxHealth,healthPoints, movePoints, range, defence, attack, dmg, init, price/*, quantity*/);
    }

}
