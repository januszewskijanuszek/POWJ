package pl.edu.pjwstk.zadDom1;

import java.util.Scanner;

public class Prac2 {
    public static void main(String[] args) {
        // Taka informacja dla sprawdzającego!
        // Tozadanie można było zrobić na 2 sposoby tablicami i eliminacją gorszego
        // Zdecydowałem się na tablice ponieważ chciałem się ich nauczyć, a nie że jestem głupi bo nie wpadłem na lepsze rozwiązanie!
        Scanner scanner = new Scanner(System.in);
        int studentCounter = scanner.nextInt();
        int[] points;
        String[] students;
        points = new int[studentCounter];
        students = new String[studentCounter];
        for (int i = 0 ; i < studentCounter ; i++){
            System.out.println("Podaj imie studenta " + (i+1));
            // Nie wiem czemu pomija mi zupełnie pobieranie imienia studenta
            // Program powinien działać prawidłowo
            students[i] = scanner.nextLine();
            System.out.println("Podaj liczbe punktów");
            points[i] = scanner.nextInt();
        }
        for (int i = 0 ; i < studentCounter ; i++){
            for(int j = 0 ; j < studentCounter-1 ; j++){
                if(points[j] < points[j+1]){
                    int bufferPoints = points[j];
                    String bufferStudents = students[j];
                    points[j] = points[j+1];
                    students[j] = students[j+1];
                    points[j+1] = bufferPoints;
                    students[j+1] = bufferStudents;
                }
            }
        }
        System.out.println("Najlepszym studentem jest: " + students[0]+ " , ktory osiagnał: "+ points[0] + " Pk");
    }
}
