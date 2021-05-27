package academy.CodingExercises.Loops;

public class EvenDigitSum {
    public static int getEvenDigitSum(int number){
        if(number < 0){
            return -1;
        }
        int num = number;
        int digit = 0;
        int sum = 0;

        while(num >= 0){
            digit = num % 10;
            if(digit % 2 == 0){
                sum += digit;
            }
            int newNumber = num - digit;
            int nextDigit = newNumber / 10;
            num = nextDigit;

            if(nextDigit == newNumber){
                break;
            }
        }

        return sum;
    }
}
