public class Main {

    public static void main(String[] args) {

        int highScore = returnScore(true, 10000, 4, 300);
        displayHighScorePosition("Kyle", calculateHighScorePosition(1500));
    }

    public static void displayHighScorePosition (String name, int position) {
        System.out.printf("%s managed to get into position, %d on the high score table.%n", name, position);
    }

    public static int calculateHighScorePosition(int score) {
        if (score > 1000) {
            return 1;
        } else if (score > 500 && score < 1000) {
            return 2;
        } else if (score > 100 && score <= 500){
            return 3;
        }

        return 4;
    }
    public static void calculateScore(boolean gameOver, int score, int level, int bonus) {

        if (gameOver) {
            int finalScore = score * level + bonus;
            System.out.println("The final score is: " + finalScore);
        }
    }

    public static void doNotReturnScore(boolean gameOver, int score, int level, int bonus) {

        if (gameOver) {
            int finalScore = score * level + bonus;
            System.out.println("The final score is: " + finalScore);
        }
    }

    public static int returnScore(boolean gameOver, int score, int level, int bonus) {

        if (gameOver) {
            int finalScore = score * level + bonus;
            System.out.println("The final score is: " + finalScore);
            return finalScore;
        }

        return -1;
    }
}
