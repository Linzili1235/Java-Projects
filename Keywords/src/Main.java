public class Main {
    public static void main(String[] args) {
        //int2=5 is an expression
        //the whole line is a statement
        int in2 = 5;

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore =   calculateScore(gameOver,score,5,100);
        System.out.println("your final score was " + highScore);

        int lowScore = calculateScore(gameOver,score,8,200);
        System.out.println("your final score was " + lowScore);



        int highScorePosition = calculateHighScorePostiion(1500);
        displayHighScorePosition("Tim",highScorePosition);

        highScorePosition = calculateHighScorePostiion(900);
        displayHighScorePosition("Bob",highScorePosition);


    }
    public static void displayHighScorePosition(String playerName,
                                                int highScorePosition){
        System.out.println(playerName + " managed to get into position "
        + highScorePosition + " on the high score table");

    }
    public static int calculateHighScorePostiion(int playerScore){
//        if (playerScore > 1000){
//            return 1;
//        }
//        else if (playerScore > 500){
//            return 2;
//        }
//        return 0;
        int position = 4; //assuming position 4 will be returned
        if (playerScore > 1000){
            position = 1;
        }
        else if (playerScore > 500){
            position =  2;
        }
        return position; //bc we want less return statement
    }
    public static int calculateScore(boolean gameOver,
                                      int score,
                                      int levelCompleted,
                                      int bonus){

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 100;
            return finalScore;
        }
        return -1;

    }

    
}