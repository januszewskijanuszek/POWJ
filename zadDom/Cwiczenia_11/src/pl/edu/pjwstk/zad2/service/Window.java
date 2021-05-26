package pl.edu.pjwstk.zad2.service;

import pl.edu.pjwstk.zad2.items.Button;
import pl.edu.pjwstk.zad2.items.Randomise;
import pl.edu.pjwstk.zad2.items.TextField;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

public class Window extends JFrame implements ActionListener {
    // Icon
    private final ImageIcon logoIcon = new ImageIcon("src/pl/edu/pjwstk/zad3/logo.png");

    // Custom classes
    private Button button = new Button(50,25,10,10,"Upload");
    private TextField textField = new TextField();
    private Randomise randNum = new Randomise();

    private JLabel label = new JLabel();

    private int roundCounter = 0;

    public Window(){
        label.setText("Chose number between 1 and 100");
        button.addActionListener(this);

        this.setTitle("zadanie 2");
        this.setVisible(true);
        this.setResizable(false);
        this.setLayout(new FlowLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setIconImage(logoIcon.getImage());
        this.setSize(275,150);
        this.add(label);
        this.add(button);
        this.add(textField);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button){
            String value = textField.getText();
            System.out.println(value);
            System.out.println(randNum.getRandomNumber());
            boolean save = false;
            try{
                double number = Double.parseDouble(value);
                save = true;
            }catch (NumberFormatException exp){
                JOptionPane.showMessageDialog(null, exp.getMessage(), "Insert value!", JOptionPane.ERROR_MESSAGE);
            }
            if(save){
                double number = Double.parseDouble(value);
                if(randNum.getRandomNumber() > number){
                    JOptionPane.showMessageDialog(null,"Too low!", "Result", JOptionPane.INFORMATION_MESSAGE);
                } else if(randNum.getRandomNumber() < number){
                    JOptionPane.showMessageDialog(null,"Too high!", "Result", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null,"Perfect! Tryes: " + roundCounter, "Result", JOptionPane.INFORMATION_MESSAGE);
                    this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
                }
            }
            roundCounter++;
        }
    }
}
