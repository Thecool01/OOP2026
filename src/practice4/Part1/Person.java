package practice4.Part1;

import practice4.Part1.Interfaces.CanHaveParty;
import practice4.Part1.Interfaces.CanHavePizza;
import practice4.Part1.Interfaces.Movable;

public class Person implements CanHavePizza, Movable, CanHaveParty {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public void breath() {
        System.out.println("The person " +  this.name + " is breathing...");
    }
    public void sleep() {
        System.out.println("The person " + this.name + " is sleeping...");
    }

    @Override
    public void eatPizza() {
        System.out.println("The person " + this.name + " is eating pizza...");
    }

    @Override
    public void move() {
        System.out.println("The person " + this.name + " is moving...");
    }

    @Override
    public void dance() {
        System.out.println("The person " + this.name + " is dancing...");
    }

}
