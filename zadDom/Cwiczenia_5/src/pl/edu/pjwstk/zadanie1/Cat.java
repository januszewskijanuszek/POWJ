package pl.edu.pjwstk.zadanie1;

public class Cat extends Animal{

    public Cat(String color, String name) {
        super(color, name);
    }

    public String makeSound(){
        return "Meow";
    }
}
