package h04;

import java.awt.*;
import javax.swing.*;

public class NL_Flag extends JApplet {

    public void init() {
        setBackground(Color.WHITE);
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.ORANGE);
        g.drawRect(50,50,15,70);
        g.fillRect(50,50,15,70);

        g.setColor(Color.RED);
        g.drawRect(65,50,40,10);
        g.fillRect(65,50,40,10);

        g.setColor(Color.WHITE);
        g.drawRect(65,60,40,10);
        g.fillRect(65,60,40,10);

        g.setColor(Color.BLUE);
        g.drawRect(65,70,40,10);
        g.fillRect(65,70,40,10);
    }

}
