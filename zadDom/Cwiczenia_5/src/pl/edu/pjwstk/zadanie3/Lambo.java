package pl.edu.pjwstk.zadanie3;

public class Lambo extends Car{
    private int crew;

    public Lambo(String brand, String color) {
        super(brand, color);
        this.crew = 6;
    }
    public void showDetails(){
        System.out.println("Siema jetsem " + this.brand);
        System.out.println("Mam " + this.crew + " miejsc " + " i kolor " + this.color);
    }
}
