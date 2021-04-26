package pl.edu.pjwstk.zadanie2;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BankAccount {
    // Enums
    private static final String EMPTY = "";
    private static final String MINUS = "-";

    // Double balance
    private double balance;

    // Constructor
    public BankAccount(final double initialBalance){
        balance = BigDecimal.valueOf(initialBalance).setScale(2, RoundingMode.HALF_UP).doubleValue();
        printBalance();
    }

    // Withdraw and deposit
    // Here may appear problems!
    public void transaction(final String value) throws Exception{
        // If value starts from - than use withdraw function
        // Try to do this
        try{
            if(value.startsWith(MINUS)){
                // Change first minus to EMPTY and than withdraw can handle it
                withdraw(value.replaceFirst(MINUS, EMPTY));
            }
            // In other case deposit cash
            else{
                deposit(value);
            }
        // If u get this problem do this
        } catch(NumberFormatException e){
            /// Use this if u wanna continue
            System.out.println("InsufficientFundsException");
            // Use this if u want to stop process
            //throw new Exception("InsufficientFundsException");
        }
    }

    // --------------------------------------------------------------
    // Deposit
    private void deposit(final String withdrawAmount){
        // Use Double class and parseDouble method
        balance += Double.parseDouble(withdrawAmount);
        printBalance();
    }

    // Withdraw
    private void withdraw(final String withdrawAmount){
        // Use same method as deposit
        balance -= Double.parseDouble(withdrawAmount);
        printBalance();
    }

    // Print balance
    private void printBalance(){
        System.out.println("Account has a balance of " + balance);
    }
}
