package pl.edu.pjwstk.zadanie3;

import java.util.Arrays;

public class App {
    public static String method(int number, String...strings) throws Exception {
        try{
            int placeholder = strings.length / number;
        }
        catch (ArithmeticException e){
            throw new Exception("Can not davide by zero!");
        }
        String[] finalString = new String[strings.length / number];
        int counter = 0;
        StringBuilder end = new StringBuilder();
        for(int i = 0 ; i < strings.length ; i += number){
            finalString[counter] = strings[i];
            counter++;
        }
        for(String item : finalString){
            end.append(item);
            if(finalString[finalString.length - 1] != item)
                end.append(" ");
        }
        return end.toString();
    }
    public static void main(String[] args) throws Exception {
        String[] text = new String[]{"Jas", "i", "Małgosia", "poszli", "do" , "lasu", "na", "grzyby"};
        System.out.println(method(2, text));
    }
}
