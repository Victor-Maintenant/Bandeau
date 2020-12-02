package main;

import java.awt.Color;
import java.util.*;

public class Scenario {
	
	private List<Effet> effets = new LinkedList<>();

	
	public void ajoutEffet(Effet e) {
		this.effets.add(e);	
	}
	
	public void demarrer() throws Exception {
		if(this.effets.isEmpty()) throw new Exception("Pas d'effet enregistré !");
		for(Effet e : this.effets) {
			e.realiser();
		}
	}
	
}

