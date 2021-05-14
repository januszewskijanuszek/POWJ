package pl.edu.pjwstk.zadanie1;

public class App {
    public static void main(String[] args) {
        String story1 = "Jaś i Małgosia idzą sobie przez las i znaleźli domek. Jak się okazało w tym domku znajdowały się zadania z Javy. Przerażone dzieci zaczęły uciekać, jednak JDK wciągnął je na dobre.";
        String story2 = "i i i i a a a r r r x x x e e e e e e e 3 3 a";
        System.out.println(WordCounter.wordCount(story1));
        System.out.println(WordCounter.wordCount(story2));
    }
}
