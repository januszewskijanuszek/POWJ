package pl.edu.pjwstk.zadanie3;

public class App {
    public static void main(String[] args) {
        Hardcore hard = new Hardcore("Siemson" , "Black");
        Lambo lam = new Lambo("Samson", "Blue");
        Normal nor = new Normal("Siema", "Dark");
        hard.showDetails();
        hard.salto();
        lam.showDetails();
        nor.showDetails();
        nor.switchBack();
        nor.showDetails();
    }
}
