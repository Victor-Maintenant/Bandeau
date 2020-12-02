package main;

import java.awt.Color;
import java.util.*;

public class Fond extends Effet {
	
	private List<Color> couleurs = new LinkedList<>();
	
	public Fond(String nom) {
		super(nom, bandeau);
	}
	
	public void ajoutCouleur(Color c) {
		this.couleurs.add(c);	
	}

	@Override
	public void realiser() {
		bandeau.setMessage("On va changer de couleur de fond");
		for(Color c : this.couleurs){
			bandeau.setBackground(c);
			bandeau.sleep(1000);
		}
	}

}
