package academy;

public class CalculateScore {
    public static void main(String[] args) {
        int newScore = calaculateScore("Tim", 500);
        System.out.println("New score is " + newScore);
        calaculateScore(75);
        calaculateScore();

    }
    public static int calaculateScore(String playerName, int score){
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }
    public static int calaculateScore(int score){
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }
    public static int calaculateScore(){
        System.out.println("No player name, no player score.");
        return 0;
    }
}
