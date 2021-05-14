package pl.edu.pjwstk.zadanie3;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        int[] ints = {3, 4, 2, 1};
        String[] Strings = {"B", "C", "A", "D"};

        Arrays.sort(ints, new FindMax<Integer>());
        Arrays.sort(Strings, new FindMax<String>());
    }
}
