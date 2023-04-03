package aula05;
import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateYMD data = null;
        int operation;
        do {
            System.out.println("Date operations");
            System.out.println("1 - create new date");
            System.out.println("2 - show current date");
            System.out.println("3 - increment date");
            System.out.println("4 - decrement date");
            System.out.println("0 - exit");

            operation = sc.nextInt();

            switch (operation) {
                case 1:
                    System.out.print("Day: ");
                    int day = sc.nextInt();
                    System.out.print("Month: ");
                    int month = sc.nextInt();
                    System.out.print("Year: ");
                    int year = sc.nextInt();

                    data = new DateYMD(day, month, year);

                case 2:
                    if (data != null) {
                        System.out.println("\nCurrent date: " + data);
                    } else {
                        System.out.println("\nNo date created yet");
                    }
                    break;
                case 3:
                    data.increment();
                case 4:
                    data.decrement();
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

            
    
    



