package h13;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Muren extends Applet {

    int y1 = 145;
    int y2 = 170;

    int muur = 0;

    Button beton;
    Button baksteen;


    public void init() {

        setSize(800, 600);

        beton = new Button("Beton");
        baksteen = new Button("Baksteen");

        beton.addActionListener(new betonListener());
        baksteen.addActionListener(new baksteenListener());

        add(beton);
        add(baksteen);

    }

    public void paint(Graphics g) {


        if (muur == 1) {
            betonnenMuur(g);
        }
        if (muur == 2) {
            bakstenenMuur(g);
        }

    }

    public void betonnenMuur(Graphics g) {

        g.setColor(Color.gray);
        int i;
        int i2 = 0;

        for (i = 0; i < getWidth() / 50; i++) {

            g.fillRect(-50 + (i * 55), y1, 50, 35);
            g.fillRect(-75 + (i * 55), y2, 50, 35);

            if (i == (getWidth() / 50) - 1 && i2 < 5) {
                y1 = y2 + 40;
                y2 = y2 + 80;
                i = 0;
                i2++;
            }
        }
    }


    public void bakstenenMuur(Graphics g) {

        g.setColor(Color.RED);
        int i;
        int i2 = 0;

        for (i = 0; i < getWidth() / 50; i++) {

            g.fillRect(-50 + (i * 55), y1, 50, 20);
            g.fillRect(-75 + (i * 55), y2, 50, 20);

            if (i == (getWidth() / 50) - 1 && i2 < 8) {
                y1 = y2 + 25;
                y2 = y2 + 50;
                i = 0;
                i2++;
            }
        }
    }

    public class betonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            y1 = 145;
            y2 = 185;
            muur = 1;
            repaint();

        }
    }

    public class baksteenListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            y1 = 145;
            y2 = 170;
            muur = 2;
            repaint();

        }
    }


}