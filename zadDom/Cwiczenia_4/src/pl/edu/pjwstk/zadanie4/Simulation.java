package pl.edu.pjwstk.zadanie4;

import java.util.*;

public class Simulation {
    // Uznałem że klasa z pieniążkiem jest całkowicie niepotrzebna!
    private final int counter;

    public Simulation(int counter) {
        this.counter = counter;
    }

    public void game(){
        int[] arr = new int[this.counter];
        for(int i = 0 ; i < this.counter ; i++) {
            arr[i] = new Random().nextInt(2);
        }
        int up = counterNumbers(arr, 0);
        int down = counterNumbers(arr, 1);
        double percentUp = ((double)up/(double)this.counter) * 100;
        double percentDown = ((double)down/(double)this.counter) * 100;
        System.out.println(percentUp + "% - Orzeł\t" + percentDown + "% - Reszka - Dla " + this.counter + " Rzutów");
    }

    private int counterNumbers(int[] arr, int whatCount){
        int counter = 0;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == whatCount){
                counter++;
            }
        }
        return counter;
    }
}
