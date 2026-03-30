package lab3.problem6.problem5_from_lab2.Abstract;

import lab3.problem6.problem5_from_lab2.Interfaces.Actionable;
import lab3.problem6.problem5_from_lab2.Interfaces.PetOwner;

import java.util.Objects;

public abstract class Person implements Comparable<Person>, Cloneable, PetOwner {
    private String name;
    private int age;
    private Animal pet;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.pet = null;
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

    public Animal getPet() {
        return pet;
    }

    public void assignPet(Animal pet) {
        this.pet = pet;
    }

    public void removePet() {
        this.pet = null;
    }

    public boolean hasPet() {
        return this.pet != null;
    }

    public abstract String getOccupation();


    public void transferPet(Person other) {
        if (!this.hasPet()) {
            System.out.println(this.getName() + " has no pet to transfer.");
            return;
        }

        if (other.hasPet()) {
            System.out.println(other.getName() + " already has a pet.");
            return;
        }

        Animal temp = this.getPet();
        other.assignPet(temp);

        if (other.getPet() == temp) {
            this.removePet();
        }
    }

    @Override
    public String toString() {
        return "name: " + this.name
                + ", age: " + this.age
                + ", occupation: " + this.getOccupation()
                + ", pet: " + (pet == null ? "null" : pet.toString());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person other)) return false;
        return age == other.age && Objects.equals(name, other.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }


    @Override
    public int compareTo(Person other) {
        return Integer.compare(this.age, other.age);
    }

   @Override
public Person clone() throws CloneNotSupportedException {
    return (Person) super.clone();
}
}
