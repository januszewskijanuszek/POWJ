package pl.edu.pjwstk.zadanie5;

import java.util.*;

public class Menu {
    public static void menu(Set<Integer> set){
        mainMenu();
        Set<Integer> random = randomSetNumber(6);
        System.out.println(random);
        for(int i = 0 ; i < 6 ; i++){
            System.out.println(6 - i);
            int number = getNumber(1, 49);
            if(checkContain(number, set)){
                System.out.println("This number has been used!");
                i--;
            }
            else set.add(number);
        }
        Set<Integer> copy = set;
        copy.removeAll(random);
        int score = random.size() - copy.size();
        System.out.println("Your score: " + score);
    }

    private static void mainMenu(){
        System.out.println("Hello in Lotto machine");
        System.out.println("Type your lucky numbers!");
        System.out.println("1 - 49");
        System.out.println("Numbers remaining: ");
    }

    private static int getNumber(double start, double end){
        for(;;){
            int grade = saveInput();
            if(grade > end || grade < start){
                System.out.println("Number out of range!");
            } else return grade;
        }
    }

    private static int saveInput(){
        Scanner scan = new Scanner(System.in);
        for(;;){

            try{;
                int choice = scan.nextInt();
                return choice;
            }catch (InputMismatchException exc){
                System.out.println("Wrong data format!");
            }
        }
    }

    private static boolean checkContain(int number, Set<Integer> set){
        for (int value : set){
            if(number == value) return true;
        }
        return false;
    }

    private static Set<Integer> randomSetNumber(int value){
        Random ran = new Random();
        Set<Integer> set = new HashSet<>();
        for (int i = 0 ; i < value ; i++){
            int number = ran.nextInt(48) + 1;
            if(checkContain(number, set))
                i--;
            else
                set.add(number);
        }
        return set;
    }
}
