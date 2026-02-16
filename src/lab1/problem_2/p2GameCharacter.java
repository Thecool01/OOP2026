package lab1.problem_2;

public class p2GameCharacter {
    public enum Role {WARRIOR, ARCHER} // ENUMS

    public static final int max_level = 50; // STATIC FINAL
    public static final int max_hp = 150;

    public static double hpMultiplier = 1.2; // STATIC NON-FINAL
    public static double expMultiplier = 1.5; // STATIC NON-FINAL

    private final String name;
    private final Role role;

    private int level;
    private int hp;

    { // INITIALIZATION BLOCK
        level = 1;
        hp = 100;
    }

    public p2GameCharacter(String name) { // FIRST CONSTRUCTOR WITHOUT ROLE
        this.name = name;
        this.role = Role.WARRIOR;
    }

    public p2GameCharacter(String name, Role role) { // SECOND CONSTRUCTOR WITH ROLE
        this.name = name;
        this.role = role;
    }


    // READ-ONLY FIELDS
    public String getName() {
        return name;
    }
    public Role getRole(){
        return role;
    }
    public int getHp() {
        return hp;
    }
    public int getLevel() {
        return level;
    }

    // OVERLOADING
    public void heal(int amount) {
        if (amount <= 0) {
            return;
        }
        int gained = (int) Math.round(amount * hpMultiplier);

        this.hp = Math.min(max_hp, this.hp + gained);
    }

    public void heal() {
        heal(10);
    }


    public void gainExp(int exp) {
        if (exp <= 0) {
            return;
        }

        int gained = (int) Math.round(exp * expMultiplier);

        int levelUp = gained / 100;

        if (levelUp > 0) {
            level = Math.min(max_level, level + levelUp);
        }
    }

    // STATIC
    public static void setExpMultiplier(double multiplier) {
        if (multiplier > 0) expMultiplier = multiplier;
    }

    @Override
    public String toString() {
        return "GameCharacter{name='" + name + "', role=" + role +
                ", level=" + level + ", hp=" + hp + "}";
    }
}
