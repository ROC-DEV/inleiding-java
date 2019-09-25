package h13;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Muren extends Applet {
    Label hoogteMuurLabel;
    Label breedteMuurLabel;
    TextField hoogteMuurTextfield;
    TextField breedteMuurTextField;
    Button bakstenen;
    Button beton;
    boolean betonnenmuur, bakstenenmuur;
    int hoogteMuur;
    int breedteMuur;

    public void init() {
        setSize(800,500);

        betonnenmuur = false;
        bakstenenmuur = false;

        hoogteMuurLabel = new Label("Hoogte Muur:");
        breedteMuurLabel = new Label("Breedte Muur:");
        hoogteMuurTextfield = new TextField(10);
        breedteMuurTextField = new TextField(10);
        bakstenen = new Button("Baksteen");
        beton = new Button("Beton");

        bakstenen.addActionListener(new BakstenenKnop());
        beton.addActionListener(new betonnenknop());

        add(hoogteMuurLabel);
        add(hoogteMuurTextfield);
        add(breedteMuurLabel);
        add(breedteMuurTextField);
        add(bakstenen);
        add(beton);
    }

    public void paint(Graphics g) {
        if (bakstenenmuur) {
            tekenBaksteenMuur(g,hoogteMuur,breedteMuur);
        }
        if (betonnenmuur) {
            tekenBetonMuur(g,hoogteMuur,breedteMuur);
        }
    }

    class BakstenenKnop implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s1 = hoogteMuurTextfield.getText();
            hoogteMuur = Integer.parseInt(s1);
            String s2 = breedteMuurTextField.getText();
            breedteMuur = Integer.parseInt(s2);
            bakstenenmuur = true;
            betonnenmuur = false;
            repaint();
        }
    }

    class betonnenknop implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s1 = hoogteMuurTextfield.getText();
            hoogteMuur = Integer.parseInt(s1);
            String s2 = breedteMuurTextField.getText();
            breedteMuur = Integer.parseInt(s2);
            betonnenmuur = true;
            bakstenenmuur = false;
            repaint();
        }
    }

    void tekenBaksteenMuur(Graphics g, int hoogteMuur, int breedteMuur) {
        int teller=0;
        int x, y=40, breedte=50, hoogte=25, breedteEind=25;
        int beginX;
        Color zwart=Color.BLACK;
        Color rood=Color.RED;

        while (teller < hoogteMuur) {
            x=50;
            beginX = breedte + breedteEind;

            if (teller % 2 == 0) {
                for (int i=0; i < breedteMuur; i++) {
                    if (i == 0 || i == breedteMuur-1) {
                        g.setColor(zwart);
                        g.drawRect(beginX,y,breedteEind,hoogte);
                        g.setColor(rood);
                        g.fillRect(beginX+1,y+1,breedteEind-1,hoogte-1);
                        beginX = breedte* breedteMuur;
                    } else {
                        g.setColor(zwart);
                        g.drawRect(x,y,breedte,hoogte);
                        g.setColor(rood);
                        g.fillRect(x+1,y+1,breedte-1,hoogte-1);
                    }
                    x+=breedte;
                }
            } else {
                x= breedte +breedteEind;
                for (int i = 0; i < breedteMuur-1; i++) {
                    g.setColor(zwart);
                    g.drawRect(x,y,breedte,hoogte);
                    g.setColor(rood);
                    g.fillRect(x+1,y+1,breedte-1,hoogte-1);
                    x += breedte;
                }
            }
            teller++;
            y+=hoogte;
        }
    }
    //BetonMuur
    void tekenBetonMuur(Graphics g, int hoogteMuur, int breedteMuur) {
        int teller=0;
        int x, y=40, breedte=60,hoogte=35, breedteEind=30;
        int beginX;
        Color zwart=Color.BLACK;
        Color grijs=Color.DARK_GRAY;

        while (teller < hoogteMuur) {
            x=breedte;
            beginX = breedte + breedteEind;

            if (teller % 2 == 0) {
                for (int i=0; i < breedteMuur; i++) {
                    if (i == 0 || i == breedteMuur-1) {
                        g.setColor(zwart);
                        g.drawRect(beginX,y,breedteEind,hoogte);
                        g.setColor(grijs);
                        g.fillRect(beginX+1,y+1,breedteEind-1,hoogte-1);
                        beginX = breedte * breedteMuur;
                    } else {
                        g.setColor(zwart);
                        g.drawRect(x,y,breedte,hoogte);
                        g.setColor(grijs);
                        g.fillRect(x+1,y+1,breedte-1,hoogte-1);
                    }
                    x+=breedte;
                }
            } else {
                x= breedte + breedteEind;
                for (int i = 0; i < breedteMuur-1; i++) {
                    g.setColor(zwart);
                    g.drawRect(x,y,breedte,hoogte);
                    g.setColor(grijs);
                    g.fillRect(x+1,y+1,breedte-1,hoogte-1);
                    x += breedte;
                }
            }
            teller++;
            y+=hoogte;
        }
    }
}