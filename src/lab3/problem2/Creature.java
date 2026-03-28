package lab3.problem2;

public abstract class Creature {
    protected String type;
    protected int age;

    public Creature(String type, int age) {
        this.type = type;
        this.age = age;
    }

    public String getType() {
        return type;
    }

    public int getAge() {
        return age;
    }

}
