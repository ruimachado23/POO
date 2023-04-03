package aula07;

public class DateND extends Date {
    private int daysFrom2000;

    public DateND(int day, int month, int year) {
        int daysInYear = 365;
        int leapYearDays = 1;
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        daysFrom2000 = (year - 2000) * daysInYear + (year - 1997) / 4; 
        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0) && month > 2) {
            daysFrom2000 += leapYearDays; 
        }
        for (int i = 0; i < month - 1; i++) {
            daysFrom2000 += daysInMonth[i];
        }
        daysFrom2000 += day - 1; 
    }

    public int getDay() {
        return (daysFrom2000 % 365) % 31 + 1; 
    }

    public int getMonth() {
        int dayOfYear = daysFrom2000 % 365;
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int month = 0;
        for (int days : daysInMonth) {
            dayOfYear -= days;
            month++;
            if (dayOfYear < 0) {
                break;
            }
        }
        return month;
    }

    public int getYear() {
        int dayOfYear = daysFrom2000 % 365;
        int year = 2000 + (daysFrom2000 / 365);
        if (dayOfYear >= 365 && (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0))) {
            year++; 
        }
        return year;
    }

    public void increment() {
        daysFrom2000++;
    }

    public void decrement() {
        daysFrom2000--;
    }

    public String toString() {
        return String.format("%02d/%02d/%04d", getDay(), getMonth(), getYear());
    }
}
