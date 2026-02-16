package lab1.problem_1;

public class p1DataClass {
    private double sum;
    private double max;
    private int count;

    public p1DataClass() {
        sum = 0;
        max = Double.NEGATIVE_INFINITY;
        count = 0;
    }

    // ADDING
    public void addValue(double value) {
        sum = sum + value;
        count++;

        if (value > max)
            max = value;
    }

    // GET AVERAGE
    public double getAverage() {
        if (count == 0) {
            return 0;
        }
        return sum / count;
    }

    // GET MAX
    public double getMax() {
        if (count == 0) {
            return 0;
        }
        return max;
    }

}
