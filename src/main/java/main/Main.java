package main;

import java.awt.Color;
import java.awt.Font;
import java.util.*;

import bandeau.Bandeau;

public class Main {

	public static void main(String[] args) throws Exception {
		Bandeau monBandeau = new Bandeau();
		
        List<Scenario> scenarios = new LinkedList<>();
        Scenario s1 = new Scenario();
        Scenario s2 = new Scenario();

        
        Zoom zoom = new Zoom("Zoom", monBandeau, 100, 7);
        ZoomI zoominv = new ZoomI("Zoom inversé", monBandeau, 100, 7);
        Rotation rotaH = new Rotation("Horraire", monBandeau, 10, true);
        Rotation rotaAH = new Rotation("AntiHorraire", monBandeau, 10, false);
        Fond fond = new Fond("Fond", monBandeau);
        Clignoter cli = new Clignoter("Clignotement", monBandeau, 10);
        Pendu pendu = new Pendu("Pendu", monBandeau);
        Epilepsie epi = new Epilepsie("Epilepsie", monBandeau, 2);
        
        fond.ajoutCouleur(Color.BLUE);
        fond.ajoutCouleur(Color.PINK);
        fond.ajoutCouleur(Color.ORANGE);
        epi.ajoutCouleur(Color.BLUE);
        epi.ajoutCouleur(Color.PINK);
        epi.ajoutCouleur(Color.ORANGE);

        s1.ajoutEffet(fond);
        s1.ajoutEffet(rotaH);
        s1.ajoutEffet(rotaAH);
        s1.ajoutEffet(zoom);
        s1.ajoutEffet(cli);
        s2.ajoutEffet(pendu);
        s1.ajoutEffet(zoominv);
        s1.ajoutEffet(epi);
        
        
        scenarios.add(s1);
        scenarios.add(s2);
        
        s2.demarrer();
        
       /* for(Scenario s : scenarios) {
        	s.demarrer();
        }*/
        

	}

}
