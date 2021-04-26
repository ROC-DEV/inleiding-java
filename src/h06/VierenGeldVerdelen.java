/*Vragen
1. Waarom is initialiseren van variabelen noodzakelijk?
Een variabele krijgt een waarde als je het intisieert.

2. Waarom is er typecasting noodzakelijk bij de conversie van een double naar een int?
Dat is noodzakelijk omdat de computer wilt het niet doen als je dat niet doet,
omdat hij denkt van er gaat informatie verloren en door het typecasten laat je zien dat je er oke mee bent.

3. Wat is de uitvoer van dit programma? Geef een verklaring.
De uitvoering is de int a, b en c worden aangemaakt. En ook de double uitkomst.
Daarna worden a, b en c een waarde gegeven door het te initiaseren.
Dan word ook de uitkomst een waarde gegeven van (a + b) / c
Wat eerst in die som word gedaan is a + b omdat die haakjes hebben maar zonder die haaksjes zou b en c eerst gaan daar a.
Daarna word het in de public void paint uitgeprint.

4. In de regel uitkomst = (a + b) / c; laat je de ronde haken weg. De regel ziet er dan als volgt uit:
uitkomst = a + b / c;

5. Wat is de uitvoer van dit programma? Geef een verklaring.
De uitvoering is hetzelfde maar nu heeft / een hogere prioriteit dus die word nu eerst uitgerekend. En daarna de ander.

 */
package h06;

import java.awt.*;
import javax.swing.*;

public class VierenGeldVerdelen extends JApplet {

    double AllesVerdiend;
    int naamXas = 30;
    int naamYas;
    String naam = "Jan";

    public void init() {
        AllesVerdiend = 113.0 / 4;
    }

    public void paint(Graphics g) {
        super.paint(g);

        // Jan
        naamYas = 30;
        g.drawString(naam, naamXas, naamYas);
        // Ali
        naamYas = 50;
        naam = "Ali";
        g.drawString(naam,naamXas,naamYas);
        //Jeanette
        naamYas = 70;
        naam = "Jeannette";
        g.drawString(naam,naamXas,naamYas);
        //Mijzelf
        naamYas = 90;
        naam = "Mijzelf";
        g.drawString(naam,naamXas,naamYas);


        g.drawString("" + AllesVerdiend,90,30);
        g.drawString("" + AllesVerdiend, 90, 50);
        g.drawString("" + AllesVerdiend,90,70);
        g.drawString("" + AllesVerdiend,90,90);
    }
}
