package pl.edu.pjwstk.zadania;

import java.util.*;

public class Zadanie1 {
    public static void main(String[] args) {
        int[] tablica;
        Random random = new Random();
        tablica = new int[6];
        for (int i = 0; i < tablica.length ; i++){
            tablica[i] = random.nextInt(20);
        }
        System.out.println(tablica);

        for (int i = 0; i < tablica.length ;i++){
            System.out.println(tablica[i]);
        }
        Arrays.sort(tablica);
        System.out.println(Arrays.toString(tablica));
    }
}
