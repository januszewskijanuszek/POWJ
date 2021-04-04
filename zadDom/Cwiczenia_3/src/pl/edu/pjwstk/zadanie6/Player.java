package pl.edu.pjwstk.zadanie6;


import java.util.*;

public class Player {
    private double healthPoints;
    private int xp;
    private int money;
    private double armourBodyDurability;
    private double armourHeadDurability;
    private Weapon weapon;
    private ArmourBody armourBody;
    private ArmourHead armourHead;

    public Player(int money, Weapon weapon, ArmourBody armourBody, ArmourHead armourHead) {
        this.healthPoints = 100;
        this.xp = 0;
        this.money = money;
        this.armourBodyDurability = armourBody.getDurability();
        this.armourHeadDurability = armourHead.getDurability();
        this.weapon = weapon;
        this.armourBody = armourBody;
        this.armourHead = armourHead;
    }

    public void hitBody(int strength){
        int protect = 1;
        if(this.armourBodyDurability <= 0){
            protect = 0;
        }
        double power = strength - (strength*(this.armourBody.getAbsorption()/100) * protect);
        this.healthPoints = this.healthPoints - power;
        this.armourBodyDurability = this.armourBodyDurability - 1;
        System.out.println("Zabrano -" + power + " życia");
    }

    public void hitHead(int strength){
        int protect = 1;
        if(this.armourHeadDurability == 0){
            protect = 0;
        }
        double power = strength - (strength*(this.armourHead.getAbsorption()/100) * protect);
        this.healthPoints = this.healthPoints - power;
        this.armourHeadDurability = this.armourHeadDurability - 1;
        System.out.println("Zabrano -" + power + " życia");
    }

    public void showStats(boolean you){
        if(you){
            System.out.println("Twoje statystyki: ");
        }
        else{
            System.out.println("Statystyki przeciwnika");
        }
        healthBarr();
        System.out.println(" - Punkty życia");
        headArmourBarr();
        System.out.println(" - Punkty Wytrzymałości Hełmu");
        bodyArmourBarr();
        System.out.println(" - Punkty Wytrzymałości Pancerza");
    }

    private void bodyArmourBarr(){
        if(this.armourBodyDurability <= 0){
            System.out.print("[");
            for(int i = 0 ; i < 30 ; i++){
                System.out.print(" ");
            }
        }
        else{
            double inputInt = 30 * ( this.armourBodyDurability / armourBody.getDurability());
            System.out.print("[");
            for(int i = 0 ; i < inputInt ; i++){
                System.out.print("|");
            }
            for(int i = 0 ; i < 30 - inputInt ; i++){
                System.out.print(" ");
            }
        }
        System.out.print("]");
    }

    private void headArmourBarr(){
        if(this.armourHeadDurability <= 0){
            System.out.print("[");
            for(int i = 0 ; i < 30 ; i++){
                System.out.print(" ");
            }
        }
        else{
            double inputInt = 30 * ( this.armourHeadDurability / armourHead.getDurability());
            System.out.print("[");
            for(int i = 0 ; i < inputInt ; i++){
                System.out.print("|");
            }
            for(int i = 0 ; i < 30 - inputInt ; i++){
                System.out.print(" ");
            }
        }
        System.out.print("]");
    }

    private void healthBarr(){
        if(this.healthPoints <= 0){
            System.out.print("[");
            for(int i = 0 ; i < 30 ; i++){
                System.out.print(" ");
            }
        }
        else{
            double inputInt = 30 * ( this.healthPoints / 100);
            System.out.print("[");
            for(int i = 0 ; i < inputInt ; i++){
                System.out.print("|");
            }
            for(int i = 0 ; i < 30 - inputInt ; i++){
                System.out.print(" ");
            }
        }
        System.out.print("]");
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void setArmourBodyDurability(double armourBodyDurability) {
        this.armourBodyDurability = armourBodyDurability;
    }

    public void setArmourHeadDurability(double armourHeadDurability) {
        this.armourHeadDurability = armourHeadDurability;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void setArmourBody(ArmourBody armourBody) {
        this.armourBody = armourBody;
    }

    public void setArmourHead(ArmourHead armourHead) {
        this.armourHead = armourHead;
    }

    public void setHealthPoints(double healthPoints) {
        this.healthPoints = healthPoints;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    public double getHealthPoints() {
        return healthPoints;
    }

    public int getMoney() { return money; }

    public Weapon getWeapon() {
        return weapon;
    }

    public int getXp() {
        return xp;
    }

    public double getArmourHeadDurability() {
        return armourHeadDurability;
    }

    public ArmourBody getArmourBody() {
        return armourBody;
    }

    public double getArmourBodyDurability() {
        return armourBodyDurability;
    }

    public ArmourHead getArmourHead() {
        return armourHead;
    }
}
