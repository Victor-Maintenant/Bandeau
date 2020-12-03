package main;

import java.awt.Color;
import java.awt.Font;
import java.util.*;

import bandeau.Bandeau;

public class Main {

	public static void main(String[] args) throws Exception {
		Bandeau monBandeau = new Bandeau();
		
        List<Scenario> scenarios = new LinkedList<>();
        Scenario s1 = new Scenario(2);
        Scenario s2 = new Scenario(1);

        
        Zoom zoom = new Zoom("Zoom", monBandeau, 2, 100, 7);
        ZoomI zoominv = new ZoomI("Zoom inversé", monBandeau, 2, 100, 7);
        Rotation rotaH = new Rotation("Horraire", monBandeau, 1, 10, false);
        Rotation rotaAH = new Rotation("AntiHorraire",  monBandeau, 1, 10, true);
        Fond fond = new Fond("Fond", monBandeau, 1);
        Clignoter cli = new Clignoter("Clignotement", monBandeau, 2, 10);
        Pendu pendu = new Pendu("Le jeu du pendu", monBandeau, 2);
        Epilepsie epi = new Epilepsie("Epilepsie", monBandeau, 1, 1);
        
        fond.ajoutCouleur(Color.BLUE);
        fond.ajoutCouleur(Color.PINK);
        fond.ajoutCouleur(Color.ORANGE);
        epi.ajoutCouleur(Color.BLUE);
        epi.ajoutCouleur(Color.PINK);
        epi.ajoutCouleur(Color.ORANGE);

        s2.ajoutEffet(fond);
        s1.ajoutEffet(rotaH);
        s2.ajoutEffet(rotaAH);
        s1.ajoutEffet(zoom);

        s2.ajoutEffet(pendu);
        s2.ajoutEffet(cli);
        s1.ajoutEffet(zoominv);
        s1.ajoutEffet(epi);
        
        
        scenarios.add(s1);
        scenarios.add(s2);
        
        s2.demarrer();
        
       /*for(Scenario s : scenarios) {
        	s.demarrer();
        }*/
        

	}

}
