package h12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;


public class Tabel extends Applet {

    TextField[] tekstvak;
    int[] getallen;

    public void init() {

        tekstvak = new TextField[5];
        getallen = new int[5];
        Button Ok = new Button("Ok");

        Ok.addActionListener(new OkListener());
        add(Ok);


        for (int i = 0; i < tekstvak.length; i++) {
            TextField tekstvak2 = new TextField("", 2);
            tekstvak[i] = tekstvak2;
            add(tekstvak2);
        }
    }


    class OkListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            for (int i = 0; i < tekstvak.length; i++) {

                String input = tekstvak[i].getText();
                getallen[i] = Integer.parseInt(input);

            }

            Arrays.sort(getallen);


            for (int i = 0; i < getallen.length; i++) {
                tekstvak[i].setText(String.valueOf(getallen[i]));


            }
        }


    }
}




