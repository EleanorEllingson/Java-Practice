package academy.CodingExercises;

public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        boolean wakeUp = false;
        if(!barking){
            System.out.println(false);
            wakeUp = false;
        }else if(hourOfDay < 8 && hourOfDay >= 0){
            System.out.println(true);
            wakeUp = true;
        } else if(hourOfDay == 23){
            System.out.println(true);
            wakeUp = true;
        }else{
            System.out.println(false);
            wakeUp = false;
        }
        return wakeUp;
    }

}
