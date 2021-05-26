package pl.edu.pjwstk.trenowanie.button;

import javax.swing.*;

public class Button extends JButton {
    private final int x;
    private final int y;
    private final int width;
    private final int height;
    private final String text;

    Button(int x, int y, int width, int height, String text){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.text = text;
        this.setBounds(x, y, width, height);
        this.setText(text);
        this.setFocusable(false);
    }
}
