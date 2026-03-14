package practice4;

import practice4.Interfaces.Movable;

public class Animal implements Movable {
    private String name;
    private String age;

    public Animal(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAge() {
        return age;
    }
    public void setAge(String age) {
        this.age = age;
    }

    public void breath() {
        System.out.println(this.name + " is breathing...");
    }

    public void eat() {
        System.out.println(this.name + " is eating...");
    }

    public void sleep() {
        System.out.println(this.name + " is sleeping...");
    }

    @Override
    public void move() {
        System.out.println(this.name + " is moving...");
    }







}
