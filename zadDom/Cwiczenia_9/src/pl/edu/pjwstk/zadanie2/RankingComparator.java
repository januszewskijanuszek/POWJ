package pl.edu.pjwstk.zadanie2;

import java.util.Comparator;

public class RankingComparator implements Comparator<Player>{
    public int compare(Player player1, Player player2){
        return (int) (player2.getMaxSpeed() - player1.getMaxSpeed());
    }
}
