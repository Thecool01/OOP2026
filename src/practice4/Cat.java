package practice4;

import practice4.Interfaces.CanHavePizza;

public class Cat extends Animal implements CanHavePizza {
    private String name;
    private String age;
    private String color;

    public Cat(String name, String age, String color) {
        super(name, age);
        this.color = color;
    }

    @Override
    public void eatPizza() {
        System.out.println("The cat " + this.name + " is eating pizza...");
    }

}
