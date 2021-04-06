package pl.edu.pjwstk.zadanie3;

public enum Sign {
    HEARTS('\u2764'),
    DIAMONDS('\u2666'),
    CLUBS('\u2663'),
    SPADES('\u2660');

    private final char sign;

    Sign(char sign) {
        this.sign = sign;
    }

    public char getSign() {
        return sign;
    }
}
