package lab3.problem6.problem5_from_lab2;

import lab3.problem6.problem5_from_lab2.Abstract.Animal;

public class Fish extends Animal {
    public Fish(String name, int age) {
        super(name, age);
    }

    @Override
    public String getAction() {
        return "Fish is swimming!";
    }

    @Override
    public String toString() {
        return "Fish{" + super.toString() + '}';
    }
}
