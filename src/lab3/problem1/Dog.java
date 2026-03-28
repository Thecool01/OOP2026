package lab3.problem1;

import lab3.problem1.Interfaces.CanJump;
import lab3.problem1.Interfaces.CanSwim;
import lab3.problem1.Interfaces.CanWalk;

public class Dog extends Animal implements CanWalk, CanJump, CanSwim {
    private String name;

    public Dog(String name, int age) {
        super(age);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void walk() {
        System.out.println("The dog " + getName() + " is walking");
    }

    @Override
    public void jump() {
        System.out.println("The dog " + getName() + " is jumping");
    }

    @Override
    public void swim() {
        System.out.println("The dog " + getName() + " is swiming");
    }


}
