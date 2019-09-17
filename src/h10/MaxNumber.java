package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class MaxNumber extends Applet {

    TextField tekstvak;
    double userInputNumber;
    String gettext = "";
    String tekst = "";
    double _hoogsteGetal = 0.0;


    @Override
    public void init() {
        super.init();

        tekstvak = new TextField("", 20);
        tekstvak.addActionListener(new MaxNumber.MaxGetalListener());
        add(tekstvak);
        repaint();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawString("" + _hoogsteGetal,50,50);
    }

    class MaxGetalListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            gettext = tekstvak.getText();
            userInputNumber = Double.parseDouble(gettext);

            if (userInputNumber > _hoogsteGetal) {
                _hoogsteGetal = userInputNumber;
            }
            System.out.print(_hoogsteGetal);
            repaint();
        }

        public void paint(Graphics g) {
            g.drawString("" + _hoogsteGetal,200,200);
        }

    }
}
