package pl.edu.pjwstk.zadanie2;

import java.lang.Math;

public class Point {
    private int x;
    private int y;

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double getLenght(int inputx, int inputy){
        return Math.sqrt(Math.pow((double) x - (double) inputx, 2) + Math.pow((double) y - (double) inputy, 2));
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void getLocation(){
        System.out.print("X = " + getX() + " Y = " + getY());
    }
}
