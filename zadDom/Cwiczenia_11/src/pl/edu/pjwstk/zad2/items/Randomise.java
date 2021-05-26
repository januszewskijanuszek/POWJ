package pl.edu.pjwstk.zad2.items;

import java.util.Random;

public class Randomise {
    private final int randomNumber;

    public Randomise() {
        Random rand = new Random();
        this.randomNumber = rand.nextInt(100) + 1;
    }

    public int getRandomNumber() {
        return randomNumber;
    }
}
