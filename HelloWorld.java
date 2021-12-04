package JavaAcademy;



public class HelloWorld {
    public static void main(String[] args){
        int aNum = 4;
        System.out.println("Hello F");
        System.out.println("A number: " + aNum + Integer.MIN_VALUE);
    

        byte byteMinVal = Byte.MIN_VALUE;
        byte byteMaxVal = Byte.MAX_VALUE;
        System.out.println("Max byte: "+ byteMaxVal + " Min byte: " + byteMinVal);
        short shortMaxVal = Short.MAX_VALUE;
        short shortMinVal = Short.MIN_VALUE;
        System.out.println("Max short: "+ shortMaxVal + " Min short: " + shortMinVal);

        long myLongVal = 100L;
        long myLongMaxVal = Long.MAX_VALUE;
        long myLongMinVal = Long.MIN_VALUE;
        System.out.println("Max long: "+ myLongMaxVal + " Min long: " + myLongMinVal);    

         int newVal = (int) (byteMaxVal / 2); 
         System.out.println((newVal));
        byte bVal = 3;
        short sVal = 200; 
        long total = 50_000 + 10 * (bVal + sVal); 
        System.out.println(total);


        double lbs = 10d; 
        double lbToKg = 0.45359237d;

        double kgTotal = lbs * lbToKg;
        System.out.println(kgTotal);
        boolean isCar = false;
        if (isCar) {
            System.out.println("is a car");
        }
        isCar = true;
        boolean wasCar = isCar ? true : false;
        if (wasCar){
            System.out.println("was a car!");
        }

        double firstNum = 20.00d;

        double secondNum = 80.00d;
        double multiBoth = firstNum + secondNum * 100;
        double remaining = multiBoth % 40;
        boolean isZero = remaining == 0 ? true : false; 
        if(isZero) {
            System.out.println(isZero);
        }
        else{
            System.out.println("got some remainder");
        }
    }

}