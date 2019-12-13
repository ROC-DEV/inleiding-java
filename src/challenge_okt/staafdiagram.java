package challenge_okt;

import java.awt.event.*;
import java.applet.Applet;
import java.awt.*;

public class staafdiagram extends Applet {
    Button toonknop;

    Label valerie;
    Label jeroen;
    Label hans;
    int max;

    TextField tekstvak1;
    TextField tekstvak2;
    TextField tekstvak3;

    int getal1;
    int getal2;
    int getal3;

    public void init(){
        setSize(500,500);
        max=360;

        toonknop= new Button("Toon");
        toonknop.addActionListener(new toonknopListener());
        add(toonknop);

        tekstvak1= new TextField("",5);
        tekstvak1.addActionListener(new toonknopListener());

        valerie=new Label("Valerie");
        add(valerie);
        add(tekstvak1);

        tekstvak2=new TextField("",5);
        tekstvak2.addActionListener(new toonknopListener());

        jeroen=new Label("Jeroen");
        add(jeroen);
        add(tekstvak2);

        tekstvak3= new TextField("",5);
        tekstvak3.addActionListener(new toonknopListener());

        hans=new Label("Hans");
        add(hans);
        add(tekstvak3);

    }
    class toonknopListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            Integer.parseInt(String.valueOf(getal1));
            getal1= Integer.parseInt(tekstvak1.getText());

            Integer.parseInt(String.valueOf(getal2));
            getal2= Integer.parseInt(tekstvak2.getText());

            Integer.parseInt(String.valueOf(getal3));
            getal3= Integer.parseInt(tekstvak3.getText());
            repaint();
        }
    }

    public void paint(Graphics g){

        g.drawLine(140, max, 140, 150);
        g.drawLine(340,max,140,max);

        g.drawString("0",110, 370);
        g.drawString("20",110,350);
        g.drawString("40",110,330);
        g.drawString("60",110,310);
        g.drawString("80",110, 290);
        g.drawString("100", 110,270);
        g.drawString("120",110,250);
        g.drawString("140",110,230);
        g.drawString("160",110,210);
        g.drawString("180",110,190);
        g.drawString("200",110,170);


        g.drawString("Valerie",140,375);
        g.drawString("Jeroen",220,375);
        g.drawString("Hans",300,375);

        g.setColor(Color.red);
        g.fillRect(140, 360 - getal1 , 50, getal1);
        g.setColor(Color.ORANGE);
        g.fillRect(220, 360 - getal2 ,50,getal2);
        g.setColor(Color.YELLOW);
        g.fillRect(300,360 - getal3 ,50,getal3);




    }

}
