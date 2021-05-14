package pl.edu.pjwstk.zadanie6;

import java.time.*;
import java.util.Scanner;

public class Clock {
    private LocalTime date;

    public Clock() {
        this.date = LocalTime.now();
    }

    public void displayTime(){
        Scanner scan = new Scanner(System.in);
        boolean isExit = false;
        do{
            menu();
            try{
                int choice = scan.nextInt();
                switch (choice){
                    // Troche zrobione po żydowsku, ale była majówka i krucho z czasem miałem
                    case 1 :{
                        timeReturn(date.plusHours(7), 7);
                        break;
                    }
                    case 2 :{
                        timeReturn(date.minusHours(6), -6);
                        break;
                    }
                    case 3:{
                        timeReturn(date.plusHours(1), 1);
                        break;
                    }
                    default:{
                        isExit = true;
                    }
                }
            }catch (NumberFormatException e){
                System.out.println("Input correct data!");
            }
        }while(!isExit);

    }

    private void menu(){
        System.out.println("Your time: " + this.date);
        System.out.println("1 - Tokyo time");
        System.out.println("2 - New York time");
        System.out.println("3 - Moscow time");
        System.out.println("4 - Exit");
    }
    private void timeReturn(LocalTime time, int day){
        if(date.getHour() + day >= 24)              System.out.println("Time: + day " + time);
        else if (date.getHour() + day <= 0)         System.out.println("Time: - day " + time);
        else                                        System.out.println("Time: " + time);
    }
}
