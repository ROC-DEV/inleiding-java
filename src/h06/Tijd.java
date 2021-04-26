package h06;


import java.awt.*;
import javax.swing.*;
public class Tijd extends JApplet {

    int uur;
    int dag;
    int jaar;

    public void init() {
        uur = 60*60;
        dag = uur*24;
        jaar = dag*365;
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.drawLine(0,30,500,30);
        g.drawLine(0,60,500,60);
        g.drawLine(0,90,500,90);
        g.drawLine(0,120,500,120);
        g.drawLine(100,0,100,500);

        g.drawString("" + uur,110,48);
        g.drawString("" + dag,110,78);
        g.drawString("" + jaar,110,108);

        g.drawString("Uur",40,48);
        g.drawString("Dag",40,78);
        g.drawString("Jaar",40,108);
        g.drawString("Seconden",110,18);
    }

}
