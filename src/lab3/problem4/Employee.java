package lab3.problem4;

import java.util.Date;
import java.util.Objects;

public class Employee extends Person implements Comparable<Employee>, Cloneable {
    private double annualSalary;
    private Date hireDate;
    private String insuranceNumber;

    public Employee(String name, Date hireDate, String insuranceNumber, double annualSalary) {
        super(name);
        this.hireDate = hireDate;
        this.insuranceNumber = insuranceNumber;
        this.annualSalary = annualSalary;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public String getInsuranceNumber() {
        return insuranceNumber;
    }

    public void setInsuranceNumber(String insuranceNumber) {
        this.insuranceNumber = insuranceNumber;
    }

    @Override
    public String toString() {
        return ("Employee : name='" + getName()
                + "', salary=" + getAnnualSalary()
                + ", hireDate=" + getHireDate()
                + ", insuranceNumber=" + getInsuranceNumber());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Employee)) return false;

        Employee other = (Employee) obj;

        return Objects.equals(getName(), other.getName())
                && Double.compare(getAnnualSalary(), other.getAnnualSalary()) == 0
                &&  Objects.equals(getHireDate(), other.getHireDate())
                && Objects.equals(getInsuranceNumber(), other.getInsuranceNumber());
    }

    @Override
    public int compareTo(Employee other) {
        return Double.compare(getAnnualSalary(), other.getAnnualSalary());
        // if a > b : 1. if a = b: 0. if a < b: -1
    }

    @Override
    public Employee clone() {
        return new Employee(
                getName(),
                (Date) getHireDate().clone(),
                getInsuranceNumber(),
                getAnnualSalary()
        );
    }

}
