package pl.edu.pjwstk.pracaDomowa;

import java.util.*;

public class Zadanie5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        int counter = 2;

        int lenght = scan.nextInt();
        int height = scan.nextInt();

        int[][][] arr = new int[counter][lenght][height];

        // Creating array
        for(int r = 0 ; r < counter ; r++) {
            System.out.println("Numer macierzy: " + (r + 1));
            for (int i = 0; i < lenght; i++) {
                for (int j = 0; j < height; j++) {
                    //arr[r][i][j] = rand.nextInt(10);
                    arr[r][i][j] = scan.nextInt();
                }
            }
            System.out.println(" ");
        }

        for(int r = 0 ; r < counter - 1 ; r++) {
            for (int i = 0; i < lenght; i++) {
                for (int j = 0; j < height; j++) {
                    System.out.print((arr[r][i][j] -= arr[r+1][i][j]) + " ");
                }
                System.out.println(" ");
            }
        }
    }
}
