package pl.edu.pjwstk.zadanie4;

import java.util.*;

public class App {
    public static void main(String[] args) {
        // Można użyć HashSetu ale w zadaniu mowa jest o liście
        NoDuplicate<Integer> no = new NoDuplicate<>();
        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(12);
        list.add(11);
        list.add(12);
        list.add(11);
        list.add(13);
        list.add(14);
        list.add(14);
        list.add(14);
        no.notDuplicate(list);
        System.out.println(list);
    }
}
