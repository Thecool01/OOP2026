package lab2.problem1.ThreeDshape1;

import java.awt.*;

public class Sphere extends Shape3D {
    private double radius;

    public Sphere (double radius) {
        this.radius = radius;
    }

    public double volume () {
        return ((double) 4 / 3) * Math.PI * Math.pow(radius, 3);
    }

    public double surfaceArea () {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

}
