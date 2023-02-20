package Unit;


abstract public class units implements InterFaceGame  {
    protected String name;

    protected int maxHealth;
    protected int healthPoints;//здоровье
    protected int movePoints;//очки хода
    //protected boolean range;//радиус атаки(служит для определения: стрелок или рукопашник)(false = рук. true = стрю)
    protected int defence;//защита(сравнивается во время удара с показателем атаки)
    protected int attack;// и исход сравнения двух характеристик будет влиять на показатель урона
    protected int dmg;// множество значений урона(выпадающим случайно) и изменяющимся от разницы
    //между предыдущими показателями
    //ПРОБЛЕМА хотел изначнально сделать урон arraylistОМ, при вводе данных в конструктор крестьянина выдаёт ошибку
    protected int init;// показатель определяющий очередность ходов
    protected int price;// цена юнита при найме

    protected int quantity;// количество юнитов в отряде
    //ПРОБЛЕМА(пока нет никаких представлений о том где их брать поэтому количество пока что рассматривать не буду)
    public units(int maxHealth, int healthPoints, int movePoints, /*boolean range,*/ int defence, int attack, int dmg, int init, int price) {
        this.maxHealth = maxHealth;
        this.healthPoints = healthPoints;
        this.movePoints = movePoints;
        this.defence = defence;
        this.attack = attack;
        this.dmg = dmg;
        this.init = init;
        this.price = price;
        this.quantity = quantity;
    }
    /*public void add_Unit(Object unit){
        if Object.class.
    }*/

    public String attack() {
        return ("в разработке)");
    }
@Override
    public void move() {
        System.out.println("в разработке)");
    }
    @Override
   public String get_Info() {


       return("");
    }
}

