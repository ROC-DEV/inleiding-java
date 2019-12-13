package h12;


import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class h12_6 extends Applet implements ActionListener{

    int[] getallen = {3,3,3,3,3,3,3,3};
    TextField tf;
    int index;
    boolean gevonden;

    public void init(){

        tf = new TextField(10);
        tf.addActionListener(this);
        add(tf);

    }
    public void paint(Graphics g){
        if (gevonden){
            g.drawString("Index komt er " + index + " keer in voor.",80,80);
        }else {
            g.drawString("Index is niet gevonden.",80,80);
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        gevonden = false;
        int input = Integer.parseInt(tf.getText());

        for (int i = 0; i<getallen.length; i++) {
            if (getallen[i] == input) {
                gevonden = true;
                index = i;
            }

        }
        repaint();

    }
}
