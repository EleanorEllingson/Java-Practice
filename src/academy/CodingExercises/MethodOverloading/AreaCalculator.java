package academy.CodingExercises.MethodOverloading;

public class AreaCalculator {
    public static double area(double radius){
        double areaCircle = 3.1415926535 * Math.pow (radius,2);
        if (radius < 0){
            areaCircle = -1.0;
        }
        return areaCircle;
    }
    public static double area(double x, double y){
        double areaRectangle = x * y;
        if (x < 0 || y < 0){
            areaRectangle = -1.0;
        }
        return areaRectangle;
    }

}
