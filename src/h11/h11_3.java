package h11;

import java.awt.event.*;
import java.awt.*;
import java.applet.Applet;

public class h11_3 extends Applet {
    int som;

    public void init(){
        setSize(400,400);

    }

    public void paint(Graphics g){
        int y= 0;
        int teller= 0;
        int arg1= 0;
        int arg2= 1;


        for (teller=0; teller<20; teller++){
            y+=20;
            g.drawString(som + "",50,y);

            som= arg1 + arg2;
            arg1=arg2;
            arg2=som;


        }

    }
}
