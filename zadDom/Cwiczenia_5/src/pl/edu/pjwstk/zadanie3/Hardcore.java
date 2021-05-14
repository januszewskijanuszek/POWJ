package pl.edu.pjwstk.zadanie3;

public class Hardcore extends Car{

    public Hardcore(String brand, String color) {
        super(brand, color);
    }

    public void salto(){
        System.out.println("Robie salto!");
    }
    public void showDetails(){
        System.out.println("Siema jetsem " + this.brand);
        System.out.println("Nie mam miejsc " + " i kolor " + this.color);
    }
}
