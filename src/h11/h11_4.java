package h11;

import java.awt.event.*;
import java.awt.*;
import java.applet.Applet;

public class h11_4 extends Applet {

    public void init(){
        setSize(400,400);
    }


    public void paint(Graphics g){
        int y=0;
        int teller= 0;

        while (teller<30){
            y+=20;
            teller+=3;
            g.drawString(teller+ "",50,y);

        }



    }

}
