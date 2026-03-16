package practice4.Part1;

import practice4.Part1.Interfaces.CanHaveRetake;

public class Student extends Person implements CanHaveRetake {
    private int course;
    public Student(String name, int age, int course) {
        super(name, age);
        this.course = course;
    }

    public int getCourse() {
        return course;
    }
    public void setCourse(int course) {
        this.course = course;
    }

    @Override
    public void eatPizza() {
        System.out.println("The student " + this.getName() + " is eating pizza...");
    }

    @Override
    public void move() {
        System.out.println("The student " + this.getName() + " is moving...");
    }

    @Override
    public void dance() {
        System.out.println("The student " + this.getName() + " is dancing...");
    }

    @Override
    public void doRetake() {
        System.out.println("The student " + this.getName() + " is retaking the course...");
    }


}
