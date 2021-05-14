package pl.edu.pjwstk.zadanie3;

import java.util.Arrays;

public class FindMax<T> implements Comparable<T>{
    // Zawsze jak próbuje zrobić to statyczne to błąd mi wywala :(
   public T findMax(T[] object){

   }

    @Override
    public int compareTo(T o1, T o2) {
        return o1.toString().compareTo(o2.toString());
    }
}
