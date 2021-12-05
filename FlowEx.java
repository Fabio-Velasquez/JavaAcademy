package JavaAcademy;

import java.util.Scanner;

public class FlowEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your name");
        String name = scanner.nextLine();
        System.out.println("your name is" + name);
        scanner.close();
    }

    public static void printDayOfTheWeek(int day) {

        switch(day){
        case 0:
        System.out.print("monday");
        break; 
        case 1:
        System.out.print("Tuesday");
        break; 
        case 2: 
        System.out.print("Wednesday");
        break; 
        case 3:
        System.out.print("Thurs");
        break; 
        case 4:
        System.out.print("Friday");
        break; 
        case 5:
        System.out.print("Saturday");
        break; 
        case 6:
        System.out.print("Sunday");
        break; 
        default: 
        System.out.print("Invalid Input");
        break; 
    }
    }
}
