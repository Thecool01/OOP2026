package lab3.problem1;

import lab3.problem1.Interfaces.CanFly;
import lab3.problem1.Interfaces.CanJump;
import lab3.problem1.Interfaces.CanWalk;

public class Parrot extends Animal implements CanFly, CanWalk, CanJump {
    private String name;

    public Parrot(String name, int age) {
        super(age);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void fly() {
        System.out.println("The parrot " +  getName() + " is flying");
    }

    @Override
    public void jump() {
        System.out.println("The parrot " +  getName() + " is jumping");
    }

    @Override
    public void walk() {
        System.out.println("The parrot " + getName() + " is walking.");
    }


}
