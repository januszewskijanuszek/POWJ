package pl.edu.pjwstk.zadanie2;

public class Player implements Comparable<Player>{
    private String firstName;
    private String lastName;
    private int ranking;
    private double maxSpeed;

    // Constructor
    public Player(String firstName, String lastName, double maxSpeed) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.maxSpeed = maxSpeed;
    }

    // Compare to
    public int compareTo(Player player){
        // if(player.getMaxSpeed() < this.maxSpeed)         return 1;
        // else if(player.getMaxSpeed() > this.maxSpeed)    return -1;
        // else return 0;
        return this.lastName.compareTo(player.lastName);
    }

    // Setter
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    // Getter

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getRanking() {
        return ranking;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    // toString
    @Override
    public String toString() {
        return "Player{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", ranking=" + ranking +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
