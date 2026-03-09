package lab2.problem5;

public class PhDStudent extends Student {
    private String researchingProject;

    public PhDStudent(String name, int age, String major, String researchingProject) {
        super(name, age, major);
        this.researchingProject = researchingProject;
    }

    public String getResearchingProject() {
        return researchingProject;
    }

    @Override
    public String getOccupation() {
        return "PhD Student, researching project: " + this.researchingProject;
    }

    @Override
    public void assignPet(Animal pet) {
        if (pet instanceof Dog) {
            System.out.println("PhD Students cannot take care of a dog.");
            return;
        }
        super.assignPet(pet);
    }
}
