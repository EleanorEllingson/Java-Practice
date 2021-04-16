package academy.CodeBlocks;

public class Main {
    public static void main(String[] args) {

        calculateScore(true, 800, 5, 100);

        calculateScore(true, 10000, 8, 200);

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (score < 5000 && score > 1000) {
            System.out.println("Your score was 5000");
            System.out.println("This was executed");
        } else if (score < 1000) {
            System.out.println("Got here");
        }
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
            return finalScore;
        }
            return -1;


    }
}
