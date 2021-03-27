package pl.edu.pjwstk.lab1;

import java.util.Scanner;

public class zadanie6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("x1 = ");
        double x1 = scanner.nextDouble();
        System.out.println("x2 = ");
        double x2 = scanner.nextDouble();
        System.out.println("y1 = ");
        double y1 = scanner.nextDouble();
        System.out.println("y2 = ");
        double y2 = scanner.nextDouble();
        double exe = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1) , 2));
        System.out.println(exe);
    }
}
