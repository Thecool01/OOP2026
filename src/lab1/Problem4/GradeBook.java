package lab1.Problem4;

import practice2.Student;

import java.util.*;

public class GradeBook {

    private Course course;
    private List<Student> students;
    private Map<Student, Integer> grades;

    public GradeBook(Course course) { // When we want to create empty
        this.course = course;
        this.students = new ArrayList<>();
        this.grades = new LinkedHashMap<>();
    }

    public GradeBook(Course course, List<Student> students) { // When we want to create with the list of student
        this.course = course;
        this.students = new ArrayList<>(students);
        this.grades = new LinkedHashMap<>();
    }

    public GradeBook(Course course, List<Student> students,  Map<Student, Integer> grades) { // When we want to create with all data
        this.course = course;
        this.students = new ArrayList<>(students);
        this.grades = new LinkedHashMap<>(grades);
    }

    // ADD THE STUDENT
    public void addStudent(Student s) {
        students.add(s);
    }

    // SET THE GRADE
    public void setGrade(Student s, int grade) {
        grades.put(s, grade);
    }

    public void welcomeMessage() {
        System.out.println("Welcome to the grade book for " + course.getName() + " " + course.getDescription());
    }

    // AVERAGE OF THE GRADES
    public double classAverage() {
        if (grades.isEmpty()) { return 0.0;}
        double sum = 0.0;
        for (int grade : grades.values()) {
            sum += grade;
        }
        return sum / grades.size();
    }

    // LOWER GRADE
    public Student getLowestStudentGrade() {
        Student lowestStudent = null;
        int lowestGrade = Integer.MAX_VALUE;

        // Map.Entry gives the information in key and value format
        // getKey() - gives the key
        // getValue() - gives the value
        for (Map.Entry<Student, Integer> entry : grades.entrySet()) {
            if (entry.getValue() < lowestGrade) {
                lowestStudent = entry.getKey();
                lowestGrade = entry.getValue();
            }
        }

        return lowestStudent;
    }

    // HIGHEST GRADE
    public Student getHighestStudentGrade() {
        Student highestStudent = null;
        int highestGrade = Integer.MIN_VALUE;
        for (Map.Entry<Student, Integer> entry : grades.entrySet()) {
            if (entry.getValue() > highestGrade) {
                highestStudent = entry.getKey();
                highestGrade = entry.getValue();
            }
        }
        return highestStudent;
    }

    // PRINTING THE STARS FOR CHART
    private void printStars(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public void outputChart() {
        int[] gradeFreq = new int[11];

        // loop for counting grades
        for (int grade : grades.values()) {
            if(grade == 100) gradeFreq[10]++;
            else gradeFreq[grade / 10]++;
        }

        // loop for distribution
        for (int i = 0; i < 10; i++) {
            int left = i * 10;
            int right = i * 10 + 9;
            System.out.print(left + " - " + right + ": ");
            printStars(gradeFreq[i]);
        }

        System.out.print("100: ");
        printStars(gradeFreq[10]);
    }


    public void displayGradeReport() {
        double average = classAverage();
        Student lowStudent = getLowestStudentGrade();
        Student highStudent = getHighestStudentGrade();

        int low = grades.get(lowStudent);
        int high = grades.get(highStudent);

        System.out.println("Class average is " + average + ".");
        System.out.println("Lowest grade is (" + low + " "+ lowStudent + ").");
        System.out.println("Highest grade is (" + high + " " + highStudent + ").");
        outputChart();
    }

    @Override
    public String toString() {
        return "GradeBook{course=" + course + ", students=" + students + "}";
    }


}
