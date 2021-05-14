package pl.edu.pjwstk.zadanie1;

public class App {
    public static void main(String[] args) {
        Cat kotek = new Cat("Czarny", "Filemon");
        Dog piesel = new Dog("biały", "Dogge");
        System.out.println(kotek.makeSound());
        System.out.println(kotek.toString());
        System.out.println(piesel.makeSound());
        System.out.println(piesel.toString());
    }
}
