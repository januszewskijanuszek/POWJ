package pl.edu.pjwstk.zadanie3;

public class App {
    public static void main(String[] args) {
        Student student1 = new Student("Staś");
        student1.addGrade("Przyroda", 5);
        student1.addGrade("Przyroda", 5);
        student1.addGrade("Przyroda", 5);
        student1.addGrade("Przyroda", 4);
        student1.addGrade("Przyroda", 2);
        student1.addGrade("Przyroda", 1);
        student1.addGrade("Angielski", 3);
        student1.addGrade("Angielski", 2);
        student1.addGrade("Angielski", 4);
        student1.addGrade("Angielski", 3);
        student1.addGrade("Angielski", 2);
        student1.addGrade("Angielski", 1);

        System.out.println(student1.getAverage());
    }
}
