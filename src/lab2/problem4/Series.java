package lab2.problem4;

public class Series extends Circuit {
    private Circuit first;
    private Circuit second;
    private double potentialDifference;

    public Series(Circuit first, Circuit second) {
        this.first = first;
        this.second = second;
        this.potentialDifference = 0.0;
    }


    @Override
    public double getResistance() {
        return first.getResistance() + second.getResistance();
    }

    @Override
    public double getPotentialDiff() {
        return potentialDifference;
    }

    // If two circuits are connected in series:
    // resistance = sum of resistances
    // the current in both parts is the same
    // voltage is divided proportionally to resistance

    @Override
    public void applyPotentialDiff(double v) {
        potentialDifference = v;

        double totalResistance = getResistance();
        double current = v / totalResistance;
        // voltage on the first part: V1 = I * R1
        double v1 = current * first.getResistance();
        // voltage on the second part: V2 = I * R2
        double v2 = current * second.getResistance();

        first.applyPotentialDiff(v1);
        second.applyPotentialDiff(v2);
    }
}