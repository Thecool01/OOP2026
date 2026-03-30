package lab3.problem6.problem5_from_lab2.Abstract;

import lab3.problem6.problem5_from_lab2.Interfaces.Actionable;

public abstract class Animal implements Actionable {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public abstract String getAction();

    @Override
    public String toString() {
        return "name=" + name + ", age=" + age;
    }
}
