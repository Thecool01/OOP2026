package lab3.problem4;

import java.util.Date;
import java.util.Objects;
import java.util.Vector;


public class Manager extends Employee {
    private Vector<Employee> team;
    private double bonus;

    public Manager(String name, double annualSalary, Date hireDate, String insuranceNumber, Vector<Employee> team, double bonus) {
        super(name, hireDate, insuranceNumber, annualSalary);
        this.team = team;
        this.bonus = bonus;
    }

    public Vector<Employee> getTeam() {
        return team;
    }

    public void setTeams(Vector<Employee> team) {
        this.team = team;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "employee=" + super.toString() +
                ", bonus=" + bonus +
                ", teamSize=" + team.size() +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Manager)) return false;
        if (!super.equals(obj)) return false;

        Manager other = (Manager) obj;
        return Double.compare(bonus, other.bonus) == 0 &&  Objects.equals(team, other.team);
    }

    @Override
    public int compareTo(Employee other) {
        int salaryCompare = Double.compare(this.getAnnualSalary(), other.getAnnualSalary());

        if (salaryCompare != 0) return salaryCompare;

        if (other instanceof Manager) {
            Manager otherManager = (Manager) other;
            return Double.compare(this.bonus, otherManager.bonus);
        }

        return salaryCompare;
    }

    @Override
    public Manager clone() {
        Vector<Employee> teamClone = new Vector<>(this.team);

        return new Manager (
                this.getName(),
                this.getAnnualSalary(),
                (Date) this.getHireDate().clone(),
                this.getInsuranceNumber(),
                teamClone,
                this.getBonus()
        );
    }


}
