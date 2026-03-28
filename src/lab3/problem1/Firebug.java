package lab3.problem1;

import lab3.problem1.Interfaces.CanJump;
import lab3.problem1.Interfaces.CanWalk;

public class Firebug extends Insect implements CanWalk, CanJump {
    private String color;

    public Firebug(int age, String color) {
        super(age);
        this.color = color;
    }

    @Override
    public void walk() {
        System.out.println("The firebug is walking");
    }

    @Override
    public void jump() {
        System.out.println("The firebug is jumping");
    }



}
