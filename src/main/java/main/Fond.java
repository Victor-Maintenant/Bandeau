package main;

import java.awt.Color;
import java.util.*;

import bandeau.Bandeau;

public class Fond extends Effet {
	
	private List<Color> couleurs = new LinkedList<>();
	
	public Fond(String nom, Bandeau bandeau, int rep) {
		super(nom, bandeau, rep);
	}
	
	public void ajoutCouleur(Color c) {
		this.couleurs.add(c);	
	}

	@Override
	public void realiser() throws Exception {
		if(this.couleurs.isEmpty()) throw new Exception("Aucune couleur enregistrée !");
		bandeau.setMessage(this.getTexte());
		int n = 0;
		while (n < this.getRep()) {
			for(Color c : this.couleurs){
				bandeau.setBackground(c);
				bandeau.sleep(500);
			}
			n+=1;
		}
		bandeau.setBackground(this.getBack());
	}

}
