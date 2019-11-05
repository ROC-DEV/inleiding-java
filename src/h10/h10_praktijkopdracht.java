package h10;

import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;

public class h10_praktijkopdracht extends Applet {
    int cijfer;
    TextField tekstvak;
    String resultaat;
    boolean teHoog;

    public void init(){
        cijfer= 0;

        tekstvak= new TextField("",20);
        tekstvak.addActionListener(new tekstvakListener());
        add(tekstvak);

        setSize(400,400);
    }

    public void paint(Graphics g){
        if (teHoog=true){
            g.drawString(resultaat + "" ,50,60);
        }

    }


    public class tekstvakListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            cijfer=Integer.parseInt(tekstvak.getText());
            teHoog=false;
            if (cijfer<3){
                resultaat= "slecht";
            } else {
                resultaat= "onvoldoende";
            }
            if (cijfer>4){
                resultaat= "matig";
            }
            if (cijfer>5){
                resultaat= "voldoende";
            }
            if (cijfer>7){
                resultaat="goed";
            }
            if
            (cijfer>10){
                teHoog= true;
                resultaat= "te hoog";
            }
            repaint();



        }
    }

}
