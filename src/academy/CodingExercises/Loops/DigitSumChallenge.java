package academy.CodingExercises.Loops;



public class DigitSumChallenge {
    public static int sumDigits(int number){
        if (number < 10){
            return -1;
        }
        int num = number;
        int sum = 0;

        while (true){
            int lastDigit = num % 10;
            sum += lastDigit;

            int newNumber = num - lastDigit;
            int nextDigit = newNumber / 10;

            num = nextDigit;

            if(nextDigit == newNumber) {
                break;
            }

        }
        return sum;
    }
}
