package main;

import java.awt.Color;
import java.awt.Font;

import bandeau.Bandeau;

public abstract class Effet {

	private String nom;
	protected static Bandeau bandeau;
	Font font;
    Color back;
    Color fore;
	
	public Effet(String nom, Bandeau bandeau) {
		this.setNom(nom);
		this.bandeau = bandeau;
		this.font = bandeau.getFont();
		this.back = bandeau.getBackground();
		this.fore = bandeau.getForeground();
	}
	
	public Font getFont() {
		return font;
	}

	public Color getBack() {
		return back;
	}

	public Color getFore() {
		return fore;
	}

	public void setFont(Font font) {
		this.font = font;
	}

	public void setBack(Color back) {
		this.back = back;
	}

	public void setFore(Color fore) {
		this.fore = fore;
	}

	public abstract void realiser() throws Exception;

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
}
