package academy.CodingExercises.Loops;

public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number){
        if( number < 0){
            return -1;
        }
        int firstDigit = number;
        int lastDigit = number % 10;
        while (firstDigit >= 10) {
            firstDigit = firstDigit / 10;
            }
        return firstDigit + lastDigit;

    }
}
