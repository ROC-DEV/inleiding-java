package h04;

import java.awt.*;
import javax.swing.*;

public class Dobbelsteen_Vier extends JApplet {

    public void init() {
        setBackground(Color.DARK_GRAY);
        this.setSize(400,400);
    }

    public void paint(Graphics g) {
        super.paint(g);

        g.setColor(Color.WHITE);
        g.fillRoundRect(50,50,200,200,90,90);

        g.setColor(Color.BLACK);
        g.fillArc(75,75,50,50,360,360);
        g.fillArc(75,175,50,50,360,360);
        g.fillArc(175,75,50,50,360,360);
        g.fillArc(175,175,50,50,360,360);

    }


}
