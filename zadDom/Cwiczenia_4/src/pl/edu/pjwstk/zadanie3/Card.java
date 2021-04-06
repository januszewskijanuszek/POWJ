package pl.edu.pjwstk.zadanie3;

public class Card {
    final private Color color;
    final private Sign sign;

    public Card() {
        this.color = Color.AS;
        this.sign = Sign.HEARTS;
    }

    public Card(Color color, Sign sign) {
        this.color = color;
        this.sign = sign;
    }

    @Override
    public String toString() {
        return "Card{" +
                "color=" + color +
                ", sign=" + sign.getSign() +
                '}';
    }
}
