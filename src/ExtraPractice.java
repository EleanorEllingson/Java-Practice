import academy.CodingExercises.SpeedConverter;

public class ExtraPractice {

    public static void milesPerGallon(double mpg, double totalMiles, double costOfGas){
        double costPerTrip = (totalMiles / mpg) * costOfGas;
        System.out.println("Cost for this trip is $" + costPerTrip);
    }

    public static void negativeNumbers(int num) {
        if (num < 0) {
            System.out.println(num + " is a negative number");
        } else {
            if (num >= 0) {
                System.out.println(num + " is a positive number");
            }
        }
    }

    public static void evenNumbers(int num){
        if(num % 2 == 0){
            System.out.println(num + " is an even number");
        }else {
            System.out.println(num + " is an odd number");
        }
    }

    public static void main(String[] args) {
        milesPerGallon(25, 1900, 2.5);

        negativeNumbers(4);
        negativeNumbers(-16);
        evenNumbers(-31);

    }
}
