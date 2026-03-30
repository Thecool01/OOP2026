package lab3.problem6.problem5_from_lab2;

import lab3.problem6.problem5_from_lab2.Abstract.Animal;

public class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public String getAction() {
        return "Dog is jumping!";
    }

    @Override
    public String toString() {
        return "Dog{" + super.toString() + '}';
    }
}
