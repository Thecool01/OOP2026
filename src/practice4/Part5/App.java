package practice4.Part5;

import java.util.ArrayList;
import java.util.Collections;

public class App {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Ali", 3.2));
        students.add(new Student("Dana", 3.8));
        students.add(new Student("Mira", 3.5));
        students.add(new Student("Arman", 2.9));

        System.out.println("Before sorting:");
        for (Student s : students) {
            System.out.println(s);
        }

        Collections.sort(students);

        System.out.println("\nSorted by GPA (Comparable):");
        for (Student s : students) {
            System.out.println(s);
        }

        Collections.sort(students, new NameComparator());

        System.out.println("\nSorted by Name (Comparator):");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}