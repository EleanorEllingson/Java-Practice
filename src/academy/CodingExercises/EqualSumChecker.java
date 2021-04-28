package academy.CodingExercises;

public class EqualSumChecker {
    public static boolean hasEqualSum(int num1, int num2, int num3){
        boolean numberEqual;

        if(num1 + num2 == num3){
            numberEqual = true;
        }else {
            numberEqual = false;
        }
        return numberEqual;
    }
}
