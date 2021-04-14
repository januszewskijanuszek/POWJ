package pl.edu.pjwstk.zadanie4;

public class Class {
    private String name;
    private int length;
    private int height;
    private int number;
    private boolean yes;

    public Class(String name, int length, int height, int number, boolean yes) {
        this.name = name;
        this.length = length;
        this.height = height;
        this.number = number;
        this.yes = yes;
    }

    @Override
    public String toString() {
        return "Class{" +
                "name='" + name + '\'' +
                ", length=" + length +
                ", height=" + height +
                ", number=" + number +
                ", yes=" + yes +
                '}';
    }
}
