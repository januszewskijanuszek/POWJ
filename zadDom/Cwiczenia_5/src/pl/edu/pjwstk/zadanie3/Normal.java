package pl.edu.pjwstk.zadanie3;

public class Normal extends Car{
    private int crew;
    private boolean back;

    public Normal(String brand, String color) {
        super(brand, color);
        this.crew = 4;
    }

    public void showDetails(){
        System.out.println("Siema jetsem " + this.brand);
        System.out.println("Mam " + this.crew + " miejsc " + " i kolor " + this.color);
        if(this.back) System.out.println("Mam bagażnik!");
        else System.out.println("Bagażnik został usunięty!");
    }
    public void switchBack(){
        this.back = !this.back;
    }
}
