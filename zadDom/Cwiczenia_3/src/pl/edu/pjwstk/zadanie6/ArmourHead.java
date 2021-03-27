package pl.edu.pjwstk.zadanie6;

public enum ArmourHead {
    NONE                        ("Brak",                9999,   0,  0),
    MILITARY_BERET              ("Beret Wojskowywy",    40,     5,  70),
    RIOT_HELMET                 ("Hełm RIOT",           35,     10,  150),
    STEEL_HELMET                ("Stalowy Hełm",        30,     20, 280),
    BALLISTIC_HELMET            ("Hełm Balistyczny",    30,     30, 400),
    SPECNAZ_MVD_HELMET          ("Hełm Szturmowy",      40,     45, 800),
    MILITARY_EXOSKELETON_HELMET ("Hełm Egzoszkieletu",  50,     55, 1500);

    private final String name;
    private final int durability;
    private final double absorption;
    private final int cost;

    ArmourHead(String name, int durability, double absorption, int cost) {
        this.name = name;
        this.durability = durability;
        this.absorption = absorption;
        this.cost = cost;
    }

    public String getName() { return name; }

    public int getDurability() {
        return durability;
    }

    public double getAbsorption() {
        return absorption;
    }

    public int getCost() {
        return cost;
    }
}
