package lab3.problem6.problem5_from_lab2;

import lab3.problem6.problem5_from_lab2.Abstract.Animal;

public class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public String getAction() {
        return "Cat is running!";
    }

    @Override
    public String toString() {
        return "Cat{" + super.toString() + '}';
    }
}
