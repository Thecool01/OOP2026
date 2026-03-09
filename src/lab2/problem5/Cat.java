package lab2.problem5;

public class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public String getAction() {
        return "Cat is running!";
    }
}
