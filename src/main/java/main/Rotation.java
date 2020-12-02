package main;

import bandeau.Bandeau;

public class Rotation extends Effet {
	
	private int vitesse;
	private boolean sens; // true = Sens horraire  & false = Sens Antihorraire
	
	public Rotation(String nom, Bandeau bandeau, int vitesse, boolean sr) {
		super(nom, bandeau);
		this.vitesse = vitesse;
		this.sens = sr;
	}

	@Override
	public void realiser() {
		bandeau.setMessage(this.getNom());
		for (int i = 0; i <= 100; i+= this.vitesse) {
			if(!sens) bandeau.setRotation(2*Math.PI*i / 100);
			else bandeau.setRotation(-2*Math.PI*i / 100);
			bandeau.sleep(100);
		}

	}

}
