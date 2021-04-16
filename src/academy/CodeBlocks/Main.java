package academy.CodeBlocks;

public class Main {
    public static void main(String[] args) {

        int highScore = calculateScore(true, 800, 5, 100);
        System.out.println("Your final score was " + highScore);
        calculateScore(true, 10000, 8, 200);


        int highScorePosition= calculateHighScorePosition(1500);
        displayHighScorePosition("John", highScorePosition);

        highScorePosition= calculateHighScorePosition(900);
        displayHighScorePosition("Bob", highScorePosition);

        highScorePosition= calculateHighScorePosition(400);
        displayHighScorePosition("Paul", highScorePosition);

        highScorePosition= calculateHighScorePosition(50);
        displayHighScorePosition("Dave", highScorePosition);


    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            return finalScore;
        }
            return -1;
    }

    public static void displayHighScorePosition(String playersName, int highScorePosition){
        System.out.println(playersName + " managed to get into position " + highScorePosition + " on the high score table");

    }

    public static int calculateHighScorePosition(int score){
//        if(score >= 1000){
//            return 1;
//        }else if(score >= 500){
//            return 2;
//        }else if(score >= 100){
//            return 3;
//        }
//            return 4;
        int position = 4;
        if(score >= 1000){
            position = 1;
        }else if(score >= 500){
            position = 2;
        }else if(score >= 100){
            position = 3;
        }
        return position;
      }

}
