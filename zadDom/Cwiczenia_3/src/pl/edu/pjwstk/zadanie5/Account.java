package pl.edu.pjwstk.zadanie5;

public class Account {
    private int id;
    private int balance;

    public Account() {
        this.id = 0;
        this.balance = 100;
    }

    public int getBalance() {
        return balance;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
