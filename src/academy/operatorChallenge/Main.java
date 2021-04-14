package academy.operatorChallenge;

public class Main {
    public static void main(String[] args){
        double value = 20.00d;
        double value2 = 80.00d;
        double sum = (value + value2) * 100d;
        System.out.println(sum);
        double remainder = (sum % 40d);
        System.out.println(remainder);
        boolean zero = (remainder == 0) ? true : false;
        System.out.println(zero);
        if(!zero){
            System.out.println("Got some remainder");

        }
    }
}
