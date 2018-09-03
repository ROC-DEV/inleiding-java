package h04;

import java.awt.*;
import java.applet.*;

public class Diagram extends Applet {

    public void init() {}


    public void paint(Graphics g) {
        setBackground(Color.white);

        Font font = new Font ("Font1", Font.PLAIN, 24);
        g.setFont(font);
        g.drawString("Valerie",130,650);
        g.drawString("Hans",260,650);
        g.drawString("Jeroen",390,650);

        g.fillRect(130, 615, 350, 10);
        g.fillRect(480, 60, 10, 565);

        Font font1 = new Font ("Font1", Font.PLAIN, 18);
        g.setFont(font1);

        g.drawString("0",500,600);
        g.drawString("20",500,500);
        g.drawString("40",500,400);
        g.drawString("60",500,300);
        g.drawString("80",500,200);
        g.drawString("100",500,100);


        g.setColor(Color.green);
        g.fillRect(130, 400, 80, 200); //=40 kg

        g.setColor(Color.blue);
        g.fillRect(260, 200, 80, 400); //=80 kg

        g.setColor(Color.red);
        g.fillRect(390, 100, 80, 500); //=100
    }
}