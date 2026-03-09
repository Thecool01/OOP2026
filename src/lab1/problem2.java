package lab1;

public class problem2 {
    public static void main(String args[]) {

        p2GameCharacter c1 = new p2GameCharacter("Nikolay"); // DEFAULT
        p2GameCharacter c2 = new p2GameCharacter("Alina", p2GameCharacter.Role.ARCHER);

        // OVERLOADING
        System.out.println("The HP of " + c1.getName() + " is: " + c1.getHp());
        c1.heal();
        System.out.println("The HP of " + c1.getName() + " is: " + c1.getHp());
        c1.heal(20);
        System.out.println("The HP of " + c1.getName() + " is: " + c1.getHp());

        // STATIC NON-FINAL
        System.out.println("The Level of " + c1.getName() + " is: " + c1.getLevel());
        c1.gainExp(100);
        System.out.println("The Level of " + c1.getName() + " is: " + c1.getLevel());

        p2GameCharacter.setExpMultiplier(2);
        System.out.println("The Level of " + c2.getName() + " is: " + c2.getLevel());
        c2.gainExp(100);
        System.out.println("The Level of " + c2.getName() + " is: " + c2.getLevel());

        // READ-ONLY
        System.out.println("Name: " + c1.getName() + ", Role: " + c1.getRole());

        //STATIC FINAL
        System.out.println("Max level = " + p2GameCharacter.max_level);

        System.out.println(c1);
        System.out.println(c2);
    }
}
