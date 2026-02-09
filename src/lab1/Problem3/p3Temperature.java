package lab1.Problem3;

public class p3Temperature {
    private double value;
    private char scale;

    public p3Temperature() { // DEFAULT
        this.value = 0;
        this.scale = 'C';
    }

    public p3Temperature(char scale) {
        this.value = 0;
        this.scale = scale;
    }

    public p3Temperature(double value) {
        this.value = value;
        this.scale = 'C';
    }

    public p3Temperature(double value, char scale) {
        this.value = value;
        if (scale == 'F' || scale == 'C') {
            this.scale = scale;
        }
        else {
            this.scale = 'C';
        }
    }

    public double getValueInCelsius() {
        if (this.scale == 'C') {
            return this.value;
        }
        else {
            return (5 * (this.value - 32) / 9);
        }
    }

    public double getValueInFahrenheit() {
        if (this.scale == 'F') {
            return this.value;
        }
        else {
            return (9 * (this.value / 5) + 32);
        }
    }

    public void setOnlyValue(double value) {
        this.value = value;
    }

    public void setOnlyScale(char scale) {
        this.scale = scale;
    }

    public void setValue(double value, char scale) {
        this.value = value;
        this.scale = scale;
    }

    public char getScale(){
        return this.scale;
    }

}
