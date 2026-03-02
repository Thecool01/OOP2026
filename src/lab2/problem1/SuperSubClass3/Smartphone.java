package lab2.problem1.SuperSubClass3;

import java.util.Objects;

public class Smartphone {
    private String country;
    private int yearManufactured;
    private String imei;

    public Smartphone(String country, int yearManufactured, String imei) {
        this.country = country;
        this.yearManufactured = yearManufactured;
        this.imei = imei;
    }

    public String getCountry() {
        return this.country;
    }
    public void setCountry(String country) {
        this.country = country;
    }

    public int getYearManufactured() {
        return this.yearManufactured;
    }

    public void setYearManufactured(int ageManufactured) {
        this.yearManufactured = yearManufactured;
    }

    public String getImei() {
        return this.imei;
    }




    @Override
    public String toString() {
        return ("Smartphone: Country: " + this.country + ", AgeManufactured: " + this.yearManufactured);
    }

    // EQUALS
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Smartphone)) return false; // IF THE CLASS IS NOT SUBCLASS OF THE SMARTPHONE
        Smartphone smartphone = (Smartphone) obj;
        return Objects.equals(imei, smartphone.imei);

    }

    @Override
    public int hashCode() {
        return Objects.hash(imei); // IMEI IS UNIQUE FOR EACH SMARTPHONE
    }


}
