package h04;


import java.awt.*;
import java.applet.*;

public class Vlag extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.lightGray);
        g.setColor(Color.black);
        g.fillRect(115, 160, 5, 700);
        g.setColor(Color.red);
        g.fillRect(120, 160, 115, 30);
        g.setColor(Color.white);
        g.fillRect(120, 190, 115, 30);
        g.setColor(Color.blue);
        g.fillRect(120, 220, 115, 30);



    }
}
