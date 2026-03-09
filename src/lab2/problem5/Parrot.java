package lab2.problem5;

public class Parrot extends Animal {
    public Parrot(String name, int age) {
        super(name, age);
    }

    @Override
    public String getAction() {
        return "Parrot is flying!";
    }
}
