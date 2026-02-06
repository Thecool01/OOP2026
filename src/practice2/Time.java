package practice2;

public class Time {
    private int hours, minutes, seconds;

    public Time(int hours, int minutes, int seconds) {
        if (hours >= 0 && hours <= 23) {
            this.hours = hours;
        }
        else {
            this.hours = 0;
        }
        if (minutes >= 0 && minutes <= 59) {
            this.minutes = minutes;
        }
        else {
            this.minutes = 0;
        }
        if (seconds >= 0 && seconds <= 59) {
            this.seconds = seconds;
        }
        else {
            this.seconds = 0;
        }
    }

    public String toUniversal() {
        String uni_h, uni_m, uni_s;

        // HOURS
        if (hours < 10) {
            uni_h = "0" + hours;
        }
        else {
            uni_h = hours + "";
        }

        // MINUTES
        if (minutes < 10) {
            uni_m = "0" + minutes;
        }
        else {
            uni_m = minutes + "";
        }

        // SECONDS
        if (seconds < 10) {
            uni_s = "0" + seconds;
        }
        else {
            uni_s = seconds + "";
        }

        String result = uni_h + ":" + uni_m + ":" + uni_s;

        return result;
    }

    public String toStandard() {
        String period, std_h, std_m, std_s;

        // STANDARD HOURS
        if (hours < 12) {
            period = "AM";
        }
        else {
            period = "PM";
        }

        if (hours == 0) {
            std_h = "12";
        }
        else if (hours > 12) {
            std_h = (hours - 12) + "";
        }
        else {
            std_h = hours + "";
        }

        // MINUTES
        if (minutes < 10) {
            std_m = "0" + minutes;
        }
        else {
            std_m = minutes + "";
        }

        // SECONDS
        if (seconds < 10) {
            std_s = "0" + seconds;
        }
        else {
            std_s = seconds + "";
        }

        String result = std_h + ":" + std_m + ":" + std_s + " " + period;
        return result;

    }
    public void adding_time(Time t) {
        // Sum of the SECONDS
        int totalSeconds = this.seconds + t.seconds;
        int extraMin = totalSeconds / 60;
        this.seconds = totalSeconds % 60;

        // Sum of the MINUTES
        int totalMinutes = this.minutes + t.minutes + extraMin;
        int extraHours = totalMinutes / 60;
        this.minutes = totalMinutes % 60;

        // Sum of the HOURS
        int totalHours = this.hours + t.hours + extraHours;
        this.hours = totalHours % 24;

    }

}
