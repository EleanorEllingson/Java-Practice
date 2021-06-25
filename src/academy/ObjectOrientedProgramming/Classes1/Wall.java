package academy.ObjectOrientedProgramming.Classes1;

public class Wall {
    private double width;
    private double height;

    public Wall() {

    }

    public Wall(double width, double height) {
        this.width = width;
        if(width < 0){
            width = 0;
        }
        this.height = height;
        if(height < 0){
            height = 0;
        }
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
        if(width < 0){
            width = 0;
        }
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
        if(height < 0){
            height = 0;
        }
    }

    public double getArea(){
        double area = getHeight() * getWidth();
        return area;
    }
}
