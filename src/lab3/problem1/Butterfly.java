package lab3.problem1;

import lab3.problem1.Interfaces.CanFly;
import lab3.problem1.Interfaces.CanWalk;

public class Butterfly extends Insect implements CanWalk, CanFly {
    private String color;

    public Butterfly(int age, String color) {
        super(age);
        this.color = color;
    }

    @Override
    public void fly() {
        System.out.println("The butterfly is flying");
    }
    @Override
    public void walk() {
        System.out.println("The butterfly is walking");
    }

}
