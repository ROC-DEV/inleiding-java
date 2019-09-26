package h13;

import java.applet.*;
import java.awt.*;

public class PraktijkOpdracht2 extends Applet {

    public void init() {
        setSize(800,700);
    }

    public void paint(Graphics g) {
        tekenBoom(g,2,5);
    }

    void tekenBoom(Graphics g, int rijen, int bomen) {
        int hoogtestammen, breedtestammen;
        int hoogtebladeren, breedtebladeren;
        int teller = 0;
        int yblad;
        int x,y;
        y = 100;
        yblad = 50;
        hoogtebladeren = 100;
        hoogtestammen = 100;
        breedtestammen = 25;

        Color bruin = new Color(0x744915);
        Color groen = new Color(0x1E600C);
        while (teller < rijen) {
            x = 50;
            breedtebladeren = 100;

            for (int i=0; i < bomen; i++) {
                g.setColor(bruin);
                g.fillRect(x,y,breedtestammen,hoogtestammen);
                g.setColor(groen);
                g.fillOval(x-35,yblad,breedtebladeren,hoogtebladeren);
                x+=hoogtestammen;
            }

            y+=150;
            yblad+=150;
            teller++;
        }

    }
}