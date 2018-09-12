package h08;


import java.awt.*;
import java.awt.event.*;
import java.applet.*;


public class Belasting extends Applet {

    double btw;
    Button ok;
    TextField tekstvak;
    double getal;




    public void init() {

        ok = new Button("Ok");
        tekstvak = new TextField("", 20);

        ok.addActionListener(new OkListener() );
        tekstvak.addActionListener( new TekstvakListener() );

        add(tekstvak);
        add(ok);



    }

    public void paint(Graphics g){
        g.drawString("Inclusief 21% BTW: " + btw, 50, 60);




    }

    class OkListener implements ActionListener {
        public void actionPerformed( ActionEvent e) {
           String s = tekstvak.getText();
           getal = Double.parseDouble(s);
            btw = getal / 100 * 121;

            repaint();


    }}

        class TekstvakListener implements ActionListener {
            public void actionPerformed( ActionEvent e) {
                String s = tekstvak.getText();
                getal = Double.parseDouble(s);
                btw = getal / 100 * 121;
                repaint();

            }}}