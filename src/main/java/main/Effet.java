package main;

import java.awt.Color;
import java.awt.Font;

import bandeau.Bandeau;

public abstract class Effet {

	private int rep;
	private String texte;
	protected static Bandeau bandeau;
	Font font;
    Color back;
    Color fore;
	
	public Effet(String texte, Bandeau bandeau, int rep) {
		this.texte = texte;
		this.bandeau = bandeau;
		this.rep = rep;
		this.font = bandeau.getFont();
		this.back = bandeau.getBackground();
		this.fore = bandeau.getForeground();
	}
	
	public int getRep() {
		return rep;
	}

	public void setRep(int rep) {
		this.rep = rep;
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

	public String getTexte() {
		return texte;
	}

	public void setNom(String nom) {
		this.texte = nom;
	}
}
