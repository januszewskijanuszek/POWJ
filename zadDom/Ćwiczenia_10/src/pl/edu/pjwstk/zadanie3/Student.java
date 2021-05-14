package pl.edu.pjwstk.zadanie3;

import java.util.HashMap;
import java.util.Map;

public class Student {
    private Map<String, Double> marks;
    private int counter;

    public Student(String name) {
        this.marks = new HashMap<>();
    }

    // Add grade
    public void addGrade(String course, double grade){
        if(!marks.containsKey(course)){
            marks.put(course, grade);
            counter++;
        } else {
            marks.put(course, marks.get(course) + grade);
            counter++;
        }
    }

    // Returns average
    public double getAverage(){
        double sum = 0;
        for (double value : marks.values()){
            sum += value;
        }
        return sum / counter;
    }
}
