package h11;

import java.applet.Applet;
import java.awt.*;

public class h11_8 extends Applet {

    public void init(){
        setSize(600,600);

    }

    public void paint(Graphics g){
        int x=500;
        int y=500;

        int teller=0;
        int breedte= 10;
        int grootte= 10;

        while (teller<100){

        x-=10;
        y-=10;

        breedte+=10;
        grootte+=10;
        teller++;

        g.drawOval(breedte,grootte,x,y);
    }
    }

}
