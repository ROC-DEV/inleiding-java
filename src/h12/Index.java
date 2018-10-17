package h12;

import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Index extends Applet {

    boolean gevonden;
    double[] getallen = {100, 20, 49, 492, 41, 200, 300, 400, 500, 600};
    double gezocht;
    int index = 0;

    String output;
    TextField invoer;

    public void init() {

        gevonden = false;
        output = "";


        invoer = new TextField("", 10);
        add(invoer);

        invoer.addActionListener(new TekstvakListener());


    }

    public void paint(Graphics g) {
        g.drawString("" + output, 20, 50);


    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            String text = invoer.getText();
            gezocht = Double.parseDouble(text);

            for (int i = 0; i < getallen.length && !gevonden; i++) {
                index += 1;
                if (getallen[i] == gezocht) {
                    gevonden = true;

                }
            }

            if (gevonden) {
                output = "gevonden op " + index;
            }
            else {
                output = "niet gevonden";
            }



            index = 0;
            gevonden = false;
            repaint();



        }
    }

}
