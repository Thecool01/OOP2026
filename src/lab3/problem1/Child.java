package lab3.problem1;

import lab3.problem1.Interfaces.CanJump;
import lab3.problem1.Interfaces.CanSwim;
import lab3.problem1.Interfaces.CanWalk;

public class Child extends Person implements CanWalk, CanSwim, CanJump {
    public Child(String name, int age) {
        super(name, age);
    }


    @Override
    public void walk() {
        System.out.println("The child " + getName() + " is walking.");
    }

    @Override
    public void swim() {
        System.out.println("The child " + getName() + " is swimming.");
    }

    @Override
    public void jump() {
        System.out.println("The child " + getName() + " is jumping.");
    }



}
