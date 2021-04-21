package pl.edu.pjwstk.zadanie2;

import java.util.*;

public class Order {
    private Position[] positions;
    private final int maxSize;

    // Constructor
    public Order(int maxSize) {
        this.maxSize = maxSize;
    }

    public Order() {
        this.maxSize = 10;
    }

    private int checkValue(int[] array, int key){
        int counter = 0;
        for(int value : array){
            if(value == key) counter++;
        }
        return counter;
    }

    private void createPosition(){
        int[] arr1 = new int[maxSize];
        for(int i = 0 ; i < maxSize ; i++){
            Random rand = new Random();
            arr1[i] = rand.nextInt(Goods.values().length) - 1;
        }
        int[] arr2 = new int[Goods.values().length - 1];
        for(int i = 0 ; i < arr2.length ; i++){
            arr2[i] = checkValue(arr1, i);
        }
        int arrayLength = 0;
        for(int value : arr2){
            if(value != 0) arrayLength++;
        }
        int[] arrFinal = new int[arrayLength];
        int counter1 = 0;
        for(int i = 0 ; i < arr2.length ; i++){
            if(arr2[i] != 0){
                arrFinal[counter1] = arr2[i];
                counter1++;
            }
        }
        this.positions = new Position[arrayLength];
        int counter = 0;
        for(int value : arr2){
            if(value != 0){
                this.positions[counter] = new Position(
                        Goods.values()[counter].getName(),
                        arrFinal[counter],
                        Goods.values()[counter].getCost());
                counter++;
            }
        }
    }

    private int calculateValue(){
        int buffer = 0;
        for(Position position : positions){
            buffer = buffer + position.calculateValue();
        }
        return buffer;
    }

    public void Print(){
        createPosition();
        for(Position position : positions){
            System.out.println(position.getName() + " "
                    + position.getCost() + "zł "
                    + position.getAmount() + "szt "
                    + " = " + position.calculateValue());
        }
        System.out.println("Razem : " + calculateValue());
    }
}
