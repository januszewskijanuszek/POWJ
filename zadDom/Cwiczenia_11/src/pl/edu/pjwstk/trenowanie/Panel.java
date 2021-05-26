package pl.edu.pjwstk.trenowanie;

import javax.swing.*;
import java.awt.*;

public class Panel {
    public static void main(String[] args) {
        // JPanel == a gui component that functions as a container to hold other components

        JFrame frame = new JFrame();
        JPanel orangePanel = new JPanel(); // Create a panel
        JPanel bluePanel = new JPanel();
        JPanel redPanel = new JPanel();

        orangePanel.setBackground(Color.ORANGE);
        bluePanel.setBackground(Color.BLUE);
        redPanel.setBackground(Color.RED);

        orangePanel.setBounds(0,0, 250,250);
        bluePanel.setBounds(orangePanel.getHeight(),0, 250,250);
        redPanel.setBounds(0,orangePanel.getHeight(), orangePanel.getWidth()+bluePanel.getWidth(),250);

        // As before in App
        frame.setVisible(true);
        frame.setSize(750,750);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(orangePanel);
        frame.add(bluePanel);
        frame.add(redPanel);


    }
}
