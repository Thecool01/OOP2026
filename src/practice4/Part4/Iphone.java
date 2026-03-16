package practice4.Part4;

import practice4.Part4.Interfaces.SellableAndPluggable;

public class Iphone extends Device implements SellableAndPluggable {
    private String model;
    public Iphone(String brand, String model) {
        super(brand);
        this.model = model;
    }

    @Override
    public void sell() {
        System.out.println("iPhone " + getBrand() + " is sold.");
    }

    @Override
    public void plugIn() {
        System.out.println("iPhone " + getBrand() + " is plugged in.");
    }
}
