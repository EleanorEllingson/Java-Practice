package academy.CodingExercises;

public class TeenNumberChecker {
    public static boolean hasTeen(int num1, int num2, int num3) {
        boolean hasTeenNum;
        if (num1 >= 13 && num1 <= 19) {
            hasTeenNum = true;
        } else if (num2 >= 13 && num2 <= 19) {
            hasTeenNum = true;
        } else if (num3 >= 13 && num3 <= 19) {
            hasTeenNum = true;
        } else {
            hasTeenNum = false;
        }
        return hasTeenNum;
    }

    public static boolean isTeen(int num){
        boolean isTeenNum;
        if(num >= 13 && num <= 19){
            isTeenNum = true;
        }else {
            isTeenNum = false;
        }
        return isTeenNum;
    }
}
