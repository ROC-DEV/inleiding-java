package h04;

import java.awt.*;
import javax.swing.*;

public class Ellips extends JApplet {

    public void init() {
        setBackground(Color.BLUE);
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.YELLOW);
        g.drawArc(150,150,50,50,360,360);
        g.fillArc(150,150,50,50,360,360);

    }

}
