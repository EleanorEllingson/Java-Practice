package academy.CodingExercises;

public class LeapYear {
    public static boolean isLeapYear(int years) {
        boolean leapYear = false;
        if (years < 1 || years > 9999) {
            leapYear = false;

        } else if (years % 4 == 0) {
            if (years % 100 == 0) {
                if (years % 400 == 0) {
                    leapYear = true;
                } else {
                    leapYear = false;

                }

            }
            leapYear = true;
        }else {
            leapYear = false;
        }
        return leapYear;
    }

}
