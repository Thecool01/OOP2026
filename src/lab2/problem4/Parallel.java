package lab2.problem4;

// For parallel connection:
// - The voltage on both branches is the same
// - equivalent resistance according to reciprocal rule
public class Parallel extends Circuit {
    private Circuit first;
    private Circuit second;
    private double potentialDifference;

    public Parallel(Circuit first, Circuit second) {
        this.first = first;
        this.second = second;
        this.potentialDifference = 0.0;
    }

    @Override
    public double getResistance() {
        double r1 = first.getResistance();
        double r2 = second.getResistance();
        // 1 / R = 1/R1 + 1/R2
        return 1.0 / (1.0 / r1 + 1.0 / r2);
    }

    @Override
    public double getPotentialDiff() {
        return potentialDifference;
    }

    @Override
    public void applyPotentialDiff(double v) {
        potentialDifference = v;
        first.applyPotentialDiff(v);
        second.applyPotentialDiff(v);
    }
}
