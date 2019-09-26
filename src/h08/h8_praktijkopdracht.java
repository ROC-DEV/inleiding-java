package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class h8_praktijkopdracht extends Applet {
    Button Plusknop;
    Button Minknop;
    Button Keerknop;
    Button Deelknop;
    Button Resetknop;

    TextField tekstvak1;
    TextField tekstvak2;

    int input;
    int input2;
    int uitkomst;

    public void init(){
        tekstvak1= new TextField("",10);
        add(tekstvak1);
        tekstvak2= new TextField("",10);
        add(tekstvak2);

        Plusknop= new Button("+");
        Plusknop.addActionListener(new PlusknopListener());
        add(Plusknop);


        Minknop= new Button("-");
        Minknop.addActionListener(new MinknopListener());
        add(Minknop);

        Keerknop= new Button("*");
        Keerknop.addActionListener(new KeerknopListener());
        add(Keerknop);

        Deelknop= new Button("/");
        Deelknop.addActionListener(new DeelknopListener());
        add(Deelknop);

        Resetknop= new Button("Reset");
        Resetknop.addActionListener(new ResetknopListener());
        add(Resetknop);

        setSize(400,400);



    }

    public class PlusknopListener implements ActionListener{

        public void actionPerformed(ActionEvent e) {
            String s= tekstvak1.getText();
            input = Integer.parseInt(s);
            input2 = Integer.parseInt(tekstvak2.getText());
            uitkomst = input + input2;
            tekstvak1.setText(""+ uitkomst);
            tekstvak2.setText("");
            repaint();


        }
    }

    public class MinknopListener implements ActionListener{

        public void actionPerformed(ActionEvent e) {
            String s= tekstvak1.getText();
            int input = Integer.parseInt(s);
            int input2 = Integer.parseInt(tekstvak2.getText());
            int uitkomst = input - input2;
            tekstvak1.setText(""+ uitkomst);
            tekstvak2.setText("");
            repaint();
        }
    }

    public class KeerknopListener implements ActionListener{

        public void actionPerformed(ActionEvent e) {
            String s= tekstvak1.getText();
            int input = Integer.parseInt(s);
            int input2 = Integer.parseInt(tekstvak2.getText());
            int uitkomst= input * input2;
            tekstvak1.setText(""+ uitkomst);
            tekstvak2.setText("");
            repaint();


        }
    }

    public class DeelknopListener implements ActionListener{

        public void actionPerformed(ActionEvent e) {
            String s= tekstvak1.getText();
            int input = Integer.parseInt(s);
            int input2 = Integer.parseInt(tekstvak2.getText());
            int uitkomst= input / input2;
            tekstvak1.setText(""+ uitkomst);
            tekstvak2.setText("");
            repaint();

        }
    }

    public class ResetknopListener implements ActionListener{

        public void actionPerformed(ActionEvent e) {
            uitkomst= 0;
            tekstvak1.setText("");
            repaint();

        }
    }


}
