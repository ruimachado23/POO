package aula05;

public class calendar {
    private int[][] eventos; 
    private int firstWeekday; 
    private int year; 
    
    public void Calendario(int year, int firstWeekday) {
        this.year = year;
        this.firstWeekday = firstWeekday;
        eventos = new int[12][31]; 
    }
    
    public int year() {
        return year;
    }
    
    public int firstWeekdayOfYear() {
        return firstWeekday;
    }
    
    public int firstWeekdayOfMonth(int month) {
        int a = (14 - month) / 12;
        int y = year - a;
        int m = month + 12 * a - 2;
        int d = 1;
        int weekday = (d + y + y/4 - y/100 + y/400 + (31*m)/12) % 7;
        return (weekday + firstWeekday - 1) % 7 + 1;
    }
    
    public void addEvent(DateYMD date) {
    int day = date.getDay() - 1;
    int month = date.getMonth() - 1;
    if (month >= 0 && month < 12 && day >= 0 && day < DateYMD.monthDays(month + 1, year)) {
        eventos[month][day]++;
    } else {
        System.out.println("Invalid date.");
    }
}

    
    public void removeEvent(DateYMD date) {
        int day = date.getDay() - 1;
        int month = date.getMonth() - 1;
        eventos[month][day]--;
        if (eventos[month][day] < 0) eventos[month][day] = 0;
    }
    
    public String printMonth(int month) {
        int numDays = DateYMD.monthDays(month, year);
        int firstWeekday = firstWeekdayOfMonth(month);
        StringBuilder sb = new StringBuilder();
        sb.append("Dom Seg Ter Qua Qui Sex Sab\n");
        for (int i = 1; i < firstWeekday; i++) {
            sb.append("    ");
        }
        for (int day = 1; day <= numDays; day++) {
            if (day < 10) {
                sb.append(" ");
            }
            if (eventos[month-1][day-1] > 0) {
                sb.append("*");
            } else {
                sb.append(" ");
            }
            sb.append(day);
            sb.append(" ");
            if ((firstWeekday + day - 1) % 7 == 0) {
                sb.append("\n");
            }
        }
        sb.append("\n");
        return sb.toString();
    }
    
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int month = 1; month <= 12; month++) {
            sb.append(DateYMD.monthName(month) + "\n"); 
            sb.append(printMonth(month)); 
        }
        return sb.toString();
    }
}
