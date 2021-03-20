package pl.edu.pjwstk.pracaDomowa;

import java.util.*;

public class Zadanie1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        char[] arr = new char[input];
        System.out.println("Input characters");
        for (int i = 0 ; i < input ; i++){
            //Prosty system walidaji
            String buffor = scan.next();
            if(buffor.length() == 1){
                arr[i] = buffor.charAt(0);
            }
            else {
                System.out.println("Sentence is too long!");
                i--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}