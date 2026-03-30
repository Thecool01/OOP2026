package lab3.problem4;

import java.util.Arrays;
import java.util.Date;
import java.util.Vector;

public class Test {
    public static void main(String[] args) {
        // Employees
        Employee e1 = new Employee("Ivan", new Date(123, 5, 10), "INS001", 300000);
        Employee e2 = new Employee("Aruzhan", new Date(122, 3, 15), "INS002", 280000);
        Employee e3 = new Employee("Dias", new Date(124, 0, 20), "INS003", 350000);
        Employee e4 = new Employee("Ivan", new Date(123, 5, 10), "INS001", 300000);

        System.out.println("=== EMPLOYEE TEST ===");
        System.out.println(e1);
        System.out.println(e2);
        System.out.println();

        // equals
        System.out.println("e1 equals e4: " + e1.equals(e4));
        System.out.println("e1 equals e2: " + e1.equals(e2));
        System.out.println();

        // compareTo
        System.out.println("e1 compareTo e2: " + e1.compareTo(e2));
        System.out.println("e2 compareTo e3: " + e2.compareTo(e3));
        System.out.println();

        // clone
        Employee clonedEmployee = e1.clone();
        System.out.println("Original employee: " + e1);
        System.out.println("Cloned employee:   " + clonedEmployee);
        System.out.println("e1 equals clonedEmployee: " + e1.equals(clonedEmployee));
        System.out.println();

        // Manager team
        Vector<Employee> team1 = new Vector<>();
        team1.add(e1);
        team1.add(e2);

        Vector<Employee> team2 = new Vector<>();
        team2.add(e2);
        team2.add(e3);

        Manager m1 = new Manager("Alina", 500000, new Date(121, 8, 1), "MNG001", team1, 100000);
        Manager m2 = new Manager("Timur", 500000, new Date(120, 2, 12), "MNG002", team2, 120000);

        System.out.println("=== MANAGER TEST ===");
        System.out.println(m1);
        System.out.println(m2);
        System.out.println();

        // equals managers
        System.out.println("m1 equals m2: " + m1.equals(m2));
        System.out.println();

        // compareTo for managers
        System.out.println("m1 compareTo m2: " + m1.compareTo(m2));
        System.out.println();

        // clone manager
        Manager clonedManager = m1.clone();
        System.out.println("Original manager: " + m1);
        System.out.println("Cloned manager:   " + clonedManager);
        System.out.println("m1 equals clonedManager: " + m1.equals(clonedManager));
        System.out.println();

        // print manager team
        System.out.println("=== MANAGER TEAM ===");
        for (Employee emp : m1.getTeam()) {
            System.out.println(emp);
        }
        System.out.println();

        // Sorting by natural order (salary)
        Employee[] employees = {e1, e2, e3};
        Arrays.sort(employees);

        System.out.println("=== SORT BY SALARY (Comparable) ===");
        for (Employee emp : employees) {
            System.out.println(emp);
        }
        System.out.println();

        // Sorting by name
        Arrays.sort(employees, new NameComparator());

        System.out.println("=== SORT BY NAME (Comparator) ===");
        for (Employee emp : employees) {
            System.out.println(emp);
        }
        System.out.println();

        // Sorting by hire date
        Arrays.sort(employees, new HireDateComparator());

        System.out.println("=== SORT BY HIRE DATE (Comparator) ===");
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }
}