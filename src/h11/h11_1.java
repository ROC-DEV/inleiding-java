package h11;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class h11_1 extends Applet {

    public void init(){
        setSize(500,500);

    }

    public void paint(Graphics g){
        int teller = 0;
        int x= 0;

        while(teller<10){
            x+=20;
            g.drawLine(x,50,x,300);
            teller++;
        }
    }
}
