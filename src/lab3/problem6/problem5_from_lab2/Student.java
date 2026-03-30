package lab3.problem6.problem5_from_lab2;

import lab3.problem6.problem5_from_lab2.Abstract.Person;

public class Student extends Person {
    private String major;

    public Student(String name, int age, String major) {
        super(name, age);
        this.major = major;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String getOccupation() {
        return "Student, major: " + this.major;
    }

}
