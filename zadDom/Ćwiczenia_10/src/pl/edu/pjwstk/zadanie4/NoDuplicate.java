package pl.edu.pjwstk.zadanie4;

import java.util.List;

public class NoDuplicate<Type> {
    public void notDuplicate(List<Type> list){
        for(int i = 0 ; i < list.size() ; i++){
            for(int j = 0 ; j < list.size() ; j++){
                if(j == i) {
                    continue;
                }
                else{
                    if(list.get(i).equals(list.get(j))){
                        list.remove(j);
                        j--;
                    }
                }
            }
        }
    }
}
