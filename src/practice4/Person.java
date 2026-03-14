package practice4;

import practice4.Interfaces.CanHavePizza;

public class Person implements CanHavePizza {
    private String name;
    private String age;

    public Person(String name, String age) {
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
    public void sleep() {
        System.out.println(this.name + " is sleeping...");
    }

    public void eatPizza() {
        System.out.println(this.name + " is eating pizza...");
    }


}
