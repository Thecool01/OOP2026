package lab3.problem1;

public class Animal extends AbstractMovableCreature {
    public Animal(int age) {
        super(age);
    }

    @Override
    public void move() {
        System.out.println("Creature is moving");
    }

    @Override
    public void makeSound() {
        System.out.println("Creature is making sound");
    }

}
