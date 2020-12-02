package main;

import bandeau.Bandeau;

public class Clignoter extends Effet {

	private int nbClignotement;
	
	public Clignoter(String nom, Bandeau bandeau, int nb) {
		super(nom, bandeau);
		this.nbClignotement = nb;
	}

	@Override
	public void realiser() throws Exception {
		this.bandeau.setMessage("On clignote");
		for (int i = 0;i < this.nbClignotement;i++) {
			this.bandeau.setForeground(this.fore);
			this.bandeau.sleep(80);
			this.bandeau.setForeground(this.back);
			this.bandeau.sleep(80);
		}
		this.bandeau.setForeground(this.fore);
	}

}
