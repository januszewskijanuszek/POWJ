package pl.edu.pjwstk.zadanie1;

public class Pracownik {
    private final String name;
    private final String surname;
    private final int dailyPayment;

    // Constructor
    public Pracownik(String name, String surname, int dailyPayment) {
        this.name = name;
        this.surname = surname;
        this.dailyPayment = dailyPayment;
    }

    // Simple getters
    public int getDailyPayment() {
        return dailyPayment;
    }

    @Override
    public String toString() {
        return "Pracownik{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", dailyPayment=" + dailyPayment +
                '}';
    }
}
