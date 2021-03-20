package pl.edu.pjwstk.pracaDomowa;

import java.util.*;

public class Zadanie3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random ran = new Random();

        int heigh = ran.nextInt(6) + 2;
        int lenght = ran.nextInt(6) + 2;
        int[][] arr1 = new int[lenght][heigh];
        int[][] arr2 = new int[lenght][heigh];
        int[][] arrExe = new int[lenght][heigh];

        // Array 1
        for(int i = 0 ; i < lenght ; i++){
            for(int j = 0 ; j < heigh ; j++){
                arr1[i][j] = ran.nextInt(10);
            }
        }
        // Array 2
        for(int i = 0 ; i < lenght ; i++){
            for(int j = 0 ; j < heigh ; j++){
                arr2[i][j] = ran.nextInt(10);
            }
        }
        // ArrayExe
        for(int i = 0 ; i < lenght ; i++){
            for(int j = 0 ; j < heigh ; j++){
                arrExe[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        for(int i = 0 ; i < lenght ; i++){
            for(int j = 0 ; j < heigh ; j++){
                System.out.print(arrExe[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
