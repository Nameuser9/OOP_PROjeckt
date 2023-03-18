package Unit;

public class Vector2D {
    public int posX;

    public int posY;
    public Vector2D(int posX, int posY){
        this.posX = posX;
        this.posY = posY;
    }




    public double getDist(Vector2D target){
        return Math.sqrt(Math.pow(posX - target.posX,2) + Math.pow(posY - target.posY,2));
}

}
