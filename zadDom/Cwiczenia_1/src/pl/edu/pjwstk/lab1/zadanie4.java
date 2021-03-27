package pl.edu.pjwstk.lab1;

import java.util.Scanner;

public class zadanie4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        if (a < b+c && b < a+c && c < a+b) {
            System.out.println("Tak");
        } else {
            System.out.println("Nie");
        }
    }
}
