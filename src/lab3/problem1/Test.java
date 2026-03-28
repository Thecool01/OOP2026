package lab3.problem1;

import lab3.problem1.Interfaces.*;

public class Test {

    public static void main(String[] args) {

        System.out.println("=== TEST FOR TASK #1 (Interface vs Abstract Class) ===\n");

        // ====================== ABSTRACT CLASS ======================
        System.out.println("--- AbstractMovableCreature (shared state + partial implementation) ---");
        Animal animal = new Animal(5);
        Insect insect = new Insect(1);

        animal.move();           // from abstract class
        animal.makeSound();

        insect.move();           // from abstract class
        insect.makeSound();

        // ====================== INTERFACES (Movable + extensions) ======================
        System.out.println("\n--- Interfaces: Movable + CanWalk, CanJump, CanSwim, CanFly ---");

        // Animals
        Dog dog = new Dog("Rex", 3);
        Parrot parrot = new Parrot("Polly", 2);

        dog.move();      // from abstract
        dog.walk();
        dog.jump();
        dog.swim();

        parrot.move();
        parrot.fly();
        parrot.walk();
        parrot.jump();

        // Insects
        Butterfly butterfly = new Butterfly(1, "orange");
        Firebug firebug = new Firebug(1, "red");

        butterfly.move();
        butterfly.walk();
        butterfly.fly();

        firebug.move();
        firebug.walk();
        firebug.jump();

        // Humans
        Person person = new Person("John", 25);
        Child child = new Child("Emma", 8);

        person.move();
        person.walk();
        person.jump();
        person.swim();
        person.makeSound();

        child.move();
        child.walk();
        child.jump();
        child.swim();

        // ====================== CanHaveJob ======================
        System.out.println("\n--- CanHaveJob (additional interface) ---");
        Student student = new Student("Alex", 20, "KazNU");
        student.move();
        student.haveJob();

        System.out.println("\n=== EVERYTHING WORKS! Task #1 is fully completed ===");
        System.out.println("Interface     → behavior that can be shared by unrelated classes");
        System.out.println("Abstract Class → common state + partial implementation");
    }
}