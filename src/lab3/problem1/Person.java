package lab3.problem1;

import lab3.problem1.Interfaces.CanJump;
import lab3.problem1.Interfaces.CanWalk;
import lab3.problem1.Interfaces.CanSwim;

public class Person extends AbstractMovableCreature implements CanJump, CanWalk, CanSwim {

    public Person(String name, int age) {
        super(age, name);
    }

    @Override
    public void jump() {
        System.out.println("The person " + getName() + " is jumping.");
    }

    @Override
    public void walk() {
        System.out.println("The person " + getName() + " is walking.");
    }


    @Override
    public void swim() {
        System.out.println("The person " + getName() + " is swimming.");
    }

    @Override
    public void makeSound() {
        System.out.println("The person " + getName() + " is making.");
    }


}
