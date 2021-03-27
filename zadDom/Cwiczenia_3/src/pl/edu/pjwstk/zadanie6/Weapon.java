package pl.edu.pjwstk.zadanie6;

public enum Weapon {
    NONE            ("Pięść",           2,  3,  90, 80, 3, 0),
    KNIFE           ("Nóż",             4,  7,  90, 75, 2, 30),
    PISTOL          ("Pistolet",        8,  12,  80, 60, 3, 70),
    MP5             ("MP5",             15, 18, 85, 60, 3, 300),
    AKM             ("AKM",             20, 30, 70, 60, 3, 550),
    SNIPER_RIFLE    ("Snajperka",       80, 200,80, 90, 1, 1000),
    ROCKET_LAUNCHER ("Wyrzutnia Rakiet",65, 165,50, 70, 1, 2500);

    private final String name;
    private final int damageBody;
    private final int damageHead;
    private final int hitChanceBody;
    private final int hitChanceHead;
    private final int hitCount;
    private final int cost;

    Weapon(String name, int damageBody, int damageHead, int hitChanceBody, int hitChanceHead, int hitCount, int cost) {
        this.name = name;
        this.damageBody = damageBody;
        this.damageHead = damageHead;
        this.hitChanceBody = hitChanceBody;
        this.hitChanceHead = hitChanceHead;
        this.hitCount = hitCount;
        this.cost = cost;
    }

    public String getName() { return name; }

    public int getHitChanceHead() { return hitChanceHead; }

    public int getDamageBody() {
        return damageBody;
    }

    public int getDamageHead() {
        return damageHead;
    }

    public int getHitChanceBody() {
        return hitChanceBody;
    }

    public int getHitCount() {
        return hitCount;
    }

    public int getCost() {
        return cost;
    }
}
