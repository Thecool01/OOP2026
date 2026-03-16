package practice4.Part1;

public class test1 {

    public static void main(String[] args) {
        Restaurant delpapa = new Restaurant();
        Cat cat1 = new Cat("Tom", 2, "black");
        Cat cat2 = new Cat("Barsik", 3, "ginger");
        Person person1 = new Person("Aruzhan", 25);
        Person person2 = new Person("Dias", 30);
        Student student1 = new Student("Ali", 20, 2);
        Student student2 = new Student("Dana", 19, 1);
        System.out.println("ANIMAL / CAT TEST");
        cat1.breath();
        cat1.move();
        cat1.eat();
        cat1.sleep();
        cat1.eatPizza();

        System.out.println();

        cat2.breath();
        cat2.move();
        cat2.eat();
        cat2.sleep();
        cat2.eatPizza();

        System.out.println("\nPERSON TEST");

        person1.breath();
        person1.move();
        person1.sleep();
        person1.eatPizza();
        person1.dance();

        System.out.println();

        person2.breath();
        person2.move();
        person2.sleep();
        person2.eatPizza();
        person2.dance();

        System.out.println("\nSTUDENT TEST");

        student1.breath();
        student1.move();
        student1.sleep();
        student1.eatPizza();
        student1.dance();
        student1.doRetake();

        System.out.println("Course: " + student1.getCourse());
        System.out.println();

        student2.breath();
        student2.move();
        student2.sleep();
        student2.eatPizza();
        student2.dance();
        student2.doRetake();

        System.out.println("Course: " + student2.getCourse());
        System.out.println("\nRESTAURANT TEST");
        System.out.println("Serving pizza to cat1:");

        delpapa.servePizza(cat1);

        System.out.println();

        System.out.println("Serving pizza to cat2:");
        delpapa.servePizza(cat2);
        System.out.println();

        System.out.println("Serving pizza to person1:");
        delpapa.servePizza(person1);
        System.out.println();

        System.out.println("Serving pizza to student1:");
        delpapa.servePizza(student1);

        System.out.println("\nPOLYMORPHISM TEST");

        Animal animalRef = new Cat("Murzik", 1, "white");
        animalRef.move();

        Person personRef = new Student("Mira", 21, 3);

        personRef.move();
        personRef.eatPizza();
        personRef.dance();
    }
}