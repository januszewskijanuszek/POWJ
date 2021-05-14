package pl.edu.pjwstk.zadania.example1;

public class App {
    public static void main(String[] args) {
        // Typy generyczne
        // Dowolne argumenty!
        // Co tu ma być
        Pair<Integer, Integer> pair = new Pair<>(1, 5);
        Pair<String, String> pair3 = new Pair<>("16666", "5");
        Pair<String, Integer> pair2 = new Pair<>("16666", 5);

        int first = (int) pair.getFirst();
        System.out.println(first);

        // Mówimy mu że tu jest string bo nie wie
        int  first1 = pair.getFirst();
        System.out.println(first1);

        // Wyrzuca błąd
        String first2 = pair3.getFirst();
        System.out.println(first2.toUpperCase());

        System.out.println(pair2.getFirst() + " " + pair2.getSecond());
    }
}
