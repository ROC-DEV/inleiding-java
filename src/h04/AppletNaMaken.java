package h04;

import java.awt.*;
import javax.swing.*;

public class AppletNaMaken extends JApplet {

public void init() {
    setBackground(Color.WHITE);
    this.setSize(600,400);
}

public void paint(Graphics g) {
    super.paint(g);

    // Lijn
    g.setColor(Color.BLACK);
    g.drawLine(10,10,150,10);
    g.drawString("Lijn",71,23);

    //Rechthoek
    g.drawRect(10,40,140,75);
    g.drawString("Rechthoek",53,130);

    //Afgeronde Rechthoek
    g.drawRoundRect(10,140,140,75,30,30);
    g.drawString("Afgeronde Rechthoek",25,230);

    //Gevulde ovaal
    g.setColor(Color.MAGENTA);
    g.fillOval(160,140,140,75);
    g.setColor(Color.BLACK);
    g.drawString("Gevulde ovaal",185,230);

    //Gevulde rechthoek met ovaal
    g.setColor(Color.MAGENTA);
    g.fillRect(160,40,140,75);
    g.setColor(Color.BLACK);
    g.drawOval(160,40,139,74);
    g.drawString("Gevulde rechthoek met ovaal",155,130);

    //Taartpunt met ovaal eromheen
    g.setColor(Color.BLACK);
    g.drawOval(332,40,139,74);
    g.drawString("Taartpunt met ovaal eromheen",320,130);
    g.setColor(Color.MAGENTA);
    g.fillArc(332,40,139,74,0,45);

    //Cirkel
    g.setColor(Color.BLACK);
    g.drawArc(353,138,80,80,360,360);
    g.drawString("Cirkel",379,230);

}

}
