package practice3.task1;

public class TestAnimal {

    public static void main(String[] args) {

        System.out.println("===== Animal Test =====");
        Animal a1 = new Animal();
        a1.walking();
        a1.makeAction();

        System.out.println("\n ---- Animal with parameters ----");
        Animal a2 = new Animal("Barsik", 3, "Ivan");
        a2.eat();
        a2.sleep();
        System.out.println("Owner: " + a2.getOwner());

        System.out.println("\n==============================\n");

        System.out.println("---- Parrot Test (super()) ----");
        Parrot p1 = new Parrot();
        p1.walking();     // inherited
        p1.fly();         // own method
        p1.makeAction();  // overriding

        System.out.println("\n---- Parrot Test (super(name, age)) ----");
        Parrot p2 = new Parrot("Kesha", 2, "Green", "Ara");
        p2.speak();
        p2.speak("Hello!");
        p2.makeAction();  // overriding

        System.out.println("\n---- Parrot Test (super(name, age, owner)) ----");
        Parrot p3 = new Parrot("Rio", 4, "Alex", "Blue", "Macaw");
        System.out.println("Owner: " + p3.getOwner());
        p3.speak("I love Java!");
        p3.makeAction();

    }
}
