package pl.edu.pjwstk.zadDom1;

import java.util.Random;
import java.util.Scanner;

public class Prac5 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int fight = random.nextInt(3);
        //System.out.println(fight);
        // 0 - kamień
        // 1 - papier
        // 2 - norzyce
        int chose = scanner.nextInt();
        if(chose == fight){
            System.out.println("Remis");
        }
        else if (chose == 0 && fight == 1){
            System.out.println("Przegrana");
        }
        else if (chose == 0 && fight == 2){
            System.out.println("Wygrana");
        }
        else if (chose == 1 && fight == 0){
            System.out.println("Wygrana");
        }
        else if (chose == 1 && fight == 2){
            System.out.println("Przegrana");
        }
        else if (chose == 2 && fight == 0){
            System.out.println("Przegrana");
        }
        else if (chose == 2 && fight == 1){
            System.out.println("Wygrana");
        }
    }
}
