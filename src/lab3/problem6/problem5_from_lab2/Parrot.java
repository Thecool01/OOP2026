package lab3.problem6.problem5_from_lab2;

import lab3.problem6.problem5_from_lab2.Abstract.Animal;

public class Parrot extends Animal {
    public Parrot(String name, int age) {
        super(name, age);
    }

    @Override
    public String getAction() {
        return "Parrot is flying!";
    }

    @Override
    public String toString() {
        return "Parrot{" + super.toString() + '}';
    }

}
