package lab3.problem1;

import lab3.problem1.Interfaces.Movable;


public abstract class AbstractMovableCreature implements Movable {

    protected int age;
    protected String name = "Unnamed";

    public AbstractMovableCreature(int age) {
        this.age = age;
    }

    public AbstractMovableCreature(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void move() {
        System.out.println(name + " is moving (from AbstractMovableCreature)");
    }

    public abstract void makeSound();
}