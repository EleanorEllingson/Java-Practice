package academy.CodingExercises.Loops;

public class NumberPalindrome {
    public static boolean isPalindrome(int number){
        int reverse = 0;
        while(number >= 0){
            int lastDigit = number % 10;
            reverse ++;
            reverse = reverse * 10;
            int  nextDigit = lastDigit + reverse;
        }
    }
}
