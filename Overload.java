package JavaAcademy;

public class Overload {

    
    public static void main(String[] args) {
        calculateScore("time", 1000);
        calculateScore(100);
        calcFeetAndInchesToCentimeters(24);
        getDurationString(132, 22);
        getDurationString(100);
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score);
        return score * 1000;
    }

    public static int calculateScore( int score) {
        System.out.println("Unnamed Player scored  "+  score + "  points");
        return score * 1000;
    }

    public static double calcFeetAndInchesToCentimeters(int feet, int inches) {
        if (feet < 0 || (inches < 0 || inches > 12) ) {
            return -1; 
        }
        return (2.54 * ((feet * 12) + inches));

    }

    public static double calcFeetAndInchesToCentimeters(int inches) {
        if ((inches <= 0) ) {
            return -1; 
        }
        double feet = inches / 12; 
        int incheRemainder = inches % 12; 
        System.out.println("is: " +calcFeetAndInchesToCentimeters((int)feet, incheRemainder));
        return feet;

    }

    public static void getDurationString(int minutes, int seconds) {
        if(minutes < 0 ){
            System.out.println("Invalid Input");
        }
        if(seconds < 0 && seconds > 59 ){
            System.out.println("Invalid Input");
        }
        int hours = minutes / 60;
        minutes = minutes % 60; 
        System.out.println(hours+"hh "+ minutes+"m "+ seconds+"s"); 
    }
    public static void getDurationString(int seconds) {
        if (seconds < 0 ){
            System.out.println("Invalid Input");
            return;
        }
        int minutes = seconds / 60;
        seconds = seconds % 60;
        System.out.println(minutes+ "m " + seconds + "seconds");
    }
}
