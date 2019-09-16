package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class MaxNumber extends Applet {

    TextField tekstvak;
//    TextField maxTekstvak;
//    TextField minTekstvak;
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

        repaint();
    }

    class MaxGetalListener implements ActionListener {
        double _hoogsteGetal = 0.0;

        public void actionPerformed(ActionEvent e) {
            gettext = tekstvak.getText();
            userInputNumber = Double.parseDouble(gettext);

            if (userInputNumber > _hoogsteGetal) {
                _hoogsteGetal = userInputNumber;
                //getGraphics().drawString("" + userInputNumber,50,50);
//                minTekstvak.setText("" + userInputNumber);
            }

            System.out.print(_hoogsteGetal);
            repaint();
        }
    }
}
