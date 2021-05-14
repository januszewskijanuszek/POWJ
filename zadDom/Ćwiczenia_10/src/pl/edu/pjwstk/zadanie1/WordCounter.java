package pl.edu.pjwstk.zadanie1;

import java.util.HashMap;
import java.util.Map;

public class WordCounter {
    public static Map wordCount(String text){
        String EMPTY = "";

        Map<String, Integer> wordMap = new HashMap<>();
        text = text.replace(",", EMPTY);
        text = text.replace(".", EMPTY);
        text = text.toLowerCase();
        String[] arrString = text.split(" ");
        for(String item : arrString){
            // jeśli mapa nie zawiera tego elementu to dodaje
            if(!wordMap.containsKey(item)){
                wordMap.put(item, 1);
            } else{ // Jeśli zawiera ten klucz to dodaje +1
                wordMap.put(item, wordMap.get(item) + 1);
            }
        }
        return wordMap;
    }
}
