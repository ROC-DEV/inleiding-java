package h08;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;

public class h8_3 extends Applet {
    Button Okknop;
    Button Resetknop;
    double waarde;
    double totaal;

    TextField tekstvak;


    public void init(){
        tekstvak = new TextField("",20);

        Okknop= new Button("OK");
        Okknop.addActionListener(new OkknopListener());
        add(Okknop);
        add(tekstvak);
        totaal= 0;

        Resetknop= new Button("Reset");
        Resetknop.setLabel("Reset");
        Resetknop.addActionListener(new ResetknopListener());
        add(Resetknop);
        setSize(400,400);
    }

    public void paint(Graphics g){
        g.drawString("Prijs zonder BTW €^^",100,50);
        g.drawString("Prijs met BTW : €" + totaal ,100,200);
    }




    public class OkknopListener implements ActionListener{

        public void actionPerformed(ActionEvent e) {
            waarde= Double.valueOf(tekstvak.getText());
            totaal= waarde * 1.21;
            repaint();

        }
    }

    public class ResetknopListener implements ActionListener{

        public void actionPerformed(ActionEvent e) {
            waarde = 0;
            totaal = 0;
            tekstvak.setText("");

            repaint();

        }
    }
}

