package academy.CodingExercises.MethodOverloading;

import academy.CodingExercises.YearsAndDays;

public class Main {
    public static void main(String[] args) {
        FeetAndInches.calcFeetAndInchesToCentimeters(4,6);
        FeetAndInches.calcFeetAndInchesToCentimeters(54);

        System.out.println(DurationString.getDurationString(1005,40));
        System.out.println(DurationString.getDurationString(4000));

        System.out.println("Area of Circle = " + AreaCalculator.area(-1));
        System.out.println("Area of Rectangle = " + AreaCalculator.area(-1,4));

        YearsAndDays.printYearsAndDays(5625600);
    }
}
