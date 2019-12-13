package h10;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.applet.Applet;

public class h10_3 extends Applet {
    int maand;
    Label label;
    TextField tekstvak;
    String s,text;

    public void init(){
        tekstvak= new TextField("",20);
        label= new Label("type het maand in en druk op enter");
        tekstvak.addActionListener(new tekstvakListener());
        text= "";
        add(label);
        add(tekstvak);
        setSize(400,400);
    }

    public void paint(Graphics g){
        g.drawString(text,50,60);

    }

    public class tekstvakListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            maand= Integer.parseInt(s);
            switch (maand){

                case 1:
                text = " januari heeft 31 dagen";
                break;

                case 2:
                text = "februari heeft 28/29 dagen";
                break;

                case 3:
                text = "maart heeft 31 dagen";
                break;

                case 4:
                text = "april heeft 30 dagen";
                break;

                case 5:
                text = "mei heeft 31 dagen";
                break;

                case 6:
                text = "juni heeft 30 dagen";
                break;

                case 7:
                text = "juli heeft 31 dagen";
                break;

                case 8:
                text = "augustus heeft 30 dagen";
                break;

                case 9:
                text = "september heeft 31 dagen";
                break;

                case 10:
                text = "oktober heeft 30 dagen";
                break;

                case 11:
                text = "november heeft 31 dagen";
                break;

                case 12:
                    text= "december heeft 30 dagen";
                    break;

                default:
                    text="deze maand bestaat niet";
                break;
            }
            repaint();

        }
    }
}
