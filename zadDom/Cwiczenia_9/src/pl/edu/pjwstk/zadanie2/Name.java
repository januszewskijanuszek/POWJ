package pl.edu.pjwstk.zadanie2;

// To jest tylko po to aby losowo dobierało imię nazwisko i maksymalną prędkość
public enum Name {
    PLAYER1("Mariusz",      "Walaszek", 120),
    PLAYER2("Stefan",       "Battory",  100),
    PLAYER3("Ziomal",       "Polska",   300),
    PLAYER4("Zuo",          "Dziadek",  90),
    PLAYER5("Rysiek",       "Kaminski", 30),
    PLAYER6("Magda",        "Gesler",   1),
    PLAYER7("Kiepsztyl",    "Chata",    999),
    PLAYER8("Roman",        "Dmowski",  20);

    private final String firstName;
    private final String lastName;
    private final double maxSpeed;

    Name(String firstName, String lastName, double maxSpeed) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.maxSpeed = maxSpeed;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }
}
