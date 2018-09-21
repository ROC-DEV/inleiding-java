package h08;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Tekstvak extends Applet {
    TextField tekstvak;
    Button reset;
    Button ok;
    String s;

    public void init() {

        tekstvak = new TextField("", 30);
        reset = new Button("Reset");
        ok = new Button ("OK");



    reset.addActionListener( new ResetListener() );
    ok.addActionListener( new OkListener () );
        add(tekstvak);
        add(reset);
        add(ok);
    }

    public void paint(Graphics g) {
        g.drawString(s, 50, 60 );


    }


class ResetListener implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
            tekstvak.setText("");
            s = tekstvak.getText();
            repaint();
        }}

            class OkListener implements ActionListener {
    public void actionPerformed( ActionEvent e) {
     s = tekstvak.getText();
             repaint();

    }}}