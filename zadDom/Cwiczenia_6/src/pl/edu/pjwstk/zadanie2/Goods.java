package pl.edu.pjwstk.zadanie2;

public enum Goods {
    GOOD1("Marchewka",  12),
    GOOD2("Pomidor",    8),
    GOOD3("Take",       6),
    GOOD4("A",          2),
    GOOD5("Sip",        5),
    GOOD6("Skywalker",  7),
    GOOD7("Mleko",      7);

    private final String name;
    private final int cost;

    Goods(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }
}
