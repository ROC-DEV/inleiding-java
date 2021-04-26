package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Max_Min_Getal extends Applet {

    TextField tekstvak;
    double userInputNumber;
    double _hoogsteGetal = 0.0;
    double _LaagsteGetal = 0.0;
    boolean eersteGetal;
    String gettext = "";


    @Override
    public void init() {
        super.init();
        tekstvak = new TextField("", 20);
        tekstvak.addActionListener(new Max_Min_Getal.MaxGetalListener());
        eersteGetal = true;
        add(tekstvak);
        repaint();
    }

    public void paint(Graphics g) {
        g.drawString("HoogsteGetal:" + _hoogsteGetal,50,80);
        g.drawString("LaagsteGetal" + _LaagsteGetal,50,110);
    }

    class MaxGetalListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            gettext = tekstvak.getText();
            userInputNumber = Double.parseDouble(gettext);

            if (eersteGetal) {
            eersteGetal = false;
            _hoogsteGetal = userInputNumber;
            _LaagsteGetal = userInputNumber;
            tekstvak.setText("");
            repaint();
            } else {
                if (userInputNumber > _hoogsteGetal) {
                    _hoogsteGetal = userInputNumber;
                    tekstvak.setText("");
                    repaint();
                    } else if (userInputNumber < _LaagsteGetal) {
                        _LaagsteGetal = userInputNumber;
                        tekstvak.setText("");
                        repaint();
                        }
                }
            }
        }
    }
