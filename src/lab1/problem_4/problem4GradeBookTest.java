package lab1.problem_4;

import practice2.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class problem4GradeBookTest {
    private static int readGrade(Scanner in, Student s) {
        while (true) {
            System.out.print(s + ": ");
            try {
                int grade = Integer.parseInt(in.nextLine());
                if (grade < 0 || grade > 100) {
                    System.out.println("Invalid grade: enter the grade between 0 and 100");
                    continue;
                }
                return grade;
            } catch (Exception e) {
                System.out.println("Invalid grade!");
            }
        }
    }

    public static void main(String[] args) {
        Course course = new Course("CSCI2104", "Databases", 5, List.of("CSCI1102"));

        List<Student> students = new ArrayList<>();
        students.add(new Student("Nikolay", "1"));
        students.add(new Student("Alex", "2"));
        students.add(new Student("Maria", "3"));
        students.add(new Student("Daniel", "4"));
        students.add(new Student("Sophia", "5"));
        students.add(new Student("Michael", "6"));
        students.add(new Student("Anna", "7"));
        students.add(new Student("David", "8"));
        students.add(new Student("Elena", "9"));
        students.add(new Student("Ivan", "10"));


        GradeBook gb = new GradeBook(course, students);

        gb.welcomeMessage();

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the grade for students");

        for (Student s : students) {
            int grade = readGrade(in, s);
            gb.setGrade(s, grade);
        }

        gb.displayGradeReport();
    }
}
