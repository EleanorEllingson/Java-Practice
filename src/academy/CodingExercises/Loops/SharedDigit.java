package academy.CodingExercises.Loops;

public class SharedDigit {
    public static boolean hasSharedDigit(int number1, int number2){
        boolean sharedDigit = true;
        if((number1 < 10 || number1 > 99) || (number2 < 10 || number2 > 99)){
            sharedDigit = false;

            return sharedDigit;
        }
        int firstDigit1 = number1;
        int lastDigit1 = number1 % 10;
        int firstDigit2 = number2;
        int lastDigit2 = number2 % 10;

        while (firstDigit1 > 9){
            firstDigit1 = firstDigit1 / 10;
            firstDigit2 = firstDigit2 / 10;
            if(firstDigit1 == firstDigit2 || firstDigit1 == lastDigit2){
                sharedDigit = true;
            }else if(lastDigit1 == firstDigit2 || lastDigit1 == lastDigit2){
                sharedDigit = true;
            }else {
                sharedDigit = false;
            }
        }
        return sharedDigit;
    }
}
