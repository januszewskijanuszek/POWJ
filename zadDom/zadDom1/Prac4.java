package pl.edu.pjwstk.zadDom1;

import java.util.Scanner;

public class Prac4 {
    public static void main(String[] args) {
        int change = 5;
        Scanner scanner = new Scanner(System.in);
        int[] num;
        num = new int[change];
        for(int i = 0; i < change ;i++){
            num[i] = scanner.nextInt();
        }
        for (int i = 0 ; i < change ; i++){
            for(int j = 0 ; j < change-1 ; j++){
                if(num[j] < num[j+1]){
                    int bufferNum = num[j];
                    num[j] = num[j+1];
                    num[j+1] = bufferNum;
                }
            }
        }
        for(int i = 0; i < change ;i++){
            System.out.println(num[i]);
        }
    }
}
