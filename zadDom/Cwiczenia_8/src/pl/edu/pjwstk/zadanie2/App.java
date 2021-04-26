package pl.edu.pjwstk.zadanie2;

import java.util.Scanner;

public class App {
    // Creating enum EXIT
    private static final String EXIT = "exit";
    // BankAccount with constructor
    private final static BankAccount account = new BankAccount(Math.random() * 10000);

    public static void main(String[] args) throws Exception {
        // Scanner object
        final Scanner scan = new Scanner(System.in);
        // I prefer not false declaration
        boolean isExit = true;
        while(isExit){
            // line == input
            final String input = scan.next();
            // If input is equal to enum EXIT then change isExit to false and than exit program
            if(EXIT.equals(input)){
                isExit = false;
            }
            else{
                account.transaction(input);
            }
        }
    }
}
