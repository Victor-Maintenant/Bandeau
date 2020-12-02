package main;

import java.awt.Font;

import bandeau.Bandeau;

public class ZoomI extends Effet {

	private int tailleMax;
	private int vitesse;
	
	public ZoomI(String nom, Bandeau bandeau, int taille, int vitesse) {
		super(nom, bandeau);
		this.tailleMax = taille;
		this.vitesse = vitesse;
	}

	@Override
	public void realiser() {
		bandeau.setMessage(this.getNom());
		Bandeau tampon = super.bandeau;
		
		for (int i = this.tailleMax;i > this.font.getSize();i-=this.vitesse) {
			bandeau.setFont(new Font("Dialog", Font.BOLD, 5+i));
			bandeau.sleep(100);
		}
		bandeau.setFont(this.font);
	}

}