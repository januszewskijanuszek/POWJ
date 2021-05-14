package pl.edu.pjwstk.zadanie5;

public abstract class Car {
    private final int speedLimit;
    private int speed;
    private final String color;
    private final String brand;
    private final String year;

    public Car(int speedLimit, String color, String brand, String year) {
        this.speedLimit = speedLimit;
        this.color = color;
        this.brand = brand;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "speedLimit=" + speedLimit +
                ", speed=" + speed +
                ", color='" + color + '\'' +
                ", brand='" + brand + '\'' +
                ", year=" + year +
                '}';
    }

    public boolean equals(){ return color.equals(brand) && color.equals(year); }

    public abstract void faster();

}
