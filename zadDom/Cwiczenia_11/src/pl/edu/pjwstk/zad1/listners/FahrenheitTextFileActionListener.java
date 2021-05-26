package pl.edu.pjwstk.zad1.listners;

import pl.edu.pjwstk.zad1.service.CalculateService;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FahrenheitTextFileActionListener implements ActionListener {


    @Override
    public void actionPerformed(ActionEvent e) {
        // Nasłuchuje eventów
        String value = e.getActionCommand();
        try{
            double f = Double.parseDouble(value);
            double result = CalculateService.convertFtoC(f);
            
        }catch(NumberFormatException exp){
            // Wywala błąd w okienku
            JOptionPane.showMessageDialog(null, exp.getMessage(), "Invalid Value", JOptionPane.ERROR_MESSAGE);
        }
    }
}
