package pl.edu.pjwstk.zadanie2;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private List<Double> marks;

    public Student(String name) {
        this.name = name;
        this.marks = new ArrayList<>();
    }

    // Add grade
    public void addGrade(double grade){
        marks.add(grade);
    }

    // Removes grade
    public void removeGrade(int index){
        if(index != 0)
            marks.remove(index - 1);
    }

    // Map len
    public int mapLen(){
        return marks.size();
    }

    // Show grades
    public void printGrades(){
        int counter = 0;
        for (double value : marks){
            counter++;
            System.out.println(counter + " - " + value);
        }
    }

    // Returns average
    public double getAverage(){
        double sum = 0;
        for (double value : marks){
            sum += value;
        }
        return sum / marks.size();
    }
}
