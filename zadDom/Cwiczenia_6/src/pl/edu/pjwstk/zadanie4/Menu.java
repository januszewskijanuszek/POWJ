package pl.edu.pjwstk.zadanie4;

import java.util.*;

public class Menu {
    private static void multiple(Time clock){
        System.out.print("Podaj o ile pomnożyc: ");
        int multiple = new Scanner(System.in).nextInt();
        clock.multiple(multiple);
    }

    private static Time addTime(Time clock){
       System.out.print("Ile chcesz dodać minut:");
       int hour = new Scanner(System.in).nextInt();
       System.out.print("Ile chcesz dodać godzin:");
       int minutes = new Scanner(System.in).nextInt();
       return clock.addTime(hour, minutes);
    }

    private static void menu(Time clock){
        System.out.println("Aktualny czas: " + clock.toString());
        System.out.println("Wybierz opcje: ");
        System.out.println("1 - Multiple ");
        System.out.println("2 - Add time ");
        System.out.println("3 - EXIT ");
    }

    public static void main(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj godziny");
        int hours = scan.nextInt();
        System.out.println("Podaj minuty: ");
        int minutes = scan.nextInt();
        Time clock = new Time(hours, minutes);
        boolean exit = true;
        do{
            menu(clock);
            int choise = scan.nextInt();
            switch (choise){
                case 1:     { multiple(clock);                              break; }
                case 2:     { System.out.println(addTime(clock).toString());break; }
                default:    { exit = false;}
            }
        }while (exit);
    }
}
