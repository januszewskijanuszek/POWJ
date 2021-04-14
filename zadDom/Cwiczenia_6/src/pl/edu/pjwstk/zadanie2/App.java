package pl.edu.pjwstk.zadanie2;

public class App {
    public static void main(String[] args) {
        String[] siema1 = {"Bułki", "Precle", "Schabowy"};
        String[] siema2 = {"Pod wieniem", "Stolik"};
        Bakery slawek = new Bakery("10.0.0.101", 10, siema1);
        BookShop stasiek = new BookShop("10.0.0.102", 10, siema2);
        System.out.println(slawek.getInformation());
        System.out.println(stasiek.getInformation());
    }
}
