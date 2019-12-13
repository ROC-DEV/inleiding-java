package h11;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class h11_praktijkopdracht extends Applet {
    Button okknop;
    TextField tekstvak;
    String s;
    int eerstegetal;
    int x;



    public void init(){

        tekstvak = new TextField(20);
        okknop = new Button("bereken");
add(tekstvak);
add(okknop);
        setSize(600,600);
       s = "";
       okknop.addActionListener(new okknopListener());
    }

    public void paint(Graphics g){
        for (int i = 0; i < 11; i++) {
            g.drawString("" +x,20,50+i*15);
            x = 0;
            x = eerstegetal*i;

        }



    }
    public class okknopListener implements ActionListener {
        public void actionPerformed (ActionEvent e) {
            s = tekstvak.getText();
            eerstegetal = Integer.parseInt(s);
            repaint();

        }
    }


}
