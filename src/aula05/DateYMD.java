package aula05;

public class DateYMD {
    private int year;
    private int month;
    private int day;

    public DateYMD(int day, int month, int year) {
        if (!valid(day, month, year)) {
            System.out.println("Erro , data inválida!");
        } else {
            System.out.println("Data válida!");
        }

        this.day = day;
        this.month = month;
        this.year = year;
    }

    public static boolean validMonth(int month){
        return month > 0 && month < 13;
    }
    
    public static int monthDays(int month, int year) {
        switch (year) {
            case 2:
                return leapYear(year) ? 29 : 28;
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            default:
                return 30;
        }
    }

    private static boolean leapYear(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    public static boolean valid(int day, int month, int year) {
        return validMonth(month) && day > 0 && day <= monthDays(month, year) && year > 0 ;
    }

    public void set(int day, int month, int year) {
        if (!valid(day, month, year)) {
            throw new IllegalArgumentException("Invalid date");
        }
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void increment() {
        if (day < monthDays(month, year)) {
            day++;
        } else if (month < 12) {
            day = 1;
            month++;
        } else {
            day = 1;
            month = 1;
            year++;
        }
    }

    public void decrement() {
        if (day > 1) {
            day--;
        } else if (month > 1) {
            month--;
            day = monthDays(month, year);
        } else {
            year--;
            month = 12;
            day = monthDays(month, year);
        }
    }

    public String toString() {
        return String.format("%04d/%02d/%02d", year, month, day);
    }


    public static String monthName(int month){
        switch (month) {
            case 1:
                return "Janeiro";
            case 2:
                return "Fevereiro";
            case 3:
                return "Março";
            case 4:
                return "Abril";
            case 5:
                return "Maio";
            case 6:
                return "Junho";
            case 7:
                return "Julho";
            case 8:
                return "Agosto";
            case 9:
                return "Setembro";
            case 10:
                return "Outubro";
            case 11:
                return "Novembro";
            case 12:
                return "Dezembro";
            default:
                return "Mês inválido";
        }

    
    }
    
    public int getMonthDays() {
        return monthDays(month, year);
    }

    public DateYMD addDays(int days) {
        int totalDays = day + days;
        int monthDays = getMonthDays();
        int newYear = year;
        int newMonth = month;
        int newDay = totalDays;
        
        while (newDay > monthDays) {
            newDay -= monthDays;
            newMonth++;
            if (newMonth > 12) {
                newMonth = 1;
                newYear++;
            }
            monthDays = monthDays(newMonth, newYear);
        }
        
        return new DateYMD(newYear, newMonth, newDay);
    }
}
    