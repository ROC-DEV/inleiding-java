package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class MaxNumber extends Applet {

    TextField tekstvak;
//    TextField maxTekstvak;
//    TextField minTekstvak;
    double maxNumber = Integer.MAX_VALUE;
    double userInputNumber;
    String gettext = "";

    @Override
    public void init() {
        super.init();

        tekstvak = new TextField("", 20);
        tekstvak.addActionListener(new MaxNumber.MaxGetalListener());

//        minTekstvak = new TextField("",20);
//        minTekstvak.addActionListener(new MaxNumber.MaxGetalListener());
//
//        maxTekstvak = new TextField("",20);
//        maxTekstvak.addActionListener(new MaxNumber.MaxGetalListener());

        add(tekstvak);
//        add(minTekstvak);
//        add(maxTekstvak);
        gettext = tekstvak.getText();
        repaint();
    }

    class MaxGetalListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            userInputNumber = Double.parseDouble(gettext);

            if (userInputNumber > maxNumber) {
                getGraphics().drawString("" + userInputNumber,50,50);
//                minTekstvak.setText("" + userInputNumber);
            } else {
                getGraphics().drawString("" + maxNumber,50,50);
//                maxTekstvak.setText("" + maxNumber);
            }
            repaint();
        }
    }
}
