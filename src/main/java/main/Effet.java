package main;

import bandeau.Bandeau;

public abstract class Effet {

	private String nom;
	protected static Bandeau bandeau;
	
	public Effet(String nom, Bandeau bandeau) {
		this.nom = nom;
		this.bandeau = bandeau;
	}
	
	public abstract void realiser() throws Exception;
}
