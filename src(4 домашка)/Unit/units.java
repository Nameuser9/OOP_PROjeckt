package Unit;


import java.util.ArrayList;

abstract public class units implements InterFaceGame  {

    protected String name;

    protected int maxHealth;
    protected int healthPoints;//здоровье
    protected int movePoints;//очки хода
    //protected boolean range;//радиус атаки(служит для определения: стрелок или рукопашник)(false = рук. true = стрю)
    protected int defence;//защита(сравнивается во время удара с показателем атаки)
    protected int attack;// и исход сравнения двух характеристик будет влиять на показатель урона
    protected int dmgMax;
    protected int dmgMin;// множество значений урона(выпадающим случайно) и изменяющимся от разницы
    //между предыдущими показателями
    //ПРОБЛЕМА хотел изначнально сделать урон arraylistОМ, при вводе данных в конструктор крестьянина выдаёт ошибку
    protected int init;// показатель определяющий очередность ходов
    protected int price;// цена юнита при найме
    protected Vector2D coords;
    protected int quantity;// количество юнитов в отряде
    protected int leadership;
    public String state ;
    protected units(int posX, int posY,int maxHealth, int healthPoints, int movePoints, int defence, int attack,int dmgMax, int dmgMin, int init, int price,
                 int quantity, int leadership) {


        this.maxHealth = maxHealth;
        this.healthPoints = healthPoints;
        this.movePoints = movePoints;
        this.defence = defence;
        this.attack = attack;
        this.dmgMax = dmgMax;
        this.dmgMin =dmgMin;
        this.init = init;
        this.price = price;
        this.quantity = quantity;
        state = "Stand";
        this.leadership = leadership;
        coords = new Vector2D(posX, posY);
    }




    /*public void add_Unit(Object unit){
        if Object.class.
    }*/

    @Override
    public void step(ArrayList<units> team1, ArrayList<units> team2) { }
    protected int findNearest(ArrayList<units> team){
        double min = 100;
        int index = 0;
        for (int i = 0; i < team.size(); i++) {
            if(min > coords.getDist(team.get(i).coords) & !team.get(i).state.equals("eliminated")) {
                index = i;
                min = coords.getDist(team.get(i).coords);
            }
        }
        return index;
    }

    public void getDamage(int damage){
        healthPoints -= damage;
        if (healthPoints > maxHealth) healthPoints = maxHealth;
        while (damage > healthPoints) {

            damage-= healthPoints;
            quantity -= 1;
            healthPoints= maxHealth;
        }
        if (quantity <= 0)
            state = "eliminated";
    }
@Override
    public void move(Vector2D coords) {

    ;
    }
    @Override
   public String get_Info() {


       return("");
    }

    @Override
    public int get_init() {
        return (init);
    }
    @Override
    public int get_defence() {
        return (defence);
    }

}


