package pl.edu.pjwstk.zadanie2;

import java.util.*;

public class Logic {
    public static void game(){
        boolean win = false;

        System.out.print("Wybierz początkową liczbę: ");
        int start = new Scanner(System.in).nextInt();

        System.out.print("Wybierz końcową liczbę: ");
        int end = new Scanner(System.in).nextInt();

        System.out.println("Gra sie zaczęła! Wybieraj liczby!");

        int randomNumber = new Random().nextInt((end - start) + 1) + start;
        do{
            int input = new Scanner(System.in).nextInt();
            if(input < randomNumber){
                System.out.println("Liczba jest za mała!");
            }
            else if(input > randomNumber){
                System.out.println("Liczba jest za duża!");
            }
            if(input < start){
                System.out.println("Cyfra jest mniejsza od przediału! Strzelaj z głową");
            }
            if(input > end){
                System.out.println("Cyfra jest większa od przediału! Strzelaj z głową");
            }
            else {
                System.out.println("Wygranie!");
                win = true;
            }
        }while(!win);
    }
}
