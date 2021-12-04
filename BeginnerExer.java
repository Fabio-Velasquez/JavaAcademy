package JavaAcademy;

public class BeginnerExer {
    public static void main(String[] args){

        printConversion(95.75);

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
}
