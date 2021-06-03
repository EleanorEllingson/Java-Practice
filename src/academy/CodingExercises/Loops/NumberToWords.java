package academy.CodingExercises.Loops;

public class NumberToWords {
    public static void numberToWords(int number){
        if(number < 0){
            System.out.println("Invalid Value");
        }
        if(number == 0){
            System.out.println("Zero");
        }
        int revNumber = reverse(number);
        int newNum = reverse(number);

        int oneNum;
        while (newNum > 0){
            oneNum = newNum % 10;
            switch (oneNum){
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                default:
                    System.out.println("Other");
            }

            newNum = newNum / 10;

        }
        int zeroDifference = getDigitCount(number) - getDigitCount(revNumber);

        if(zeroDifference != 0){
            for(int i = 1; i <= zeroDifference; i++){
                System.out.println("Zero");
            }
        }
    }

    public static int reverse(int number){
        int num = number;
        int reverse = 0;
        int remainder;
        while (num != 0) {
            remainder = num % 10;
            reverse = reverse * 10 + remainder;
            num /= 10;
        }
        return reverse;
    }
    public static int getDigitCount(int number){
        if(number < 0){
            return -1;
        }
        if(number == 0){
            return 1;
        }
        int newNum = number;
        int count = 0;
        while (newNum > 0) {
            newNum = newNum / 10;
            count++;
        }
        return count;
    }

}
