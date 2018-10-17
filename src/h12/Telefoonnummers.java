package h12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Telefoonnummers extends Applet {

    int teller = 0;

    String[] naam;
    String[] nummer;

    TextField naaminvoer;
    TextField nummerinvoer;


    Button Ok;
    Button reset;

    public void init() {

        naaminvoer = new TextField(10);
        nummerinvoer = new TextField(20);
        Ok = new Button("Ok");
        reset = new Button("Reset");

        add(naaminvoer);
        add(nummerinvoer);
        add(Ok);
        add(reset);

        Ok.addActionListener(new OkListener());
        reset.addActionListener(new ResetListener());

        naam = new String[10];
        nummer = new String[10];


    }


    public void paint(Graphics g) {

        g.drawString("Naam", 55, 40);
        g.drawString("Telefoonnummer", 160, 40);

        g.drawString("" + teller, 10, 25);


        for (int i = 0; i < naam.length; i++) {
            if (teller == 10) {

                g.drawString("" + naam[i], 70, 20 * i + 100);
                g.drawString("" + nummer[i], 160, 20 * i + 100);

            }
        }
    }

    public class OkListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            naam[teller] = "" + naaminvoer.getText();
            nummer[teller] = "" + nummerinvoer.getText();

            naaminvoer.requestFocus();


            teller++;

            naaminvoer.setText("");
            nummerinvoer.setText("");

            repaint();


        }
    }

    public class ResetListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            System.out.println("kAANKA");

            naaminvoer.setText("");
            nummerinvoer.setText("");
            teller = 0;

            for (int o = 0; o < naam.length + 1; o++) {
                naam[o] = "";
                nummer[o] = "";

                repaint();
            }

        }
    }
}



