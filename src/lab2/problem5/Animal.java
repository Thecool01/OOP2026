package lab2.problem5;

public abstract class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public abstract String getAction();

    @Override
    public String toString() {
        return  "Creature{" + "name=" + name + ", age=" + age + '}';
    }
}
