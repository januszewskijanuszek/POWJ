package pl.edu.pjwstk.zadanie1;

public class Animal {
    String color;
    String name;

    public Animal(String color, String name) {
        this.color = color;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "color='" + color + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
