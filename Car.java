package JavaAcademy;

public class Car {
    // private means no class can access the variables except the car class
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;    
    public static void main(String[] args) {

    }


    public void setModel(String model) {
        String validModel = model.toLowerCase();
        if(validModel.equals("carrera") || validModel.equals("Holden"))
        {
            this.model = model; 

        }
        else{
            this.model = "Unknown";
        }
    }
    public String getModel() {
        return this.model; 
    }
    public void setDoors() {

    }
}
