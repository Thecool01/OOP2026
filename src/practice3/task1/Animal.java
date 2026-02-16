package practice3.task1;

public class Animal {
    protected String name;
    protected int age;
    protected String owner;

    public Animal() {
        System.out.println("Animal was created!");
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Animal's name: " + this.name + ", and age: " + this.age);
    }

    public Animal(String name, int age, String owner) {
        this.name = name;
        this.age = age;
        this.owner = owner;
        System.out.println("Animal's name: " + this.name + ", and age: " + this.age);
        System.out.println("Animal's owner: " + this.owner);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getOwner() {
        if (owner == null) {
            System.out.println("Animal does not have an owner!");
            return null;
        }
        else {
            return owner;
        }
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }


    public void walking() {
        System.out.println("Animal is walking!");
    }

    public void eat() {
        System.out.println("Animal is eating!");
    }

    public void sleep() {
        System.out.println("Quiet! Animal is sleeping!");
    }

    public void makeAction() {
        System.out.println("Animal is making just action!");
    }

    @Override
    public String toString() {
        return "Animal{name='" + name +
                "', age=" + age +
                ", owner='" + owner + "'}";
    }

}
