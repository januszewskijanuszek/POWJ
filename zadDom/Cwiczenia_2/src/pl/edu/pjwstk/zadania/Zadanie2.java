package pl.edu.pjwstk.zadania;

import java.util.*;

public class Zadanie2 {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        Random ran = new Random();
        int input = sca.nextInt();
        int[] array = new int[input];
        for (int i = 0 ; i < array.length ; i++){
            array[i] = ran.nextInt(10) + 1;
        }
        System.out.println(Arrays.toString(array));
        //Pretestowanie sortowania
        Arrays.sort(array);
        for (int i = input - 1; i >= 0 ; i--){
            System.out.println(array[i]);
        }
    }
}
