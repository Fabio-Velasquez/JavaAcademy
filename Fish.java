package JavaAcademy;

public class Fish extends Animal {
    private int gills;
    private int eyes; 
    private int fins;



    public Fish(int brain, int body, int size, int weight, String name, int gills, int eyes, int fins){
        super(brain, body, size, weight, name);
        this.gills = gills;
        this.fins = fins;
        this.eyes = eyes; 
    }

    private void rest() {

    }
    private void moveMuscles(){

    }
    private void moveBackFin(){

    }

    private void swim(int speed){
        moveMuscles();
        moveBackFin();
        super.move(speed);
    }   
    public static void main(String[] args){

    }
}
