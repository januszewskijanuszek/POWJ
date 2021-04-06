package pl.edu.pjwstk.zadanie5;

public enum Color {
    GREEN   ("Zielony",     1),
    BLUE    ("Niebieski",   2),
    WHITE   ("Biały",       3),
    BLACK   ("Czarny",      3),
    RED     ("Czaerwony",   4);

    private final String color;
    private final int famePoints;

    Color(String color, int famePoints) {
        this.color = color;
        this.famePoints = famePoints;
    }

    public String getColor() {
        return color;
    }

    public int getFamePoints() {
        return famePoints;
    }
}
