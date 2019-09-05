package h04.Licht_2;

import java.awt.*;

public class Stoplicht {

    private Graphics _g;

    ///Constructor
    public Stoplicht(Graphics g)
    {
        _g = g;
    }

    public void Draw(int x, int y)
    {
        int positieOvaalX = x;
        int positieOvaalY = y;

        _g.setColor(Color.BLACK);
        _g.fillOval(positieOvaalX,positieOvaalY,23,50);
        _g.setColor(Color.RED);
        _g.fillArc(positieOvaalX+5,positieOvaalY+2,13,13,360,360);
        _g.setColor(Color.ORANGE);
        _g.fillArc(positieOvaalX+5,positieOvaalY+17,13,13,360,360);
        _g.setColor(Color.GREEN);
        _g.fillArc(positieOvaalX+5,positieOvaalY+32,13,13,360,360);
    }
}
