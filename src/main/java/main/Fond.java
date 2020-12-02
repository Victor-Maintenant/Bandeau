package main;

import java.awt.Color;
import java.util.*;

import bandeau.Bandeau;

public class Fond extends Effet {
	
	private List<Color> couleurs = new LinkedList<>();
	
	public Fond(String nom, Bandeau bandeau) {
		super(nom, bandeau);
	}
	
	public void ajoutCouleur(Color c) {
		this.couleurs.add(c);	
	}

	@Override
	public void realiser() throws Exception {
		if(this.couleurs.isEmpty()) throw new Exception("Aucune couleur enregistrée !");
		bandeau.setMessage("On change de couleur !");
		for(Color c : this.couleurs){
			bandeau.setBackground(c);
			bandeau.sleep(500);
		}
		bandeau.setBackground(this.back);
	}

}