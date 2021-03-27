package pl.edu.pjwstk.zadanie1;

public class Kwadrat {
    private int bok;

    public Kwadrat(int bok){
        this.bok = bok;
    }

    public Kwadrat(){
        this.bok = 1;
    }

    public int getPole(){
        return bok*bok;
    }

    public int getObwód(){
        return bok*4;
    }
}
