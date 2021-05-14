package academy.CodingExercises.Switch;

public class NumberOfDaysInMonth {
    public static boolean isLeapYear(int year){
        boolean leapYear = true;
        if(year < 1 || year > 9999){
            leapYear = false;
        }else if(year % 4 == 0){
            leapYear = true;
            if(year % 100 == 0){
                if(year % 400 == 0){
                    leapYear = true;
                }else {
                    leapYear = false;
                }
            }
        }else {
            leapYear = false;
        }
        return leapYear;
    }
}
