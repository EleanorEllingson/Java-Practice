package academy.CodingExercises.Loops;

public class DiagonalStar {
    public static void printSquareStar(int number){
        if(number < 5){
            System.out.println("Invalid Value");
        }
        for (int i = 1; i <= number; i++){
            System.out.print("*");
        }
    }

    public static void main(String[] args) {
        printSquareStar(8);
    }
}
