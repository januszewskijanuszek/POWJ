package pl.edu.pjwstk.zadanie5;

import java.util.*;

public class ATM {
    private final int setAmount;
    private int choise;

    Account[] users = new Account[10];

    public ATM(int setAmount) {
        this.setAmount = setAmount;
        this.choise = 0;
    }

    public void setUsers(){
        for(int i = 0 ; i < this.setAmount ; i++){
            users[i] = new Account();
            users[i].setId(i);
        }
    }

    public void setChoice(int choice) {
        if(choice > setAmount || choice < setAmount){
            System.out.println("Nie znaleziono w bazie!");
        }
        else{
            this.choise = choice;
        }
    }

    private void setChoice() {
        System.out.print("Podaj ID: ");
        boolean exit = true;
        do{
            int inputChoice = new Scanner(System.in).nextInt();
            if (inputChoice >= this.setAmount){
                System.out.println("Wprowadz poprawne dane!");
            }
            else{
                this.choise = inputChoice;
                exit = false;
            }
        }while(exit);
    }

    private void withdraw(int input){
        if(users[choise].getBalance() < input){
            System.out.println("Nie można dokonać wyciągu!");
            System.out.println("Zbyt niski stan konta!");
        }
        else if(0 > input){
            System.out.println("Nie można dokonać wpłaty!");
            System.out.println("Wpisz dodatnią watyość!");
        }
        else{
            users[choise].setBalance(users[choise].getBalance() - input);
        }
    }

    private void deposit(int input){
        if(0 > input){
            System.out.println("Nie można dokonać wpłaty!");
            System.out.println("Wpisz dodatnią watyość!");
        }
        else{
            users[choise].setBalance(users[choise].getBalance() + input);
        }
    }

    private void menu(){
        System.out.println("Witam urzytkowniku " + this.choise);
        System.out.println("Main menu");
        System.out.println("1: Check balance");
        System.out.println("2: Withdraw");
        System.out.println("3: Deposit");
        System.out.println("4: Przełącz urzytkownika");
        System.out.println("5: Exit");
        System.out.print("Enter choice: ");
    }

    public void switchATM(){
        setChoice();
        boolean exit = true;
        do{
            menu();
            int input = new Scanner(System.in).nextInt();
            switch(input){
                case 1:{
                    System.out.println("Stan konta wynosi: " + users[this.choise].getBalance() + "zł");
                    break;
                }
                case 2:{
                    System.out.print("Ile pieniędzy wypłacić: ");
                    int wading = new Scanner(System.in).nextInt();
                    withdraw(wading);
                    break;
                }
                case 3:{
                    System.out.print("Ile pieniędzy wpłacić: ");
                    int wading = new Scanner(System.in).nextInt();
                    deposit(wading);
                    break;
                }
                case 4:{
                    System.out.print("Podaj ID innego urzytkownika:  ");
                    int wading = new Scanner(System.in).nextInt();
                    setChoice(wading);
                    break;
                }
                case 5:{
                    exit = false;
                    break;
                }
            }
        }while(exit);
    }

}
