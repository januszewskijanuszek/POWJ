package pl.edu.pjwstk.trenowanie;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    MyFrame(){
        this.setTitle("Essasito");                             // Set title of frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   // exit out application
        this.setResizable(false);                              // Prevent frame from beefing resize
        this.setSize(420, 420);                    // Sets x detention and y detention
        this.setVisible(true);                                 // Make frame visible but very small

        ImageIcon icon = new ImageIcon("logo.png");     // Create an icon of frame
        this.setIconImage(icon.getImage());                    // Change icon of frame
        this.getContentPane().setBackground(Color.GRAY);       // Change color of background;
    }
}
