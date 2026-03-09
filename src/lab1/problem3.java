package lab1;

public class problem3 {
    public static void main(String args[]) {
        // 1) Default constructor: 0 degrees Celsius
        p3Temperature t1 = new p3Temperature();
        System.out.println("t1 (default constructor)");
        System.out.println("Scale: " + t1.getScale());
        System.out.println("Value in Celsius: " + t1.getValueInCelsius());
        System.out.println("Value in Fahrenheit: " + t1.getValueInFahrenheit());
        System.out.println();

        // 2) Constructor with temperature value (scale is Celsius by default)
        p3Temperature t2 = new p3Temperature(100);
        System.out.println("t2 (constructor with value, 100 C)");
        System.out.println("Scale: " + t2.getScale());
        System.out.println("Value in Celsius: " + t2.getValueInCelsius());
        System.out.println("Value in Fahrenheit: " + t2.getValueInFahrenheit());
        System.out.println();

        // 3) Constructor with scale only (value is 0 by default)
        p3Temperature t3 = new p3Temperature('F');
        System.out.println("t3 (constructor with scale, 0 F)");
        System.out.println("Scale: " + t3.getScale());
        System.out.println("Value in Celsius: " + t3.getValueInCelsius());
        System.out.println("Value in Fahrenheit: " + t3.getValueInFahrenheit());
        System.out.println();

        // 4) Constructor with both value and scale
        p3Temperature t4 = new p3Temperature(32, 'F');
        System.out.println("t4 (constructor with value and scale, 32 F)");
        System.out.println("Scale: " + t4.getScale());
        System.out.println("Value in Celsius: " + t4.getValueInCelsius());
        System.out.println("Value in Fahrenheit: " + t4.getValueInFahrenheit());
        System.out.println();

        // 5) Using setters: change value and scale separately
        t4.setOnlyValue(0);
        t4.setOnlyScale('C');
        System.out.println("t4 after setOnlyValue and setOnlyScale");
        System.out.println("Scale: " + t4.getScale());
        System.out.println("Value in Celsius: " + t4.getValueInCelsius());
        System.out.println("Value in Fahrenheit: " + t4.getValueInFahrenheit());
        System.out.println();

        // 6) Setting value and scale at the same time
        t4.setValue(212, 'F');
        System.out.println("t4 after setValue(212, 'F')");
        System.out.println("Scale: " + t4.getScale());
        System.out.println("Value in Celsius: " + t4.getValueInCelsius());
        System.out.println("Value in Fahrenheit: " + t4.getValueInFahrenheit());
    }
}
