package pl.edu.pjwstk.zadanie2;

public class Position {
    private final String name;
    private int amount;
    private final int cost;

    public Position(String name, int amount, int cost) {
        this.name = name;
        this.amount = amount;
        this.cost = cost;
    }

    public int calculateValue(){
        return this.amount * this.cost;
    }

    public String getName() {
        return name;
    }

    public int getAmount() {
        return amount;
    }

    public int getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return "Position{" +
                "name='" + name + '\'' +
                ", amount=" + amount +
                ", cost=" + cost +
                '}';
    }
}
