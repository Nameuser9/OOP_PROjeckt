package Unit.Fighter;

import Unit.units;

import java.util.ArrayList;

public class peasent extends Fighter {

    //задумка оссобенности крутиться вокруг количества крестьян(за каждое n(ну допустим 10 или 100)
    //  атака и защита будет увеличиваться на 1)

    public peasent(int maxHealth ,int healthPoints, int movePoints, boolean range, int defence, int attack,int dmg , int init, int price/*,int quantity*/) {
        super(maxHealth,healthPoints, movePoints,  defence, attack, dmg, init, price/*, quantity*/);
    }
    public peasent(){
        super(5,5,2,1,1,2,1,5);
        super.name = "Крестьянин";
    }

    @Override
    public String get_Info() {
        return ("Крестьянин");
    }
}
