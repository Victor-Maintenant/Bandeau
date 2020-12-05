package main;

import java.awt.Color;
import java.util.*;

import bandeau.Bandeau;

public class Main {

	public static void main(String[] args) throws Exception {
		Bandeau monBandeau = new Bandeau();
		
        List<Scenario> scenarios = new LinkedList<>();
        Scenario s1 = new Scenario(2);
        Scenario s2 = new Scenario(1);
        
        Zoom zoom = new Zoom("On zoom ...", monBandeau, 2, 100, 7);
        ZoomI zoominv = new ZoomI("On dézoom ...", monBandeau, 2, 100, 7);
        Rotation rotaH = new Rotation("On tourne - sens horraire", monBandeau, 1, 10, false);
        Rotation rotaAH = new Rotation("On tourne - sens antihorraire",  monBandeau, 1, 10, true);
        Fond fond = new Fond("On change de fond", monBandeau, 1);
        Clignoter cli = new Clignoter("Ca clignote !", monBandeau, 2, 10);
        Pendu pendu = new Pendu("Le jeu du pendu !", monBandeau, 2, "*");
        Epilepsie epi = new Epilepsie("Attention épilepsie !!", monBandeau, 1, 1);
        
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
        
       for(Scenario s : scenarios) {
        	s.demarrer();
        }
	}
}
