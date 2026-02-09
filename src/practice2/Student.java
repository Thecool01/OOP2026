package practice2;

public class Student {
    private String name;
    private String id;
    private int year_of_study;

    public Student(String name, String id) {
        this.name = name;
        this.id = id;
        this.year_of_study = 1; // Initialize the year from 1
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public int getYear_of_study() {
        return year_of_study;
    }

    public void incrementYearOfStudy() {
        year_of_study++;
    }


    @Override
    public String toString() {
        return ("Student name: " + name + " id: " + id);
    }
}