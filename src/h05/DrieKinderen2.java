package h05;

import java.awt.*;
import javax.swing.*;

public class DrieKinderen2 extends JApplet {

    int nummersX;
    int breedtebalken;
    int balkY;

    public void init() {
        setBackground(Color.WHITE);
        nummersX = 30;
        breedtebalken = 20;
        balkY = 210;
    }

    public void paint(Graphics g) {

        CreateChart(g);

        // Valerie
        CreateBar(90,245,"Valerie",40,g,Color.BLUE);

        //Hans
        CreateBar(210,245,"Hans",80,g,Color.ORANGE);

        //Jeroen
        CreateBar(153,245,"Jeroen",100,g,Color.RED);
    }

    private void CreateBar(int x, int y, String name, int weight, Graphics g, Color kleur)
    {
        int yas = 210 - weight;
        g.setColor(kleur);
        g.drawString(name,x,y);
        g.fillRect(x,yas,breedtebalken,weight);
    }

    private void CreateChart(Graphics g) {
        // Chart
        g.setColor(Color.BLACK);
        g.fillRect(0,balkY,400,10);
        g.fillRect(70,0,10,400);

        // Numbers
        g.setColor(Color.BLACK);
        g.drawString("200",nummersX,10);
        g.drawString("180",nummersX,30);
        g.drawString("160",nummersX,50);
        g.drawString("140",nummersX,70);
        g.drawString("120",nummersX,90);
        g.drawString("100",nummersX,110);
        g.drawString("80",nummersX,130);
        g.drawString("60",nummersX,150);
        g.drawString("40",nummersX,170);
        g.drawString("20",nummersX,190);
        g.drawString("0",nummersX,210);
    }
}
