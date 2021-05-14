package pl.edu.pjwstk.training;

import java.util.*;

public class App {
    public static void main(String[] args) {
        // Linked list
        LinkedList<String> list = new LinkedList<>();
        list.add("Gdansk");
        list.add("Warszawa");
        list.add("Szczecin");
        list.add("Białystok");
        for(String item : list){
            System.out.println(item);
        }
        list.clear();

        // Hash map
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Poniedziałek");
        map.put(5, "Piątek");
        map.put(7, "Niedziela");

        System.out.println(map.get(5));

        for(String value : map.values()){
            System.out.println(value);
        }

        LinkedHashSet<String> collection = new LinkedHashSet<>();
        collection.add("Essa życiem");
        collection.add("Essa życie");
        collection.add("Essa życi");
        collection.add("Essa życ");
        System.out.println();
        for(String value : collection){
            System.out.println(value);
        }

        List<String> list2 = new ArrayList<>();
        list2.add("Essa");
        list2.add("Essa2");
        list2.add("Essa3");
        System.out.println(list2.get(2));
    }
}
