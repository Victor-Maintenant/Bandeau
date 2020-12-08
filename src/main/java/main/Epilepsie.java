package main;

import java.awt.Color;
import java.util.*;
import bandeau.Bandeau;

public class Epilepsie extends Effet {

	private int nbClignotement;
	private List<Color> couleurs = new LinkedList<>();

	
	public Epilepsie(String texte, Bandeau bandeau,int rep, int nb) {
		super(texte, bandeau, rep);
		this.nbClignotement = nb;
	}

	public void ajoutCouleur(Color c) {
		this.couleurs.add(c);	
	}
	
	@Override
	public void realiser() throws Exception {
		if(this.couleurs.isEmpty()) throw new Exception("Aucune couleur enregistrée !");
		this.bandeau.setMessage(this.getTexte());
		int i = 0;
		int n = 0;
		while (n < this.getRep()) {
			while ( i <= this.nbClignotement) {
				for (Color c : this.couleurs) {
					this.bandeau.setBackground(c);
					for(int j = 0;j < 2;j++) {
						this.bandeau.setForeground(this.getFore());
						this.bandeau.sleep(50);
						this.bandeau.setForeground(this.getBack());
						this.bandeau.sleep(50);
					}
				}
				i++;
			}
			n+=1;
		}
		this.bandeau.setBackground(this.getBack());
		this.bandeau.setForeground(this.getFore());
	}

}
