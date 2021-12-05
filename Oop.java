package JavaAcademy;



public class Oop {
    public static void main(String[] arg) {
        Car porsche = new Car();
        porsche.setModel("Carrera");
        Car holden = new Car();
        System.out.println(porsche);
        System.out.println("model is " + porsche.getModel());
    }



    // write your code here
    private double firstNumber;
    private double secondNumber;

    public double getFirstNumber() {
        return this.firstNumber;    
    }
    public double getSecondNumber() {
        return this.secondNumber;
    }
    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;    
    }
    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public double getAdditionResult() {
        return this.firstNumber + this.secondNumber;
    } 
    public double getSubtractionResult() {
        return this.firstNumber - this.secondNumber;
    }
    public double getMultiplicationResult() {
        return this.firstNumber * this.secondNumber;
    }
    public double getDivisionResult() {
        if(this.secondNumber == 0) {
            return 0;
        }
        return this.firstNumber / this.secondNumber;
    }



}
