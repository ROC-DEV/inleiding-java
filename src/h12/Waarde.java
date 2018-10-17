package h12;


import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Waarde extends Applet {

    String string;
    int[] getallen = {12, 40, 60, 20, 12, 12, 32, 40, 20, 40, 12, 92, 60};
    TextField tekstvak;


    int aantal = 0;


    public void init() {

        string = "";
        tekstvak = new TextField("", 10);
        add(tekstvak);
        tekstvak.addActionListener(new TekstvakListener());


    }

    public void paint(Graphics g) {

        g.drawString("" + string, 50, 80);

    }

    public class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            int search = Integer.parseInt(tekstvak.getText());
            for (int i = 0; i < getallen.length; i++) {
                if (getallen[i] == search) {
                    aantal++;
                }

            }

            if (aantal > 0) {
                string = "waarde is " + aantal + " keer gevonden.";
            } else {
                string = "waarde niet gevonden.";
            }

            aantal = 0;
            repaint();

        }

    }

}
