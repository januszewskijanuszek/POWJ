package pl.edu.pjwstk.zadanie2;

import java.util.Scanner;

public class Menu {
    public static void menu(Student student){
        boolean isExit = false;
        do {
            mainMenu();
            int choice = saveInput();
            switch (choice){
                case 1:{
                    student.addGrade(getGrade(1, 6));
                    break;
                }
                case 2:{
                    System.out.println("Which grade wanna erase?");
                    System.out.println("0 - ABANDON PROCESS");
                    student.printGrades();
                    student.removeGrade(saveRemove(student.mapLen()));
                    break;
                }
                case 3:{
                    System.out.println("Average");
                    System.out.println(student.getAverage());
                    break;
                }
                case 4:{
                    System.out.println("Grades:");
                    student.printGrades();
                    break;
                }
                default:{
                    isExit = true;
                }
            }

        }while(!isExit);
    }

    private static void mainMenu(){
        System.out.println("Hello teacher");
        System.out.println("1 - Add grade");
        System.out.println("2 - Remove grade");
        System.out.println("3 - Show average");
        System.out.println("4 - Show grades");
        System.out.println("5 - Exit");
    }

    private static int getGrade(double start, double end){
        for(;;){
            int grade = saveInput();
            if(grade > end || grade < start){
                System.out.println("Grade out of range!");
            } else return grade;
        }
    }

    private static int saveRemove(int range){
        for(;;){
            int choice = saveInput();
            if(choice > range || choice < 0){
                System.out.println("Number out of range!");
            } else return choice;
        }
    }

    private static int saveInput(){
        Scanner scan = new Scanner(System.in);
        for(;;){
            int choice;
            try{
                choice = scan.nextInt();
                return choice;
            }catch (NumberFormatException exc){
                System.out.println("Wrong format!");
            }
        }
    }
}
