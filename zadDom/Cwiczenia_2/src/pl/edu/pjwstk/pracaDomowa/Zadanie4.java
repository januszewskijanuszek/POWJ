package pl.edu.pjwstk.pracaDomowa;

import java.util.*;

public class Zadanie4 {
    private static int arraySum(int[] arr){
        int buffor = 0;
        for (int value : arr) {
            buffor += value;
        }
        return buffor;
    }
    private static int arrayProduct(int[] arr){
        int buffor = 1;
        for (int value : arr) {
            buffor *= value;
        }
        return buffor;
    }
    private static int arrayDevByFour(int[] arr){
        int counter = 0;
        for(int value : arr){
            if (value % 4 == 0) counter++;
        }
        return counter;
    }
    private static int arrayDevByThree(int[] arr){
        int counter = 0;
        for(int value : arr){
            if (value % 3 == 0) counter++;
        }
        return counter;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Długość tablicy: ");
        int inputArrayLenght = scan.nextInt();
        int[] arr = new int[inputArrayLenght];
        System.out.print("Pierwsza cyfra tablicy: ");
        int inputFirstNumber = scan.nextInt();

        // Creating Array
        // Task 1
        for (int i = 0; i < inputArrayLenght ; i++){
            if (i == 0){
                System.out.println("Wynikowa Tablica: ");
                System.out.print(inputFirstNumber + " ");
                arr[i] = inputFirstNumber;
            }
            else{
                inputFirstNumber += 2;
                arr[i] = inputFirstNumber;
                System.out.print(inputFirstNumber + " ");
            }
        }
        System.out.println(" ");

        // Task 2
        System.out.println("Tablica, w której wartość elementów określona jest wg wzoru: [wartość] - [pozycja elementu]: ");
        for (int i = 0; i < inputArrayLenght ; i++){
            System.out.print((arr[i] - i) + " ");
        }
        System.out.println(" ");

        // Task 3
        System.out.println("Suma wszystkich elementów: ");
        System.out.println(arraySum(arr));

        // Task 4
        System.out.println("Iloczyn wszystkich elementów: ");
        System.out.println(arrayProduct(arr));

        // Task 5
        System.out.println("Średnia wartość elementów: ");
        System.out.println(arraySum(arr)/inputArrayLenght);

        // Task 6
        System.out.println("W przypadku liczb parzystych wypisujemy ilość liczb podzielnych przez liczbę 4, dla nieparzystych podzielnych przez 3: ");
        if(arr[0] % 2 == 0){
            System.out.println(arrayDevByFour(arr));
        }
        else{
            System.out.println(arrayDevByThree(arr));
        }
    }
}
