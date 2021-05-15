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
    public static int getDaysInMonth(int month, int year){
        boolean leapYear = NumberOfDaysInMonth.isLeapYear(year);
        int dayCount = 0;
        if(month < 1 || month > 12){
            return -1;
        }else if (year < 1 || year > 9999){
            return -1;
        }
        
        switch (month){
            case 1:
                dayCount = 31;
                break;
            case 2:
                if (leapYear){
                dayCount = 29;
                }else {
                    dayCount = 28;
                }
                break;
            case 3:
                dayCount = 31;
                break;
            case 4:
                dayCount = 30;
                break;
            case 5:
                dayCount = 31;
                break;
            case 6:
                dayCount = 30;
                break;
            case 7:
                dayCount = 31;
                break;
            case 8:
                dayCount = 31;
                break;
            case 9:
                dayCount = 30;
                break;
            case 10:
                dayCount = 31;
                break;
            case 11:
                dayCount = 30;
                break;
            case 12:
                dayCount = 31;
                break;
            default:
                break;



        }
        return dayCount;

    }
}
