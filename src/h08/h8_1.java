package h08;

import javax.swing.*;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class h8_1 extends Applet {
    Button Okknop;
    Button Resetknop;
    TextField tekstvak;



    public void init(){
        tekstvak = new TextField("Dovakhiin ", 20);



        Okknop=new Button("ok");
        Okknop.setLabel("FUS RO DAH");
        Okknop.addActionListener(new OkknopListener() );
        add(tekstvak);
        add(Okknop);


        Resetknop= new Button();
        Resetknop.addActionListener(new ResetknopListener());
        add(tekstvak);
        add(Resetknop);




        setSize(800,400);
    }
    public void paint(Graphics g){
        g.drawString("Klik hier voor scam ", 45,25);




    }

  public class OkknopListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            tekstvak.setText("ayy lit");
            repaint();
        }



  }
  public class ResetknopListener implements ActionListener{

        public void actionPerformed(ActionEvent e) {
            tekstvak.setText("");
        }
  }

}
