package h05;

import java.awt.*;
import java.applet.*;

// DIT IS OPDRACHT 5.2

public class Diagram2 extends Applet {
    int gewichtValerie;
    int gewichtHans;
    int gewichtJeroen;



    public void init() {

            gewichtValerie = 40;
            gewichtHans = 80;
            gewichtJeroen = 100;

                    //hier kunnen de getallen 40, 80, en 100 worden aangepast


    }


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
        g.fillRect(130, 600 - gewichtValerie * 5, 80, gewichtValerie * 5); //40 //y=400

        g.setColor(Color.blue);
        g.fillRect(260, 600 - gewichtHans * 5, 80, gewichtHans * 5); //80

        g.setColor(Color.red);
        g.fillRect(390, 600 - gewichtJeroen * 5, 80, gewichtJeroen * 5); //100


        // int hoogte = gewicht * 5
    }
}