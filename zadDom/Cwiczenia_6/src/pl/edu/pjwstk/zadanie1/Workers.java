package pl.edu.pjwstk.zadanie1;

public enum Workers {
    WORKER1("Stanisław", "Kumilski", 200),
    WORKER2("Wiesław", "Karolak", 220),
    WORKER3("Juseppe", "Garibaldii", 180),
    WORKER4("Erazmus", "Plus", 120);

    private final String name;
    private final String surname;
    private final int dailyPayment;

    Workers(String name, String surname, int dailyPayment) {
        this.name = name;
        this.surname = surname;
        this.dailyPayment = dailyPayment;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getDailyPayment() {
        return dailyPayment;
    }
}
