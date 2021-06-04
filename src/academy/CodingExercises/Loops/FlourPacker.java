package academy.CodingExercises.Loops;

public class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal){

        if(bigCount < 0 || smallCount < 0 || goal < 0){
            return false;
        }
        int bigCountKilos = bigCount * 5;
        int extraKilos;

        if(goal > bigCountKilos + smallCount){
            return false;
        }
        extraKilos = goal % 5;

        if(extraKilos <= smallCount){
            return true;
        }else{
            return false;
        }

    }
}
