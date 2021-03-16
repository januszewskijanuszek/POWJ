package pl.edu.pjwstk.zadDom1;

public class Prac1 {
    public static void main(String[] args) {
        System.out.println("Celsjusze\tKelwiny");
        double zeroKelvin = 273.15;
        for(int i = 1 ; i <= 10 ; i++){
            System.out.println(i + "\t\t\t" + ++zeroKelvin);
        }
    }
}
