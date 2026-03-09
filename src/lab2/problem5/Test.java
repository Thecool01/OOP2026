package lab2.problem5;

public class Test {
    public static void main(String[] args) {
        Person p1 = new Employee("Alice", 35, "Google");
        Person p2 = new Student("Bob", 20, "CS");
        Person p3 = new PhDStudent("Charlie", 27, "CS", "AI in Education");

        Animal cat = new Cat("Murka", 2);
        Animal dog = new Dog("Rex", 4);
        Animal parrot = new Parrot("Kesha", 1);
        Animal fish = new Fish("Nemo", 1);

        PersonRegistry registry = new PersonRegistry();
        registry.addPerson(p1);
        registry.addPerson(p2);
        registry.addPerson(p3);

        System.out.println("====================================");
        System.out.println("         INITIAL PET ASSIGNMENT     ");
        System.out.println("====================================");

        p1.assignPet(dog);
        p2.assignPet(cat);
        p3.assignPet(parrot);

        System.out.println(p1);
        System.out.println();
        System.out.println(p2);
        System.out.println();
        System.out.println(p3);

        System.out.println("\n====================================");
        System.out.println("   TRYING TO GIVE DOG TO PhDSTUDENT ");
        System.out.println("====================================");

        p3.assignPet(dog);

        System.out.println();
        System.out.println(p3);

        System.out.println("\n====================================");
        System.out.println("        TRANSFER PET OPERATION      ");
        System.out.println("====================================");

        System.out.println("Before transfer:");
        System.out.println(p2);
        System.out.println();
        System.out.println(p3);

        p2.transferPet(p3);

        System.out.println("\nAfter transfer:");
        System.out.println(p2);
        System.out.println();
        System.out.println(p3);

        System.out.println("\n====================================");
        System.out.println("            ALL PEOPLE              ");
        System.out.println("====================================");

        registry.printAllPeople();

        System.out.println("\n====================================");
        System.out.println("          PEOPLE WITH PETS          ");
        System.out.println("====================================");

        registry.printPeopleWithPets();

        System.out.println("\n====================================");
        System.out.println("        PEOPLE WITHOUT PETS         ");
        System.out.println("====================================");

        registry.printPeopleWithoutPets();

        System.out.println("\n===================================");
        System.out.println("           ANIMAL ACTIONS            ");
        System.out.println("====================================");

        System.out.println(cat.getName() + ": " + cat.getAction());
        System.out.println(dog.getName() + ": " + dog.getAction());
        System.out.println(parrot.getName() + ": " + parrot.getAction());
        System.out.println(fish.getName() + ": " + fish.getAction());
    }
}