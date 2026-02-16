package practice3.task2;

import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Set<Person> people = new HashSet<>();

        people.add(new Person("Ivan Petrov", "Almaty"));
        people.add(new Person("Anna Sidorova", "Astana"));
        people.add(new Person("Max Kim", "Shymkent"));

        people.add(new Student("John Smith", "London", "Computer Science", 2, 3500.0));
        people.add(new Student("Maria Lopez", "Madrid", "Economics", 3, 4200.0));
        people.add(new Student("Ali Khan", "Dubai", "Engineering", 1, 5000.0));
        people.add(new Student("Sofia Rossi", "Rome", "Design", 4, 3800.0));

        people.add(new Staff("Dr. Brown", "New York", "Harvard", 7000.0));
        people.add(new Staff("Prof. Lee", "Seoul", "KAIST", 6500.0));
        people.add(new Staff("Mr. Wilson", "Toronto", "MIT", 6000.0));

        while (true) {
            System.out.println("\nTest program on class Person");
            System.out.println("1. Add Person");
            System.out.println("2. Add Student");
            System.out.println("3. Add Staff");
            System.out.println("4. Print all people");
            System.out.println("0. Exit");

            System.out.print("Choose: ");
            int choice = input.nextInt();
            input.nextLine();

            if (choice == 1) {
                System.out.print("Enter person's name: ");
                String name = input.nextLine();

                System.out.print("Enter person's address: ");
                String address = input.nextLine();

                people.add(new Person(name, address));
                System.out.println("Person added successfully");
            }

            else if (choice == 2) {
                System.out.print("Enter student's name: ");
                String name = input.nextLine();

                System.out.print("Enter student's address: ");
                String address = input.nextLine();

                System.out.print("Enter student's program: ");
                String program = input.nextLine();

                System.out.print("Enter student's year: ");
                int year = input.nextInt();
                input.nextLine();

                System.out.print("Enter student's fee: ");
                double fee = input.nextDouble();
                input.nextLine();

                people.add(new Student(name, address, program, year, fee));
                System.out.println("Student added successfully");
            }

            else if (choice == 3) {
                System.out.print("Enter staff's name: ");
                String name = input.nextLine();

                System.out.print("Enter staff's address: ");
                String address = input.nextLine();

                System.out.print("Enter staff's school: ");
                String school = input.nextLine();

                System.out.print("Enter staff's pay: ");
                double pay = input.nextDouble();
                input.nextLine();
                people.add(new Staff(name, address, school, pay));
                System.out.println("Staff added successfully");
            }

            else if (choice == 4) {
                if (people.isEmpty()) {
                    System.out.println("No people was added");
                } else {
                    System.out.println("--- PEOPLE ---");
                    for (Person p : people) {
                        System.out.println(p);
                    }
                }
            }

            else if (choice == 0) {
                System.out.println("Exiting Program...");
                break;
            }

            else {
                System.out.println("Wrong choice, try again.");
            }
        }

        input.close();
    }
}
