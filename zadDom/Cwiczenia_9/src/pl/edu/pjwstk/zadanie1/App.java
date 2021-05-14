package pl.edu.pjwstk.zadanie1;

public class App {
    public static void main(String[] args) {
        MyList<Integer> list1 = new MyList<>();
        MyList<String> list2 = new MyList<>();

        //for(int i = 0 ; i < 30 ; i++){
        //    boolean success = list.add(i);
        //    System.out.println(success);
        //}
        list1.add(220);
        System.out.print("Ilość elementów: ");
        System.out.println(list1.size());
        System.out.print("Czy zawiera: ");
        System.out.println(list1.contains(10));
        System.out.print("Numer indeksu: ");
        System.out.println(list1.indexOf(2));
        System.out.print("Numer indeksu ostatniego: ");
        System.out.println(list1.lastIndexOf(4));
        System.out.print("Numer indeksu: ");
        System.out.println(list1.get(5));
        System.out.print("Zaniana: ");
        list1.set(10,11);

        System.out.print("Ilość elementów: ");
        System.out.println(list2.size());
        System.out.print("Czy zawiera: ");
        System.out.println(list2.contains("10"));
        System.out.print("Numer indeksu: ");
        System.out.println(list2.indexOf("2"));
        System.out.print("Numer indeksu ostatniego: ");
        System.out.println(list2.lastIndexOf("4"));
        System.out.print("Numer indeksu: ");
        System.out.println(list2.get(5));
        System.out.print("Zaniana: ");
        list2.set(10,"11");
    }
}
