package lab3.problem2;

public class Shark extends Creature implements CanSwim{
    public Shark(String type, int age) {
        super(type, age);
    }

    @Override
    public void move() {
        System.out.println("The shark " + getType() + " is moving in water.");
    }

    @Override
    public void swim() {
        System.out.println("The shark " + getType() + " is swimming!");
    }
}
