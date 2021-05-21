package academy.CodingExercises.Switch;

import academy.CodingExercises.Loops.SumOddRange;

public class Main {
    public static void main(String[] args) {
//        NumberInWord.printNumberInWord(0);
//        NumberInWord.printNumberInWord(1);
//        NumberInWord.printNumberInWord(2);
//        NumberInWord.printNumberInWord(3);
//        NumberInWord.printNumberInWord(4);
//        NumberInWord.printNumberInWord(5);
//        NumberInWord.printNumberInWord(6);
//        NumberInWord.printNumberInWord(7);
//        NumberInWord.printNumberInWord(8);
//        NumberInWord.printNumberInWord(9);
//        NumberInWord.printNumberInWord(10);
//        NumberInWord.printNumberInWord(-1);

        int month = 2;
        int year = 2025;
        boolean leapYear = NumberOfDaysInMonth.isLeapYear(year);
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(month, year, leapYear));
        System.out.println(SumOddRange.sumOdd(100, 1000));

    }
}
