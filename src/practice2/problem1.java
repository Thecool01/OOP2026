package practice2;

public class problem1 {
    public static void main(String[] args) {
        Student student1 = new Student("Nikolay", "24B031822");

        System.out.println("Name: " + student1.getName());
        System.out.println("ID: " + student1.getId());
        System.out.println("Year of study: " + student1.getYear_of_study());

        student1.incrementYearOfStudy();

        System.out.println("Year after increment of the student " + student1.getName() + ": " + student1.getYear_of_study());
    }

}
