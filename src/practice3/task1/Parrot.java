package practice3.task1;

public class Parrot extends Animal {

    private String color;
    private String type;

    // SUPER
    public Parrot() {
        super();
        System.out.println("Parrot is created!");
    }

    // SUPER AND OVERLOADING
    public Parrot(String name, int age, String color, String type) {
        super(name, age);
        this.color = color;
        this.type = type;
    }

    // SUPER AND OVERLOADING
    public Parrot(String name, int age, String owner, String color, String type) {
        super(name, age, owner);
        this.color = color;
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    public void fly() {
        System.out.println("Parrot is flying!");
    }

    public void speak() {
        System.out.println("Parrot is speaking!");
    }

    public void speak(String text) {
        System.out.println("Parrot is speaking: " + text);
    }


    // OVERRIDING
    @Override
    public void makeAction() {
        System.out.println("Parrot is dancing!");
    }


    @Override
    public String toString() {
        return "Parrot{" +
                "name=" + name +
                ", age=" + age +
                ", owner=" + owner +
                ", color=" + color +
                ", type=" + type + '}';
    }


}
