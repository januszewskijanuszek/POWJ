package pl.edu.pjwstk.zadanie6;

public class App {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.calculate(10));
        System.out.println(calc.calculate(10, 20));
        System.out.println(calc.calculate(10, 10, 10));
    }
}
