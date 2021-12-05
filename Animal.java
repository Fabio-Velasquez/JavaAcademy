package JavaAcademy;

public class Animal {
    private int brain;
    private int body; 
    private int size;
    private int weight;
    private String name;

    public Animal(int brain, int body, int size, int weight, String name){
        this.setBrain(brain);
        this.setBody(body);
        this.setSize(size); 
        this.setWeight(weight);
        this.setName(name);
    }

    public static void main(String[] args) {
        Dog dog = new Dog(1, 1, 2, 10, "Yorkie", 4, 2, 1, 23, "multi-colored");
        dog.eat();
        dog.walk();
        dog.run();

    }
    public void eat() {
        System.out.println("Animal.eat() called");
    }
    public void move(int speed) {
        System.out.println("Animal.move() dog speed is" + speed);
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public int getWeight() {
        return weight;
    }


    public void setWeight(int weight) {
        this.weight = weight;
    }


    public int getSize() {
        return size;
    }


    public void setSize(int size) {
        this.size = size;
    }


    public int getBody() {
        return body;
    }


    public void setBody(int body) {
        this.body = body;
    }


    public int getBrain() {
        return brain;
    }


    public void setBrain(int brain) {
        this.brain = brain;
    }



}
