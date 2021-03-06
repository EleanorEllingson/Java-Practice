package academy.ObjectOrientedProgramming.Classes1;

public class Point {
    private int x;
    private int y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance (){
        return x - y;
    }
    public double distance (int x, int y){
        return x - y;
    }
    public double distance(int z){
        return z;
    }
}
