package academy.CodingExercises.Loops;

public class LargestPrime {
    public static int getLargestPrime(int number) {
        if (number <= 1) {
            return -1;
        }
        int factor = number;
        int i;

        for (i = 2; i <= factor; i++) {
            if (factor % i == 0) {
                factor /= i;
                i--;
            }
        }
        return i;
    }
}

