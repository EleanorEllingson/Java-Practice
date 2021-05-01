package academy.CodingExercises.MethodOverloading;

public class DurationString {
    public static String getDurationString(int minutes, int seconds){
        String duration;
        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;
        if ((minutes < 0) || (seconds < 0) || (seconds > 59)){
            duration = "Invalid value";

        }else {

            duration = hours + "h " + remainingMinutes + "m " + seconds + "s";
        }
        return duration;
    }
    public static String getDurationString(int seconds) {
        String duration;
        if (seconds < 0) {
            duration = "Invalid value";
        }
        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;
        return getDurationString(minutes, remainingSeconds);
    }
}
