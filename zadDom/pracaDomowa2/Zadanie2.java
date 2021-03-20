package pl.edu.pjwstk.pracaDomowa;

import java.util.*;

public class Zadanie2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random ran = new Random();

        int input = scan.nextInt();
        int[] arr1 = new int[input];
        input = scan.nextInt();
        int[] arr2 = new int[input];
        int[] arrExe = new int[input];
        if(arr1.length == arr2.length){
            // Array 1
            for (int i = 0 ; i < input ; i++){
                //arr1[i] = ran.nextInt(10);
                arr1[i] = scan.nextInt();
            }
            // Array 2
            for (int i = 0 ; i < input ; i++){
                //arr2[i] = ran.nextInt(10);
                arr2[i] = scan.nextInt();
            }
            // ArrayExe
            for (int i = 0 ; i < input ; i++){
               arrExe[i] = arr1[i] + arr2[i];
            }
        }
        else{
            int[] emptyArray = new int[1];
            System.out.println("Wrong arrays sizes!");
            System.out.println(Arrays.toString(emptyArray));
        }
        //System.out.println(Arrays.toString(arr1));
        //System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arrExe));
    }
}
