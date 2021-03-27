package pl.edu.pjwstk.lab1;

import java.util.Scanner;

public class zadanie5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char pierwszaLitera = scanner.nextLine().toCharArray()[0];
        char drugaLitera = scanner.nextLine().toCharArray()[0];

        if (pierwszaLitera < drugaLitera){
            System.out.println(pierwszaLitera + " " + drugaLitera);
        } else{
            System.out.println(drugaLitera + " " + pierwszaLitera);
        }

    }
}
