package lab3.problem1;

import lab3.problem1.Interfaces.CanHaveJob;

public class Student extends Person implements CanHaveJob {
    private String university;

    public Student(String name, int age, String university) {
        super(name, age);
        this.university = university;
    }

    @Override
    public void haveJob() {
        System.out.println("The student " + getName() + " has a job.");
    }


}
