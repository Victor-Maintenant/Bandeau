package main;

import java.awt.Color;
import java.awt.Font;
import java.util.*;

import bandeau.Bandeau;

public class Main {

	public static void main(String[] args) throws Exception {
		Bandeau monBandeau = new Bandeau();
		
        List<Scenario> scenarios = new LinkedList<>();
        Scenario s1 = new Scenario(1);
        Scenario s2 = new Scenario(2);

        
        Zoom zoom = new Zoom("Zoom", monBandeau, 100, 7);
        Rotation rota = new Rotation("Horraire", monBandeau, 10, true);
        Fond fond = new Fond("Fond", monBandeau);
        Clignoter cli = new Clignoter("Clignotement", monBandeau, 10);
        
        fond.ajoutCouleur(Color.BLUE);
        fond.ajoutCouleur(Color.PINK);
        fond.ajoutCouleur(Color.ORANGE);

        s1.ajoutEffet(fond);
        s1.ajoutEffet(rota);
        s1.ajoutEffet(zoom);
        s2.ajoutEffet(cli);
        
        scenarios.add(s1);
        scenarios.add(s2);
        
        s2.demarrer();
        
       /* for(Scenario s : scenarios) {
        	s.demarrer();
        }*/
        

	}

}
