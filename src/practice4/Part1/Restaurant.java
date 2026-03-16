package practice4.Part1;

import practice4.Part1.Interfaces.CanHavePizza;

public class Restaurant {

    public boolean servePizza(CanHavePizza eater) {
        eater.eatPizza();

        if (eater instanceof Person) {
            System.out.println("Processing payment...");
        } else {
            System.out.println("No payment needed for the cat.");
        }

        return true;
    }
}