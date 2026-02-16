package lab1.problem_5;

public class problem5 {
    public static void main(String[] args) {
        DragonLaunch dl1 = new DragonLaunch();
        // BBGG -> all disappeared
        dl1.kidnap(new Person(Gender.BOY, "B1"));
        dl1.kidnap(new Person(Gender.BOY, "B2"));
        dl1.kidnap(new Person(Gender.GIRL, "G1"));
        dl1.kidnap(new Person(Gender.GIRL, "G2"));
        System.out.println(dl1.willDragonEatOrNot()); // false
        DragonLaunch dl2 = new DragonLaunch();
        // GBGB -> 2 will left
        dl2.kidnap(new Person(Gender.GIRL, "G1"));
        dl2.kidnap(new Person(Gender.BOY, "B1"));
        dl2.kidnap(new Person(Gender.GIRL, "G2"));
        dl2.kidnap(new Person(Gender.BOY, "B2"));
        System.out.println(dl2.willDragonEatOrNot()); // true
    }

}
