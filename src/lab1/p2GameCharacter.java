package lab1;

public class p1GameCharacter {
    public enum Role {WARRIOR, ARCHER} // ENUMS

    public static final int max_level = 50; // STATIC FINAL
    public static final int max_hp = 150;

    public static double hpMultiplier = 1.0; // STATIC NON-FINAL
    public static double expMultiplier = 1.0; // STATIC NON-FINAL

    private int level;
    private int hp;

    { // INITIALIZATION BLOCK
        level = 1;
        hp = 100;
    }
    



}
