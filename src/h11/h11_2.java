package h11;

import java.applet.Applet;
import java.awt.event.*;
import java.awt.*;

public class h11_2 extends Applet {

    public void init(){
        setSize(400,400);
    }

    public void paint(Graphics g){
        int teller= 20;
        int y= 0;

        while (teller>9){
            y+=20;
            g.drawLine(50,y,300,y);
            g.drawString(""+ teller,305,y);
            teller--;
        }


    }
}
