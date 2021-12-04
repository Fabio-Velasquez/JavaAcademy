package JavaAcademy;

public class expressions {

    public static void main(String[] args){

        System.out.println(calculateScore(true, 1000, 3, 400)); 
        int highScore = calculateHighScorePosition(1500);
        displayHighScorePosition("time", highScore);
        highScore = calculateHighScorePosition(900);
        displayHighScorePosition("jeff", highScore);
        highScore = calculateHighScorePosition(500);
        displayHighScorePosition("testy", highScore);


    } 
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        
        if(gameOver){
            int finalscore = score + (levelCompleted * bonus);
            //System.out.println("Your final score is: " + finalscore);
            return finalscore;
        }
        return -1;
    }

    public static void displayHighScorePosition(String name, int position) {
        System.out.println(name + "managed to get into position: " + position + " on the highscore table" );
    }

    public static int calculateHighScorePosition(int score){

        if (score >= 1000) {
            return 1;
        }
        else if (score >= 500) {
            return 2;
        }
        else if (score >= 100) {
            return 3;
        }
        else {
            return 4;
        }
    }
}
