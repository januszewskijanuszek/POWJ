package pl.edu.pjwstk.trenowanie;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.util.Random;

public class App {
    public static void main(String[] args) {
        Random rand = new Random();

        Border border = BorderFactory.createLineBorder(Color.GREEN);

        JLabel label = new JLabel();        // create label
        label.setText("Essa");              // set text of label
        ImageIcon image = new ImageIcon("C:\\Users\\janus\\Documents\\GitHub\\POWJ\\zadDom\\Cwiczenia_11\\src\\pl\\edu\\pjwstk\\trenowanie\\logo.png");
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER); // Set text left centre, left, right of image
        label.setVerticalTextPosition(JLabel.TOP); // Set text top bottom, centre of image
        label.setForeground(Color.ORANGE); // change color
        label.setFont(new Font("arial", Font.PLAIN, 60)); // set font of text
        label.setIconTextGap(100); // Set gap of text to image
        label.setBackground(Color.GRAY);
        label.setOpaque(true); // Display bg color
        label.setBorder(border);

        JFrame frame = new JFrame();                            // Creates frame (not visible)
        frame.setTitle("Essasito");                             // Set title of frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   // exit out application
        frame.setResizable(false);                              // Prevent frame from beefing resize
        frame.setSize(800, 800);                    // Sets x detention and y detention
        frame.setVisible(true);                                 // Make frame visible but very small

        frame.setIconImage(image.getImage());
        //frame.getContentPane().setBackground(Color.GRAY);       // Change color of background;

        frame.add(label);

    }
}
