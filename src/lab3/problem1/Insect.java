package lab3.problem1;

public class Insect extends AbstractMovableCreature {

    public Insect(int age) {
        super(age);
    }

    @Override
    public void move() {
        System.out.println("Insect is moving");
    }

    @Override
    public void makeSound() {
        System.out.println("Insect is making sound");
    }


}
