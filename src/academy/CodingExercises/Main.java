package academy.CodingExercises;

public class Main {
    public static void main(String[] args) {
        long miles = SpeedConverter.toMilesPerHour(10.5);
        System.out.println("Miles = " + miles);

        SpeedConverter.printConversion(10.5);

        SpeedConverter.milesPerGallon(25, 1900, 2.5);

        SpeedConverter.negativeNumbers(4);
        SpeedConverter.negativeNumbers(-16);
        MegaBytesConverter.printMegaBytesAndKiloBytes(-100);

        System.out.println(BarkingDog.shouldWakeUp(false, 14));
    }
}
