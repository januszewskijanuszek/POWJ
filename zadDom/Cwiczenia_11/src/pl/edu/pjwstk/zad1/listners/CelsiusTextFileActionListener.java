package pl.edu.pjwstk.zad1.listners;

import pl.edu.pjwstk.zad1.pattern.Mediator;
import pl.edu.pjwstk.zad1.service.CalculateService;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CelsiusTextFileActionListener implements ActionListener {

    //private final Mediator

    @Override
    public void actionPerformed(ActionEvent e) {
        // Nasłuchuje eventów
        String value = e.getActionCommand();
        try{
            double c = Double.parseDouble(value);
            System.out.println(c);
            // double result = CalculateService.convertFtoC(c);

        }catch(NumberFormatException exp){
            // Wywala błąd w okienku
            JOptionPane.showMessageDialog(null, exp.getMessage(), "Invalid Value", JOptionPane.ERROR_MESSAGE);
        }
    }
}
