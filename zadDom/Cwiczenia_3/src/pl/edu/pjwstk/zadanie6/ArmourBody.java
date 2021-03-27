package pl.edu.pjwstk.zadanie6;

public enum ArmourBody {
    NONE                    ("Brak",                        9999,   0,  0),
    MILITARY_UNIFORM        ("Mundur woskowy",              50,     15, 150),
    LIGHT_BULLETPROOF_VEST  ("Lekka Kamizelka Kuloodporna", 60,     25, 250),
    BULLETPROOF_VEST        ("Kamizelka Kuloodporna",       50,     30, 350),
    HEAVY_BULLETPROOF_VEST  ("Ciężka Kamizelka Kuloodporna",50,     35, 650),
    COMBAT_ARMOUR           ("Pancerz Bojowy",              60,     45, 700),
    MILITARY_EXOSKELETON    ("Militarny Egzoszkielet",      100,    60, 1000);

    private final String name;
    private final int durability;
    private final double absorption;
    private final int cost;

    ArmourBody(String name, int durability, double absorption, int cost) {
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
