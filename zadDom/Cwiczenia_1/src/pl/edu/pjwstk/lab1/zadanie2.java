package pl.edu.pjwstk.lab1;

import java.util.Scanner;

public class zadanie2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double celsius = scanner.nextDouble();
        double farenheit = celsius*(9d / 5d)+32;

        System.out.println("Proof Celciusz: " + celsius);
        System.out.println("Proof Farenheit " + farenheit);

    }
}
