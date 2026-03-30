package lab3.problem5;

import lab3.problem4.Employee;
import lab3.problem5.Chocolate;
import lab3.problem5.Sort;
import lab3.problem5.Time;

import java.util.Date;

public class Test {

    public static void main(String[] args) {

        // ===== 1. CHOCOLATES =====
        Chocolate[] chocolates = {
                new Chocolate("Twix", 50),
                new Chocolate("Mars", 70),
                new Chocolate("Snickers", 60),
                new Chocolate("KitKat", 40)
        };

        System.out.println("=== CHOCOLATES BEFORE SORT ===");
        printArray(chocolates);

        Sort.mergeSort(chocolates);

        System.out.println("\n=== CHOCOLATES AFTER MERGE SORT ===");
        printArray(chocolates);


        // ===== 2. TIMES =====
        Time[] times = {
                new Time(15, 20, 10),
                new Time(9, 45, 5),
                new Time(15, 20, 5),
                new Time(0, 10, 30),
                new Time(23, 59, 59)
        };

        System.out.println("\n=== TIMES BEFORE SORT ===");
        printArray(times);

        Sort.mergeSort(times);

        System.out.println("\n=== TIMES AFTER MERGE SORT ===");
        printArray(times);


        // ===== 3. EMPLOYEES =====
        Employee[] employees = {
                new Employee("Ivan", new Date(), "A123", 300000),
                new Employee("Arman", new Date(), "B456", 250000),
                new Employee("Dias", new Date(), "C789", 400000),
                new Employee("Aruzhan", new Date(), "D111", 280000)
        };

        System.out.println("\n=== EMPLOYEES BEFORE SORT ===");
        printArray(employees);

        Sort.mergeSort(employees);

        System.out.println("\n=== EMPLOYEES AFTER MERGE SORT ===");
        printArray(employees);
    }

    public static <E> void printArray(E[] array) {
        for (E element : array) {
            System.out.println(element);
        }
    }
}