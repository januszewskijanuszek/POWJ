package pl.edu.pjwstk.zadanie3;

import java.util.*;

public class Remote {
    TV tv = new TV();

    public void switchPower(boolean sPower){
        if(!sPower){
            System.out.println("Czy chcesz włączyć telewizor?");
        }
        else{
            System.out.println("Czy chcesz wyłączyć telewizor?");
        }
        System.out.println("Y - Tak\tN - Nie");
        String input = new Scanner(System.in).next();
        if(!sPower){
            if(input.equals("Y")||input.equals("y")){
                tv.setOn(true);
            }
            else{
                tv.setOn(false);
            }
        }
        else{
            if(input.equals("N")||input.equals("n")){
                tv.setOn(true);
            }
            else{
                tv.setOn(false);
            }
        }
    }

    private void channelUp(){
        tv.setChannel(tv.getChannel() + 1);
    }

    private void channelDown(){
        tv.setChannel(tv.getChannel() - 1);
    }

    private void volumeUp(){
        tv.setVolume(tv.getVolume() + 1);
    }

    private void volumeDown(){
        tv.setVolume(tv.getVolume() - 1);
    }

    private void channelNum(int inputNumber){
        tv.setChannel(inputNumber);
    }

    public boolean isOn(){
        return tv.isOn();
    }

    private void menu(){
        System.out.println("Menu Pilota:");
        System.out.println("1\t-\tVolume +");
        System.out.println("2\t-\tVolume -");
        System.out.println("3\t-\tChannel +");
        System.out.println("4\t-\tChannel -");
        System.out.println("5\t-\tChose Channel");
        System.out.println("10\t-\tSwitch Off");
    }

    public void switchRemote(){
        menu();
        int choice = new Scanner(System.in).nextInt();
        switch(choice){
            case 1 :{
                volumeUp();
                break;
            }
            case 2:{
                volumeDown();
                break;
            }
            case 3:{
                channelUp();
                break;
            }
            case 4:{
                channelDown();
                break;
            }
            case 5:{
                System.out.print("Wprowadz kanał: ");
                int channel = new Scanner(System.in).nextInt();
                channelNum(channel);
                break;
            }
            case 10:{
                switchPower(true);
                break;
            }
        }
    }

}
