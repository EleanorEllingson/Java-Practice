package academy.CodingExercises.MethodOverloading;

public class AreaCalculator {
    public static double area(double radius){
        double areaCircle = 3.1415926535 * Math.pow (radius,2);
        if (radius < 0){
            areaCircle = -1.0;
        }
        return areaCircle;
    }

}
