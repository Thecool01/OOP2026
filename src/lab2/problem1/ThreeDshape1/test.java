package lab2.problem1.ThreeDshape1;

public class test {
    public static void main(String[] args) {
        Cylinder cylinder1 = new Cylinder(3, 5);
        Sphere sphere1 = new Sphere(4);
        Cube cube1 = new Cube(2);

        // CYLINDER TEST
        System.out.println("CYLINDER TEST");
        System.out.println("Volume: " + cylinder1.volume());
        System.out.println("Surface Area: " + cylinder1.surfaceArea());

        // SPHERE TEST
        System.out.println("SPHERE TEST");
        System.out.println("Volume: " + sphere1.volume());
        System.out.println("Surface Area: " + sphere1.surfaceArea());

        // CUBE TEST
        System.out.println("CUBE TEST");
        System.out.println("Volume: " + cube1.volume());
        System.out.println("Surface Area: " + cube1.surfaceArea());
    }
}
