package pl.edu.pjwstk.zad1.service;

import pl.edu.pjwstk.zad1.panel.CelsiusPanel;
import pl.edu.pjwstk.zad1.panel.FahrenheitPanel;
import pl.edu.pjwstk.zad1.pattern.Mediator;

import javax.swing.*;
import java.awt.*;

public class Converter {

    private static final JFrame mainFrame = new JFrame();
    private static final JPanel panel = new JPanel();

    private static final int WIDTH = 300;
    private static final int HEIGHT = 200;

    private static int SCREEN_HEIGHT;
    private static int SCREEN_WIDTH;

    private final Mediator mediator = new Mediator();

    public Converter(){

    }

    {
        resolveScreenSize();
        initializePanel();
        initializeFrame();
    }

    private void initializePanel() {
        panel.setLayout(new GridBagLayout());
        GridBagConstraints gbcPanel = new GridBagConstraints();
        gbcPanel.fill = GridBagConstraints.BOTH;
        gbcPanel.insets = new Insets(5,5,5,5);

        gbcPanel.gridx = 0;
        gbcPanel.gridy = 0;
        gbcPanel.gridwidth = 1;
        gbcPanel.gridheight = 1;

        CelsiusPanel celsiusPanel = new CelsiusPanel();
        panel.add(celsiusPanel, gbcPanel);

        gbcPanel.gridx = 1;
        gbcPanel.gridy = 0;
        gbcPanel.gridwidth = 1;
        gbcPanel.gridheight = 1;

        FahrenheitPanel fahrenheitPanel = new FahrenheitPanel(mediator);
        panel.add(fahrenheitPanel, gbcPanel);

        mediator.register(celsiusPanel);
        mediator.register(fahrenheitPanel);
    }

    private void resolveScreenSize() {
        Toolkit toolKit = Toolkit.getDefaultToolkit();
        Dimension screenSize = toolKit.getScreenSize();
        SCREEN_HEIGHT = screenSize.height;
        SCREEN_WIDTH = screenSize.width;
    }

    private void initializeFrame(){
        mainFrame.setTitle("Converter");
        mainFrame.setSize(WIDTH, HEIGHT);
        mainFrame.setLocation(SCREEN_WIDTH / 3, SCREEN_HEIGHT / 3);
        mainFrame.setDefaultCloseOperation(JInternalFrame.EXIT_ON_CLOSE);
        mainFrame.add(panel);
        mainFrame.setVisible(true);
    }
}
