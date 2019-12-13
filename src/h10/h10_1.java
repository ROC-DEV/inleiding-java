package h10;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.applet.Applet;
import java.awt.event.ActionListener;

public class h10_1 extends Applet {
    int minimumgetal, getal2, maximumgetal, getal4;
    TextField tekstvak;
    Label label;
    String s, text, omgekeerd;

    public void init(){
        tekstvak= new TextField("",20);
        tekstvak.addActionListener(new tekstvakListener());
        minimumgetal= -9999;
        add(tekstvak);
        maximumgetal= 9999;


        setSize(400,400);
    }

    public void paint(Graphics g){
        g.drawString(text+"is het hoogste getal ", 20,60);
        g.drawString(omgekeerd+"is het laagste getal",20,80);


    }

    public class tekstvakListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            s= tekstvak.getText();
            getal2= Integer.parseInt(s);
            text= String.valueOf(minimumgetal);
            repaint();
            if (minimumgetal < getal2){
                text= String.valueOf(getal2);
                minimumgetal= getal2;
            } else {
                text= String.valueOf(minimumgetal);
            }
            s= tekstvak.getText();
            getal4= Integer.parseInt(s);
            if(maximumgetal>getal4){
                omgekeerd= String.valueOf(getal4);
                maximumgetal = getal4;
            } else {
                omgekeerd = String.valueOf(maximumgetal);
            }
            repaint();
        }

    }
}
