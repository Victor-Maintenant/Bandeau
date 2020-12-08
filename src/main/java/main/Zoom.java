package main;

import java.awt.Font;

import bandeau.Bandeau;

public class Zoom extends Effet {
	
	private int tailleMax;
	private int vitesse;
	
	public Zoom(String nom, Bandeau bandeau, int rep, int taille, int vitesse) {
		super(nom, bandeau, rep);
		this.tailleMax = taille;
		this.vitesse = vitesse;
	}

	@Override
	public void realiser() {
		bandeau.setMessage(this.getTexte());
		int n = 0;
		while (n < this.getRep()) {
			for (int i = 5; i < this.tailleMax ; i+=this.vitesse) {
				bandeau.setFont(new Font("Dialog", Font.BOLD, 5+i));
				bandeau.sleep(100);
			}
			n+=1;
		}
		bandeau.setFont(this.getFont());
	}

}
