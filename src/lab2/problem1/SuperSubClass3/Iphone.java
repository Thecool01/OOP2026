package lab2.problem1.SuperSubClass3;

public class Iphone extends Smartphone{
    private String model;
    private String color;


    public Iphone(String country, int yearManufactured, String imei, String model, String color) {
        super(country, yearManufactured, imei);
        this.model = model;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
