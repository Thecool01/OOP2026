package lab3.problem2;

public class Owl extends Creature implements CanFly{
    public Owl(String type, int age) {
        super(type, age);
    }

    @Override
    public void move() {
        System.out.println("The owl " + getType() + " is moving.");
    }

    @Override
    public void fly() {
        System.out.println("The owl " + getType() + " is flying!");
    }
}
