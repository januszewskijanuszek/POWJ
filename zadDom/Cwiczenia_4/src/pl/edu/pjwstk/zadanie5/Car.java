package pl.edu.pjwstk.zadanie5;

public enum Car {
    AUDI            ("Audi A8",                     210.5, 20.4,    200,    Color.GREEN),
    BMW             ("BMW kox klasa",               250.9, 14.9,    210,    Color.BLACK),
    SUBARU          ("Subaru ekstra",               199.6, 30.5,    1000,   Color.WHITE),
    WOLKSWAGENJET   ("Fura z napędem odrzutowym",   400.5, 500.5,   1000,   Color.RED); // co to za bydle jest 19km w 20 sekund

    private final String name;
    private final double maxVelocity;
    private final double acceleration;
    private final int horsePower;
    private final Color color;

    Car(String name, double maxVelocity, double acceleration, int horsePower, Color color) {
        this.name = name;
        this.maxVelocity = maxVelocity;
        this.acceleration = acceleration;
        this.horsePower = horsePower;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public double getMaxVelocity() {
        return maxVelocity;
    }

    public double getAcceleration() {
        return acceleration;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public Color getColor() {
        return color;
    }
}
