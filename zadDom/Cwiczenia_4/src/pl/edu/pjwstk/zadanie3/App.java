package pl.edu.pjwstk.zadanie3;

public class App {
    public static void main(String[] args) {
        Card[][] karty = new Card[4][13];
        for(int i = 0 ; i < 4 ; i++){
            for(int j = 0 ; j < 13 ; j++){
                karty[i][j] = new Card(Color.values()[j], Sign.values()[i]);
            }
        }
        for(int i = 0 ; i < 4 ; i++){
            for(int j = 0 ; j < 13 ; j++){
                System.out.println(karty[i][j].toString());
            }
        }
    }
}
