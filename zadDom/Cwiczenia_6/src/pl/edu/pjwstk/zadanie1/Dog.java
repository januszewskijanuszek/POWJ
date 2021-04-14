package pl.edu.pjwstk.zadanie1;

public class Dog extends Animal {


    public Dog(String color, String name) {
        super(color, name);
    }

    public String makeSound(){
        return "Wof Wof";
    }
}
