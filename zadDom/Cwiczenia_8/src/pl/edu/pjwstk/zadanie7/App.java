package pl.edu.pjwstk.zadanie7;

public class App {
    public static void main(String[] args) {
        int sum = sum(new int[]{1, 2, 3}, new int[]{10, 2});
        System.out.println("Sum " + sum);
    }

    // Tworzy tablicę dwu wymiarową
    private static int sum(final int[] ... numbersArray){
        int sum = 0;
        for(final int[] numbers : numbersArray){
            for(final int number : numbers){
                sum += number;
            }
        }
        return sum;
    }
}
