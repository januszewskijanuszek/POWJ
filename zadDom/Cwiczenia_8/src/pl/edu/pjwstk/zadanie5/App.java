package pl.edu.pjwstk.zadanie5;

public class App {
    public static void main(String[] args) {
        Local lokal1 = new Local("Chata bogata", "Jana Kilińskiego 9/U2B, 80-452 Gdańsk");
        Local lokal2 = new Local("CityFit", "aleja Grunwaldzka 472d, 80-309 Gdańsk");
        Local lokal3 = new Local("Po Prostu Kwiaty", "Jana Kilińskiego 9/U2B, 80-452 Gdańsk");
        System.out.println(lokal1.toString());
        System.out.println(lokal2.toString());
        System.out.println(lokal3.toString());
    }
}
