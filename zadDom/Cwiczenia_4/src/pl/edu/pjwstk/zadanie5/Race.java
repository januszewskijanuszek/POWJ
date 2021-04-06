package pl.edu.pjwstk.zadanie5;

import java.util.*;

public class Race {
    private static Zawodnik car1 = new Zawodnik(Car.AUDI);
    private static Zawodnik car2 = new Zawodnik(Car.BMW);
    private static Zawodnik car3 = new Zawodnik(Car.SUBARU);;
    public static void start()throws InterruptedException{
        System.out.println("Mistrzostwa świata w ścigankach!!!");
        System.out.println("Przed panstwem: ");
        car1.present();
        car2.present();
        car3.present();
        System.out.println("Czas rozpocząć zawody!!!!!");
        System.out.print("Podaj dystans jaki chcesz aby miał wyścig w kilometrzch: ");
        int input = new Scanner(System.in).nextInt();
        boolean win = false;
        int time = 0;
        do{
            System.out.println(" ");
            System.out.println("Sekunda: " + time);
            System.out.println(" ");
            car1.go(time);
            car2.go(time);
            car3.go(time);
            if(car1.win(input*1000)) win = true;
            if(car2.win(input*1000)) win = true;
            if(car3.win(input*1000)) win = true;
            time++;
            Thread.sleep(1000);
        }while(!win);
    }
}
