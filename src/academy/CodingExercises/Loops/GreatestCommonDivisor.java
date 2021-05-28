package academy.CodingExercises.Loops;

public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first, int second){
        if (first < 10 || second < 10){
            return -1;
        }
        int GreatestCommonDivisor = 0;
        int divider = second;
        while(divider > 0){
            if (first % divider == 0){

                if(second % divider == 0){
                    GreatestCommonDivisor = divider;
                    break;
                }else{
                    divider--;
                }
            }else{

                    divider--;

            }
        }
        return GreatestCommonDivisor;
    }
}
