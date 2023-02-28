package Unit;

import java.util.ArrayList;

public interface InterFaceGame {

    void step(ArrayList<units> team1, ArrayList<units> team2);
    void move(Vector2D coords);
    String get_Info();

    void strike(units target);
    int get_init();

    int get_defence();


    //void battlemove(units a, units b);
}
