package pl.edu.pjwstk.zadanie1;
import java.util.*;

public class App {
    public static void main(String[] args) {
        Random rand = new Random();
        int amountOfWorkers = 10;
        Pracownik[] worker = new Pracownik[amountOfWorkers];
        for(int i = 0 ; i < amountOfWorkers ; i++){
            worker[i] = new Pracownik(
                    Workers.values()[rand.nextInt(Workers.values().length)].getName(),
                    Workers.values()[rand.nextInt(Workers.values().length)].getSurname(),
                    Workers.values()[rand.nextInt(Workers.values().length)].getDailyPayment());
        }
        Firma company = new Firma(worker);
        company.calculateLosses("day", 1423);
    }
}
