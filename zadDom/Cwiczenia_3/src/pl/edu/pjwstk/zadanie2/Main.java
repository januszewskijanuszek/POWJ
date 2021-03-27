package pl.edu.pjwstk.zadanie2;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();

        Point punkt1 = new Point(rand.nextInt(10), rand.nextInt(10));
        Point punkt2 = new Point(rand.nextInt(10), rand.nextInt(10));

        punkt1.getLocation();
        System.out.println(" ");
        punkt2.getLocation();
        System.out.println(" ");

        System.out.println("Odległość: " + punkt1.getLenght(punkt2.getX(),punkt2.getY()));

    }
}
