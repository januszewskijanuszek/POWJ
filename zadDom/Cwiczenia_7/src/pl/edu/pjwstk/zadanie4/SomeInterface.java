package pl.edu.pjwstk.zadanie4;

public interface SomeInterface {
    int doSmth(int a);
    float doSmth(int a, int b);
    int doSmth(float a, float b);
    int doSmth(Integer a, Integer b);
    int doSmth(int a, Integer b);
    int doSmth(Integer a, int b);
    int doSmth(int...a);
    int doSmth(int a, int...b);
    int doSmth(int a, int b, int...c);
}

