/*
1. Een event doet bij dit voorbeeld een methode aan een knop vastmaken:
import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class Knop extends Applet {
    Button knop;
    String schermtekst;

    public void init() {
        schermtekst = "Doet deze knop wel iets?"
        knop = new Button("Klik op mij");
        KnopListener kl = new KnopListener();
        knop.addActionListener( kl );
        add(knop);
    }

    public void paint(Graphics g) {
        g.drawString(schermtekst, 50, 60 );
    }

    class KnopListener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            schermtekst = "Ja, deze knop doet wel iets";
        }
    }
}

2. Een gebruikersinterface is hetgene wat de gebruiker kan doen als hij de applet heeft opgestart zonder aan de code te zitten.
De interface voor de gebruiker is wel all in de code gemaakt.

3. Omdat een tekst er all gewoon staat en er geen interactie mee is maar met een knop waar je op kan drukken wel.

4. Een lege string is letterlijk een lege string zoals "" en er niks in hebben maar dat zorgt ervoor dat je
 bijvoorbeeld een tekstveld kan maken.

5. Het tekstvak geeft aan waar de plaats is van de hitbox bijvoorbeeld van de knop en waar de tekst komt de label is de tekst zelf.

6.  Anders kan je geen gebruik maken van de getallen in de code omdat het dan gewoon een string is inplaatsvan een cijfer.
 */
package h08;

public class Vragen {
}
