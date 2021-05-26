package pl.edu.pjwstk.zad3.service;

import pl.edu.pjwstk.zad3.items.Button;
import pl.edu.pjwstk.zad3.items.TextField;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window extends JFrame implements ActionListener {

    private final ImageIcon logoIcon = new ImageIcon("src/pl/edu/pjwstk/zad3/logo.png");

    private Button button = new Button(10,10,100,50, "Submit");
    private TextField textField = new TextField();

    private static int SCREEN_HEIGHT;
    private static int SCREEN_WIDTH;

    public Window() {
        button.addActionListener(this);
        resolveScreenSize();
        service();
    }

    private void service(){
        this.setLocation(SCREEN_WIDTH/3, SCREEN_HEIGHT/3);
        this.setVisible(true);
        this.setTitle("zadanie 3");
        this.setIconImage(logoIcon.getImage());
        this.setLayout(new FlowLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(button);
        this.add(textField);
        this.pack();
    }

    private void resolveScreenSize() {
        Toolkit toolKit = Toolkit.getDefaultToolkit();
        Dimension screenSize = toolKit.getScreenSize();
        SCREEN_HEIGHT = screenSize.height;
        SCREEN_WIDTH = screenSize.width;
    }
    
    private String convert(String text){
        StringBuilder fin = new StringBuilder(text);
        fin.reverse();
        return fin.toString();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button){
            String text = textField.getText();
            JOptionPane.showMessageDialog(null,convert(text), "Result", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
