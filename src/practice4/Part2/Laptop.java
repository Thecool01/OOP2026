package practice4.Part2;

import practice4.Part2.Interfaces.Pluggable;

public class Laptop implements Pluggable {
    private String name;
    private int ageOfProduction;
    private String model;

    public Laptop(String name, int ageOfProduction, String model) {
        this.name = name;
        this.ageOfProduction = ageOfProduction;
        this.model = model;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAgeOfProduction() {
        return ageOfProduction;
    }
    public void setAgeOfProduction(int ageOfProduction) {
        this.ageOfProduction = ageOfProduction;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public void plugIn() {
        System.out.println("Laptop " + this.getName() + " " + getModel() + " is plugged in.");
    }
}
