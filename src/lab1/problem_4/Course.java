package lab1.problem_4;

import java.util.List;

public class Course {
    private String name;
    private String description;
    private int credits;
    private List<String> prerequisites;

    public Course(String name, String description, int credits, List<String> prerequisites) {
        this.name = name;
        this.description = description;
        this.credits = credits;
        this.prerequisites = prerequisites;
    }

    public String getName() { return name;}
    public String getDescription() { return description; }
    public int getCredits() { return credits; }
    public List<String> getPrerequisite() { return prerequisites; }

    @Override
    public String toString() {
        return "Course: Name='" + name + "', Description= '" + description + "', Credits='" + credits + "', Prerequisite='" + prerequisites + "'";
    }
}
