package academy.CodingExercises;

public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double a, double b){
        boolean equalsDouble = true;
        a = a * 1000;
        b = b * 1000;

        int a1 = (int) a;
        int b1 = (int) b;
        if(a1 == b1){
            equalsDouble = true;

        }else {
            equalsDouble = false;

        }
        return equalsDouble;
    }
}
