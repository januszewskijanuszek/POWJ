package pl.edu.pjwstk.zadanie2;


import java.util.Random;

public class App {
    public static void main(String[] args) {
        Order zamowienie1 = new Order();
        Order zamowienie2 = new Order(5);

        zamowienie1.Print();
        zamowienie2.Print();
    }
}
