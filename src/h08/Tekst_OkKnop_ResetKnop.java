package h08;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Tekst_OkKnop_ResetKnop extends Applet {
    TextField tekstvak;
    Label label;
    Button okbutton;
    Button resetbutton;
    Double getal;
    String tekst;
    private boolean showText = false;

    public void init() {
        tekstvak = new TextField("", 20);
        label = new Label("Type");
        okbutton = new Button("Ok");
        resetbutton = new Button("Reset");
        tekstvak.addActionListener(new TekstvakListener());

        add(label);
        add(tekstvak);
        add(okbutton);
        add(resetbutton);
    }

    public void paint(Graphics g) {
        g.drawString("Dit heb je getypt" + tekst, 50, 60);
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            getal = Double.parseDouble(s);
            //Je kan deze regels ook samenvoegen
            //getal = Double.parseDouble(tekstvak.getText());
            repaint();
        }
    }

    public void draw(Graphics g) {
        if (showText) {
            g.drawString("Hello", 0, 0);
        }

    }

    public void actionPerformed(ActionEvent event) {
        Object source = event.getSource();

        if (source == okbutton) {
            showText = true;
        }
    }
}