package challenge_okt;

import java.applet.Applet;
import java.awt.event.*;
import java.awt.*;

public class wereldtijd extends Applet {
    Button toonknop;
    int teller;
    int tijd;

    TextField tekstvak;
    Label label;

    public void init(){
        setSize(500,500);
        label=new Label("voer een uur in");
        tekstvak=new TextField("",10);
        add(label);
        add(tekstvak);

        toonknop= new Button("toon");
        toonknop.addActionListener(new toonknopListener());
        add(toonknop);


    }

    public void paint(Graphics g){


        for (teller = 0; teller<24; teller++) {

        }


    }

    class toonknopListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {


        }
    }

}
