package academy.CodingExercises;

public class LeapYear {
    public static boolean isLeapYear(int years) {
        boolean leapYear;
        if (years < 1 || years > 9999) {
            leapYear = false;

        } else if (years % 4 == 0) {
            leapYear = true;
            if (years % 100 == 0) {

                if (years % 400 == 0) {
                    leapYear = true;

                } else {
                    leapYear = false;

                }
            }

        }else {
            leapYear = false;
        }
        return leapYear;
    }

}
