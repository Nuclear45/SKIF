package objects;


import java.util.Calendar;

public class Schedule {

    private Calendar day;
    private Calendar month;
    private Calendar year;

    public Calendar getDay() {
        return day;
    }

    public Calendar getMonth() {
        return month;
    }

    public Calendar getYear() {
        return year;
    }

    public void setDay(Calendar day) {
        this.day = day;
    }

    public void setMonth(Calendar month) {
        this.month = month;
    }

    public void setYear(Calendar year) {
        this.year = year;
    }
}
