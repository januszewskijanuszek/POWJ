package pl.edu.pjwstk.pracaDomowa;

import java.util.*;

public class Vataz {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.next();
        int stringLong = input.length() - 1;
        boolean check = true;

        for(int i = 0 ; i < input.length() ; i++){
            if(input.charAt(i) == input.charAt(stringLong)){
                stringLong--;
            }
            else{
                System.out.print("Nie jest palindromem");
                check = false;
                break;
            }
        }
        if(check){
            System.out.println("Jest palindromem");
        }
    }
}
