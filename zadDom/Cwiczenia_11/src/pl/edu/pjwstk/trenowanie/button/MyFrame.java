package pl.edu.pjwstk.trenowanie.button;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class MyFrame extends JFrame implements ActionListener {

    private Button button;
    private JLabel label;
    private File file = new File("logo.png");

    MyFrame(){
        ImageIcon image = new ImageIcon("src/pl/edu/pjwstk/trenowanie/button/logo.png");
        System.out.println(file.getAbsolutePath());
        this.setIconImage(image.getImage());

        label = new JLabel();
        label.setBounds(150,250,150,150);
        label.setVisible(false);


        this.button = new Button(200, 100, 100,50, "Siema");
        button.addActionListener(this); // Implements listener to button class
        // button.setEnabled(false);



        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setLayout(null);
        this.setSize(500, 500);
        this.add(button);
        this.add(label);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // What event while click
        if(e.getSource() == button){
            label.setVisible(true);
            label.setText("Essa");
        }
    }
}
