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
        System.out.println();
        insect.move();           // from abstract class
        insect.makeSound();

        // ====================== INTERFACES (Movable + extensions) ======================
        System.out.println("\n--- Interfaces: Movable + CanWalk, CanJump, CanSwim, CanFly ---");
        System.out.println();
        // Animals
        Dog dog = new Dog("Rex", 3);
        Parrot parrot = new Parrot("Polly", 2);

        dog.move();      // from abstract
        dog.walk();
        dog.jump();
        dog.swim();
        System.out.println();
        parrot.move();
        parrot.fly();
        parrot.walk();
        parrot.jump();
        System.out.println();
        // Insects
        Butterfly butterfly = new Butterfly(1, "orange");
        Firebug firebug = new Firebug(1, "red");

        butterfly.move();
        butterfly.walk();
        butterfly.fly();
        System.out.println();
        firebug.move();
        firebug.walk();
        firebug.jump();

        // Humans
        Person person = new Person("John", 25);
        Child child = new Child("Emma", 8);
        System.out.println();
        person.move();
        person.walk();
        person.jump();
        person.swim();
        person.makeSound();
        System.out.println();
        child.move();
        child.walk();
        child.jump();
        child.swim();
        System.out.println();
        // ====================== CanHaveJob ======================
        System.out.println("\n--- CanHaveJob (additional interface) ---");
        Student student = new Student("Alex", 20, "KazNU");
        student.move();
        student.haveJob();
        System.out.println();
        System.out.println("\n=== EVERYTHING WORKS! Task #1 is fully completed ===");
        System.out.println("Interface     → behavior that can be shared by unrelated classes");
        System.out.println("Abstract Class → common state + partial implementation");
    }
}