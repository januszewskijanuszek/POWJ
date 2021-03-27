package pl.edu.pjwstk.zadania;

import java.util.*;

public class Zadanie3 {
    private static char checkChar(int input){
        return input == 1 ? 'X' : 'O';
    }
    public static void main(String[] args) {
        Random ran = new Random();
        int dlugosc = 10;
        int szerokosc = 5;
        char[][] arr = new char [szerokosc][dlugosc];
        for (int i = 0 ; i < szerokosc ; i++){
            for(int j = 0 ; j < dlugosc ; j++){
                arr[i][j] = checkChar(ran.nextInt(2));
            }
        }
        for (int i = 0 ; i < szerokosc ; i++){
            for (int j = 0 ; j < dlugosc ; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
