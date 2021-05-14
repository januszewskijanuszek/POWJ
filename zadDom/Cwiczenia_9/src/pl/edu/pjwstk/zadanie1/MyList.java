package pl.edu.pjwstk.zadanie1;

import java.util.Arrays;
import java.util.function.ObjIntConsumer;

public class MyList<E> {

    private E[] arr;
    private int lastItemIdx;

    public MyList(){
        this.arr = (E[]) new Object[20];
    }

    public boolean add(E element){
        try {
            arr[lastItemIdx] = element;
            lastItemIdx++;
            return true;
        } catch (ArrayIndexOutOfBoundsException e){
            // Zadanie 4
            this.arr = Arrays.copyOf(arr, arr.length*2);
            return false;
        }
    }

    public int size(){
        return arr.length;
    }

    public boolean contains(E element){
        for(E item : arr){
            if(item == element) return true;
        }
        return false;
    }

    public int indexOf(E element){
        for (int i = 0; i < arr.length; i++){
            if(element.equals(arr[i])) return i;
        }
        return -1;
    }

    public int lastIndexOf(E element){
        for(int i = arr.length - 1 ; i >= 0 ; i--){
            if(element.equals(arr[i]) ) return i;
        }
        return -1;
    }

    public E get(int index){
        try{
            return arr[index];
        }catch (IndexOutOfBoundsException exc){
            throw exc;
        }
    }

    public void set(int index, E element){
        get(index);
        arr[index] = element;
    }
}
