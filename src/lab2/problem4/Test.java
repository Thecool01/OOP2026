package lab2.problem4;

public class Test {

    public static double round(double value) {
        return Math.round(value * 100.0) / 100.0;
    }

    public static void main(String[] args) {
        Circuit a = new Resistor(3.0);
        Circuit b = new Resistor(3.0);
        Circuit c = new Resistor(6.0);
        Circuit d = new Resistor(3.0);
        Circuit e = new Resistor(2.0);

        Circuit f = new Series(a, b);
        Circuit g = new Parallel(c, d);
        Circuit h = new Series(g, e);
        Circuit circuit = new Parallel(h, f);


        circuit.applyPotentialDiff(12.0);

        System.out.println("Equivalent resistance: " + round(circuit.getResistance()));

        System.out.println("Total voltage: " + round(circuit.getPotentialDiff()));
        System.out.println("Total current: " + round(circuit.getCurrent()));
        System.out.println("Total power: " + round(circuit.getPower()));

        System.out.println("Voltage on a: " + round(a.getPotentialDiff()));
        System.out.println("Voltage on b: " + round(b.getPotentialDiff()));
        System.out.println("Voltage on c: " + round(c.getPotentialDiff()));
        System.out.println("Voltage on d: " + round(d.getPotentialDiff()));
        System.out.println("Voltage on e: " + round(e.getPotentialDiff()));
    }
}