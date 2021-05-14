package pl.edu.pjwstk.zadanie1;

public class Firma {
    private final Pracownik[] workers;

    public Firma(Pracownik[] workers) {
        this.workers = workers;
    }

    private void time(int days){
        int month = 0;
        int year = 0;
        boolean end = true;
        do{
            if(days - 20 >= 0){
                // można zrobić days -= 20 ale dla mnie tak jest ładniej!
                days = days - 20;
                month++;
                if(month == 12){
                    month = 0;
                    year++;
                }
            }
            else{
                end = false;
            }
        }while(end);
        System.out.println("Dzień - " + days + " Miesiąc - " + month + " Rok - " + year);
    }

    private int dailyBalance(){
        int balance = 0;
        for (Pracownik worker : workers) {
            balance = balance + worker.getDailyPayment();
        }
        return balance;
    }

    // "obliczMiesięcznyKosztFirmy"
    private int calculateMonthlyLosses(){
        return dailyBalance() * 20;
    }

    private int calculateAnnualLosses(){
        return calculateMonthlyLosses()*12;
    }

    // "obliczKosztFirmy"
    public void calculateLosses(String type, int amount){
        switch (type){
            case "day":     { time(amount);                  System.out.println(dailyBalance() * amount); break;}
            case "month":   { time(amount * 20);        System.out.println(calculateMonthlyLosses() * amount); break;}
            case "year":    { time(amount * 20 * 12);   System.out.println(calculateAnnualLosses() * amount); break;}
            default:        {System.out.println("Błędne dane!");}
        }
    }
}
