package main;

import java.awt.Color;
import java.util.*;

public class Scenario {
	
	private int nbRep;
	private List<Effet> effets = new LinkedList<>();
	
	public Scenario(int nb) {
		this.nbRep = nb;
	}

	
	public void ajoutEffet(Effet e) {
		this.effets.add(e);	
	}
	
	public void demarrer() throws Exception {
		if(this.effets.isEmpty()) throw new Exception("Pas d'effet enregistré !");
		for(int i = 0; i < this.nbRep;i++){
			for(Effet e : this.effets) {
				e.realiser();
			}
		}	
	}	
}

