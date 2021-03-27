package pl.edu.pjwstk.zadanie5;

public class Main {
    public static void main(String[] args) {
        ATM bankomat = new ATM(10);
        bankomat.setUsers();
        bankomat.switchATM();
    }
}
