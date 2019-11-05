package h11;

import java.applet.Applet;
import java.awt.event.*;
import java.awt.*;

public class h11_6 extends Applet {

    public void init(){
        setSize(600,600);
    }

    public void paint(Graphics g){
        int y=50;
        int x=50;
        int breedte=5;
        int grootte=5;
        int teller=0;

        while(teller<5){

            x-=10;
            y-=10;

            breedte+=5;
            grootte+=5;
            teller++;

            g.drawOval(breedte,grootte,x,y);

        }
    }
}
