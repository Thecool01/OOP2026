package lab1.problem_5;

import java.util.Vector;

public class DragonLaunch {
    private Vector<Person> kidnapped = new Vector<>();

    public void kidnap(Person p) {
        kidnapped.add(p);
    }

    public boolean willDragonEatOrNot() {
        int write = 0; // initial size of queue

        for (int i = 0; i < kidnapped.size(); i++) {
            Person current = kidnapped.get(i);

            if (write > 0) {
                Person last = kidnapped.get(write - 1);

                // if last = BOY and current = GIRL then pair BG disappears
                if (last.getGender() == Gender.BOY && current.getGender() == Gender.GIRL) {
                    write--; // delete last
                    continue;
                }
            }

            // else enter currest
            kidnapped.set(write, current);
            write++;
        }
        return write > 0;

    }

    @Override
    public String toString() {
        return kidnapped.toString();
    }
}
