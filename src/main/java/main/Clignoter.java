package main;

import bandeau.Bandeau;

public class Clignoter extends Effet {

	private int nbClignotement;
	
	public Clignoter(String texte, Bandeau bandeau, int rep, int nb) {
		super(texte, bandeau, rep);
		this.nbClignotement = nb;
	}

	@Override
	public void realiser() throws Exception {
		this.bandeau.setMessage(this.getTexte());
		int n = 0;
		while (n < this.getRep()) {
			for (int i = 0;i < this.nbClignotement;i++) {
				this.bandeau.setForeground(this.fore);
				this.bandeau.sleep(80);
				this.bandeau.setForeground(this.back);
				this.bandeau.sleep(80);
			}
			n += 1;
		}
		this.bandeau.setForeground(this.fore);
	}

}
