package pl.edu.pjwstk.zadanie1;

import java.util.function.ObjIntConsumer;

public class MyList<E> {

    private E[] arr;
    private int lastItemIdx;

    public MyList(){
        this.arr = (E[]) new Object[20];
    }

    public boolean add(E element){
        try {
            arr[lastItemIdx + 1] = element;
            lastItemIdx++;
            return true;
        } catch (ArrayIndexOutOfBoundsException e){
            return false;
        }
    }

}
