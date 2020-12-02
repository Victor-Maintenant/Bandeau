package main;

import java.awt.Color;
import java.awt.Font;

import bandeau.Bandeau;

public class Main {

	public static void main(String[] args) throws Exception {
		Bandeau monBandeau = new Bandeau();
        Font font = monBandeau.getFont();
        Color back = monBandeau.getBackground();
        Color fore = monBandeau.getForeground();
        Scenario s1 = new Scenario(1);
        Zoom zoom = new Zoom("zoom", monBandeau);
        Rotation rota = new Rotation("Anti - Horraire", monBandeau);
        Fond fond = new Fond("Fond", monBandeau);
        
        fond.ajoutCouleur(Color.BLUE);
        fond.ajoutCouleur(Color.PINK);
        fond.ajoutCouleur(Color.ORANGE);

        s1.ajoutEffet(fond);
        s1.ajoutEffet(rota);
        s1.ajoutEffet(zoom);
        s1.demarrer();
        

	}

}
