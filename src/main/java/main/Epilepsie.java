package main;

import java.awt.Color;
import java.util.*;
import bandeau.Bandeau;

public class Epilepsie extends Effet {

	private int nbClignotement;
	private List<Color> couleurs = new LinkedList<>();

	
	public Epilepsie(String texte, Bandeau bandeau, int nb) {
		super(texte, bandeau);
		this.nbClignotement = nb;
	}

	public void ajoutCouleur(Color c) {
		this.couleurs.add(c);	
	}
	
	@Override
	public void realiser() throws Exception {
		if(this.couleurs.isEmpty()) throw new Exception("Aucune couleur enregistrée !");
		this.bandeau.setMessage(this.getNom());
		int i = 0;
		while ( i <= this.nbClignotement) {
			for (Color c : this.couleurs) {
				this.bandeau.setBackground(c);
				for(int j = 0;j < 2;j++) {
					this.bandeau.setForeground(this.fore);
					this.bandeau.sleep(50);
					this.bandeau.setForeground(this.back);
					this.bandeau.sleep(50);
				}
			}
		}
		this.bandeau.setBackground(this.back);
		this.bandeau.setForeground(this.fore);
	}

}
