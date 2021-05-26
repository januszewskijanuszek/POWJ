package pl.edu.pjwstk.zad1.service;

public class CalculateService {

    public static double convertCtoF(double c){
        return (double) (Math.round(c/5*9 + 32));
    }

    public static double convertFtoC(double f){
        return (double) (Math.round(f*10));
    }
}
