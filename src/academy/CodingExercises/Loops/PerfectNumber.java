package academy.CodingExercises.Loops;

public class PerfectNumber {
    public static boolean isPerfectNumber(int number) {
        boolean perfectNumber = true;
        if (number < 1) {
            return false;
        }
        int factor = 1;
        int sum = 0;
        while (factor < number) {
            if (number % factor == 0) {
                sum += factor;
                factor++;
            } else {
                factor++;
            }

        }

        if (sum == number) {
            perfectNumber = true;
        }else{
            perfectNumber = false;
        }
        return perfectNumber;
    }
}
