package main;

import java.util.*;
import bandeau.Bandeau;

public class Pendu extends Effet {

	private String caractère;
	
	public Pendu(String nom, Bandeau bandeau, int rep, String carac) {
		super(nom, bandeau, rep);
		this.caractère = carac;
	}

	@Override
	public void realiser() throws Exception {
		Random rand = new Random();
		String mes = this.getTexte();
		for(int n = 0;n < this.getRep();n++){
			List<Integer> nombresAleatoires = new LinkedList<>();
			String message = "";
			for(int i = 0;i < mes.length(); i++) {
				message += this.caractère;
			}
			
			this.bandeau.setMessage(message);
			while(!mes.equals(message)) {
				StringBuffer sb = new StringBuffer(message);
				int k = rand.nextInt(mes.length());
				if (!nombresAleatoires.contains(k)) {
			         nombresAleatoires.add(k);
			         sb.setCharAt(k, mes.charAt(k));
			         message = sb.toString();
			         this.bandeau.sleep(500);
			    }
				this.bandeau.setMessage(message);
			}
			this.bandeau.sleep(500);
		}
	}

}
