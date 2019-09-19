import java.applet.Applet;
import java.awt.*;

public class PraktijkOpdracht extends Applet {

    public void init(){

        setSize(800,800);

    }

    public void paint(Graphics g){

        g.drawLine(300,80,100,80);
        g.drawString("lijn",150,95);

        g.drawRect(100, 100, 200, 100);
        g.drawString("Rechthoek",150,215);

        g.drawRoundRect(100, 225, 200, 100, 30, 30);
        g.drawString("ronde rechthoek",150,350);

        g.setColor(Color.magenta);
        g.fillRect(315, 100, 200, 100);
        g.setColor(Color.black);
        g.drawString("Gevulde rechthoek met ovaal",320,215);

        g.setColor(Color.black);
        g.drawOval(315, 100, 200, 100);
        g.drawString("Gevulde ovaal",360,350);

        g.setColor(Color.magenta);
        g.fillOval(315, 225, 200, 100);

    }
}

