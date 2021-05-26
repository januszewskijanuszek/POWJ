package pl.edu.pjwstk.zad4.service;

import pl.edu.pjwstk.trenowanie.Button;
import sun.applet.AppletEvent;
import sun.applet.AppletListener;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Window extends JFrame implements AppletListener {
    // Rnadom
    Random rand = new Random();

    // Labels
    JLabel[] winner = new JLabel[3];

    // Logo icon
    private final ImageIcon logoIcon = new ImageIcon("src/pl/edu/pjwstk/zad4/logo.png");

    // Flags
    private final ImageIcon polishFlag          = new ImageIcon("src/pl/edu/pjwstk/zad4/items/flags/polishFlag.png");
    private final ImageIcon naziGermanyFlag     = new ImageIcon("src/pl/edu/pjwstk/zad4/items/flags/naziGermanyFlag.png");
    private final ImageIcon sovietFlag          = new ImageIcon("src/pl/edu/pjwstk/zad4/items/flags/sovietFlag.png");
    private final ImageIcon imperialJapanFlag   = new ImageIcon("src/pl/edu/pjwstk/zad4/items/flags/imperialJapanFlag.png");
    private final ImageIcon britishFlag         = new ImageIcon("src/pl/edu/pjwstk/zad4/items/flags/britishFlag.png");

    public Window(){
        for(int i = 0 ; i < winner.length ; i++){
            winner[i] = new JLabel();
        }
        int[] chose = new int[3];
        for(int i = 0 ; i < chose.length ; i++){
            int item = rand.nextInt(5)+1;
            boolean doIt = true;
            for (int value: chose) {
                if(value == item){
                    i--;
                    doIt = false;
                    break;
                }
            }
            if(doIt){
                chose[i] = item;
                winner[i].setBorder(BorderFactory.createEtchedBorder());
                switch(item){
                    case 1:{
                        winner[i].setIcon(polishFlag);
                        break;
                    }
                    case 2:{
                        winner[i].setIcon(naziGermanyFlag);
                        break;
                    }
                    case 3:{
                        winner[i].setIcon(sovietFlag);
                        break;
                    }
                    case 4:{
                        winner[i].setIcon(imperialJapanFlag);
                        break;
                    }
                    case 5:{
                        winner[i].setIcon(britishFlag);
                        break;
                    }
                }
            }
        }
        // Settings
        this.setIconImage(logoIcon.getImage());
        this.setTitle("chata");
        this.setVisible(true);                  // Window is visible
        this.setSize(1100,700);      // Setting size of window
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    // Close button is working
        this.setLayout(new FlowLayout());
        for(int i = 0 ; i < winner.length ; i++){
            this.add(winner[i]);
        }
    }

    @Override
    public void appletStateChanged(AppletEvent e) {

    }


}
