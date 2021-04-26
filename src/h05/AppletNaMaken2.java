package h05;


import java.awt.*;
import javax.swing.*;

public class AppletNaMaken2 extends JApplet {

    Color Opvulkleur;
    Color Lijnkleur;
    int breedte;
    int hoogte;
    int kleinebreedte;
    int kleinehoogte;

    public void init() {
        setBackground(Color.WHITE);
        this.setSize(600,400);

        breedte = 140;
        hoogte = 75;
        kleinebreedte = 139;
        kleinehoogte = 74;
        Opvulkleur = Color.MAGENTA;
        Lijnkleur = Color.BLACK;
    }

    public void paint(Graphics g) {
        super.paint(g);

        // Lijn
        g.setColor(Lijnkleur);
        g.drawLine(10,10,150,10);
        g.drawString("Lijn",71,23);

        //Rechthoek
        g.drawRect(10,40,breedte,hoogte);
        g.drawString("Rechthoek",53,130);

        //Afgeronde Rechthoek
        g.drawRoundRect(10,140,breedte,hoogte,30,30);
        g.drawString("Afgeronde Rechthoek",25,230);

        //Gevulde ovaal
        g.setColor(Opvulkleur);
        g.fillOval(160,140,breedte,hoogte);
        g.setColor(Lijnkleur);
        g.drawString("Gevulde ovaal",185,230);

        //Gevulde rechthoek met ovaal
        g.setColor(Opvulkleur);
        g.fillRect(160,40,breedte,hoogte);
        g.setColor(Lijnkleur);
        g.drawOval(160,40,kleinebreedte,kleinehoogte);
        g.drawString("Gevulde rechthoek met ovaal",155,130);

        //Taartpunt met ovaal eromheen
        g.setColor(Lijnkleur);
        g.drawOval(332,40,kleinebreedte,kleinehoogte);
        g.drawString("Taartpunt met ovaal eromheen",320,130);
        g.setColor(Opvulkleur);
        g.fillArc(332,40,kleinebreedte,kleinehoogte,0,45);

        //Cirkel
        g.setColor(Lijnkleur);
        g.drawArc(353,138,80,80,360,360);
        g.drawString("Cirkel",379,230);
    }

}
