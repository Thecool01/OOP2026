package practice4.Part1;

import practice4.Part1.Interfaces.CanHavePizza;

public class Cat extends Animal implements CanHavePizza {
    private String color;

    public Cat(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void eatPizza() {
        System.out.println("The cat " + getName() + " is eating pizza...");
    }

    @Override
    public void move() {
        System.out.println("The cat " + getName() + " is moving...");
    }
}