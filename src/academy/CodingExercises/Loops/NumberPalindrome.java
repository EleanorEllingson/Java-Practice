package academy.CodingExercises.Loops;

public class NumberPalindrome {
    public static boolean isPalindrome(int number) {
        int num = number;
        int reverse = 0;
        int remainder;
        while (num != 0) {
            remainder = num % 10;
            reverse = reverse * 10 + remainder;
            num /= 10;

        }
        if (number == reverse) {
            return true;

        } else {
            return false;
        }
    }
}
