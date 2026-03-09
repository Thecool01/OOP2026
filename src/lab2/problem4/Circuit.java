package lab2.problem4;

// current: I = V / R
// power: P = V^2 / R

// V — potential difference
// R — resistance
// I — current
// P — power

public abstract class  Circuit {
    public abstract double getResistance();
    public abstract double getPotentialDiff();
    public abstract void applyPotentialDiff(double v);

    public double getCurrent() {
        // current = V / R
        return getPotentialDiff() / getResistance();
    }

    public double getPower() {
        // power = V * V / R
        double v = getPotentialDiff();
        return v * v / getResistance();
    }
}
