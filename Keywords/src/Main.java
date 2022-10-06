public class Main {
    public static void main(String[] args) {
        //int2=5 is an expression
        //the whole line is a statement
        int in2 = 5;

        boolean gameOver = true;
        int score = 900;
        int levelCompleted = 5;
        int bonus = 100;

//        if (score < 5000){
//            System.out.println("Your score was less than 5000");
//        }
//        else if (score < 1000){
//            System.out.println("Your score was less than 1000");
//        }
//        else{
//            System.out.println("Got here");
//        }
//    }
        //initiate finalscore before code block if you want to have it afterwards®
        int finalScore = 0;
        if (gameOver == true) {
            finalScore = score + (levelCompleted * bonus);
            System.out.println("your final score was " + finalScore);
        }
        System.out.println(finalScore);
    }
}