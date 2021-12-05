package JavaAcademy;

public class BeginnerExer {
    public static void main(String[] args){

        printConversion(95.75);
        printMegaBytesAndKiloBytes(5000);

    }

    public static long toMilesPerHour(double kilometersPerHour){
        if(kilometersPerHour < 0) {
            return (long) -1;
            
        }
        return (long) (Math.round(kilometersPerHour / 1.609)); 
    }
    
    public static void printConversion(double kilometersPerHour) {
        if(kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        }
        else{

            System.out.println(kilometersPerHour + " km/h = "+ toMilesPerHour(kilometersPerHour) +" mi/h");
        }
        
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if(kiloBytes < 0) {
            System.out.println("Invalid Value");
            return; 
        }
        int megaBytes = kiloBytes /  1024;
        int remainderKiloBytes = kiloBytes % 1024; 
        System.out.println(kiloBytes +" KB = " + megaBytes + " MB and " + remainderKiloBytes + " KB");
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if( hourOfDay < 0 || hourOfDay > 23) {
            return false;
        }
        boolean awaken = barking && (hourOfDay < 8 || hourOfDay > 22) ? true : false; 
        return awaken; 
    }

    public static boolean isLeapYear(int year) {
        
        if (year < 1 || year > 9999) {
            return false;
        }

        if(year % 4 == 0) {
         
            if (year % 100 == 0) {

                if (year % 400 == 0) {
                    return true;
                }
                else {
                    return false;
                }
            }
            else{
                return true;
            }

        }
        else {
            return false;
        }

    }

    public static boolean areEqualByThreeDecimalPlaces(double first, double second) {
        int newFirst = (int) (first * 1000);
        int newSecond = (int) (second * 1000);
        if(newFirst == newSecond) {
            return true;
        }

        return false;
    }

    public static boolean hasEqualSum(int first, int second, int sum) {
        if(first + second == sum) {
            return true;
        }
        else {
            return false; 
        }

    }
}
