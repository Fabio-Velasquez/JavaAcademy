package JavaAcademy;

public class Dog extends Animal{
    private int legs;
    private int eyes; 
    private int tail;
    private int teeth; 
    private String coat;


    public Dog(int brain, int body, int size, int weight, String name, int legs, int eyes, int tail, int teeth, String coat) {
        super(brain, body, size, weight, name);
        this.legs = legs;
        this.eyes = eyes; 
        this.tail = tail; 
        this.teeth = teeth; 
        this.coat = coat; 
    }   
    private void chew(){
        System.out.println("Dog.chew() called");
    }
    @Override
    public void eat(){
        System.out.println("Dog.eat() called");
        chew();
        super.eat();
    }
    public void walk(){
        System.out.println("dog.walk()");
        move(5);
    }
    public void run(){
        System.out.println("dog.run()");
        move(10);
    }
    public void moveLegs(int speed){
        System.out.println("Dog.moveLegs() called");

    }
    @Override
    public void move(int speed){
        System.out.println("Dog.move() called");
        moveLegs(speed);
        super.move(speed);
    }

}
