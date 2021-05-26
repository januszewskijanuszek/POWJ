package pl.edu.pjwstk.zad1.panel;

import pl.edu.pjwstk.zad1.listners.CelsiusTextFileActionListener;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class CelsiusPanel extends JPanel {
    private static final TitledBorder TITLED_BORDER = new TitledBorder("Celsius");
    private static final JLabel LABEL = new JLabel();
    private static final JTextField TEXT_FIELD = new JTextField(5);

    public CelsiusPanel(){
        TEXT_FIELD.addActionListener(new CelsiusTextFileActionListener());
        initialize();
    }

    private void initialize() {
        TITLED_BORDER.setTitleColor(Color.BLACK);
        TITLED_BORDER.setBorder(BorderFactory.createMatteBorder(1,1,1,1, Color.BLUE));

        setLayout(new GridBagLayout());

        GridBagConstraints gbcPanel = new GridBagConstraints();
        gbcPanel.fill = GridBagConstraints.BOTH;
        gbcPanel.insets = new Insets(5,5,5,5);

        gbcPanel.gridx = 0;
        gbcPanel.gridy = 0;
        add(LABEL, gbcPanel);

        gbcPanel.gridx = 0;
        gbcPanel.gridy = 0;
        add(TEXT_FIELD, gbcPanel);

        setBorder(TITLED_BORDER);
    }
}
