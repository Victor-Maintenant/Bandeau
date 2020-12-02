package main;

import bandeau.Bandeau;

public class Rotation extends Effet {

	public Rotation(String nom, Bandeau bandeau) {
		super(nom, bandeau);
	}

	@Override
	public void realiser() {
		bandeau.setMessage("On tourne...");
	for (int i = 0; i <= 100; i++) {
		bandeau.setRotation(2*Math.PI*i / 100);
		bandeau.sleep(100);
	}

	}

}
