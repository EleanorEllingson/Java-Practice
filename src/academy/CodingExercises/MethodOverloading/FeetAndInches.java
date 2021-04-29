package academy.CodingExercises.MethodOverloading;

public class FeetAndInches {
    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        double feetInches = feet * 12;
        double centimeters = (inches + feetInches) * 2.54;
        if(feet < 0){
            return -1;
        }else if(inches < 0 || inches > 12){
            return -1;
        }else{
            System.out.println(centimeters);
        }

        return centimeters;
    }

    public static double calcFeetAndInchesToCentimeters(double inches){


         if(inches < 0){
            return -1;
        }

        double feet = (int) inches / 12;
         double remainingInches = (int) inches % 12;
        System.out.println(inches + " inches is equal to " + feet + " feet and " + remainingInches + " inches");
        return calcFeetAndInchesToCentimeters(feet, inches);
    }

}
