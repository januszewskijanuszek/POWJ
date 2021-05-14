package pl.edu.pjwstk.zadanie1;

public class App {
    public static void main(String[] args) {
        MyList<Integer> list = new MyList<>();

        for(int i = 0 ; i < 30 ; i++){
            boolean success = list.add(i);
            System.out.println(success);
        }
    }
}
