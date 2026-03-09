package lab2.problem5;

public class Fish extends Animal {
    public Fish(String name, int age) {
        super(name, age);
    }

    @Override
    public String getAction() {
        return "Fish is swimming!";
    }
}
