package aula05;
import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int operation;
        int month = 1;
        int year = 1;
        calendar calendar = null;

        do {
            System.out.println("Calendar operations");
            System.out.println("1 - create new calendar");
            System.out.println("2 - print calendar month");
            System.out.println("3 - print calendar");
            System.out.println("4 - add event");
            System.out.println("5 - remove event");
            System.out.println("0 - exit");

            operation = sc.nextInt();

            switch (operation) {
                case 1:
                    calendar = new calendar();
                    System.out.println("Enter year: ");
                    year = sc.nextInt();
                    System.out.println("Enter first weekday: ");
                    int firstWeekday = sc.nextInt();
                    calendar.Calendario(year, firstWeekday);
                    break;
                case 2:
                    if (calendar == null) {
                        System.out.println("Create a calendar first");
                        break;
                    } else{
                        System.out.println("Enter month: ");
                        month = sc.nextInt();
                        System.out.println(calendar.printMonth(month));
                        break;
                    }
                case 3:
                    System.out.println(calendar.toString());
                    break;
                case 4:
                    if (calendar == null) {
                        System.out.println("Create a calendar first");
                        break;
                    } else{
                        System.out.println("Enter month: ");
                        month = sc.nextInt();
                        System.out.println("Enter day: ");
                        int day = sc.nextInt();
                        calendar.addEvent(new DateYMD(day, month, year));
                        break;
                    }
                    
                case 5:
                    if (calendar == null) {
                        System.out.println("Create a calendar first");
                        break;
                    } else{
                        System.out.println("Enter month: ");
                        month = sc.nextInt();
                        System.out.println("Enter day: ");
                        int day = sc.nextInt();
                        calendar.removeEvent(new DateYMD(day, month, year));
                    }
                case 0:
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }
            System.out.println();

        } while (operation != 0);

        sc.close();
    }        
}