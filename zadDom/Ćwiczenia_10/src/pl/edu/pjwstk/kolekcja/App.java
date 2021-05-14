package pl.edu.pjwstk.kolekcja;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        int[] essa = {3,5,2,1,54,6,4,1};
        Arrays.sort(essa);
        for(int value : essa){
            System.out.println(value);
        }
    }
}
