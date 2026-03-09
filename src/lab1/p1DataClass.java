package lab1;

public class p1DataClass {
    private double sum;
    private double max;
    private int count;

    public p1DataClass() {
        sum = 0;
        max = Double.NEGATIVE_INFINITY;
        count = 0;
    }

    public void addValue(double value) {
        sum = sum + value;
        count++;

        if (value > max)
            max = value;
    }

    public double getAverage() {
        if (count == 0) {
            return 0;
        }
        return sum / count;
    }

    public double getMax() {
        if (count == 0) {
            return 0;
        }
        return max;
    }

}
