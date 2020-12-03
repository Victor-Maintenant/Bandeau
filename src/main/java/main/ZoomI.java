package main;

import java.awt.Font;

import bandeau.Bandeau;

public class ZoomI extends Effet {

	private int tailleMax;
	private int vitesse;
	
	public ZoomI(String nom, Bandeau bandeau, int rep, int taille, int vitesse) {
		super(nom, bandeau, rep);
		this.tailleMax = taille;
		this.vitesse = vitesse;
	}

	@Override
	public void realiser() {
		bandeau.setMessage(this.getTexte());
		Bandeau tampon = super.bandeau;
		int n = 0;
		while (n < this.getRep()) {
			for (int i = this.tailleMax;i > this.font.getSize();i-=this.vitesse) {
				bandeau.setFont(new Font("Dialog", Font.BOLD, 5+i));
				bandeau.sleep(100);
			}
			n+=1;
		}
		bandeau.setFont(this.font);
	}

}