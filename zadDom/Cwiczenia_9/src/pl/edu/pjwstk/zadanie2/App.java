package pl.edu.pjwstk.zadanie2;

import java.util.Arrays;
import java.util.Random;

public class App {
    public static void main(String[] args) {
        Random rand = new Random();

        Player[] players = new Player[10];
        for(int i = 0 ; i < 10 ; i++){
            players[i] = new Player(
                     Name.values()[rand.nextInt(8)].getFirstName()
                    ,Name.values()[rand.nextInt(8)].getLastName()
                    ,Name.values()[rand.nextInt(8)].getMaxSpeed());
        }
        System.out.println("Unsorted: ");
        for(int i = 0 ; i < players.length ; i++) System.out.println(players[i].toString());
        Arrays.sort(players);
        System.out.println("Sorted by name: ");
        for(int i = 0 ; i < players.length ; i++) {
            System.out.println(players[i].toString());
        }
        System.out.println("Sorted by rank: ");
        Arrays.sort(players, new RankingComparator());
        for(int i = 0 ; i < players.length ; i++) {
            players[i].setRanking(i+1);
            System.out.println(players[i].toString());
        }

    }
}
