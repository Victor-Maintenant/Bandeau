package main;

import java.util.*;
import bandeau.Bandeau;

public class Pendu extends Effet {

	public Pendu(String nom, Bandeau bandeau) {
		super(nom, bandeau);
	}

	@Override
	public void realiser() throws Exception {
		Random rand = new Random();
		List<Integer> nombresAleatoires = new LinkedList<>();
		String mes = this.getNom();
		String message = "";
		for(int i = 0;i < mes.length(); i++) {
			message += "_";
		}
		int n = mes.length();
		
		while(n >= 0) {
			StringBuffer sb = new StringBuffer(message);
			this.bandeau.setMessage(message);
			int k = rand.nextInt(mes.length());
			if (!nombresAleatoires.contains(k)) {
		         nombresAleatoires.add(k);
		         n -= 1;
		         sb.setCharAt(k, mes.charAt(k));
		         message = sb.toString();
		         this.bandeau.sleep(500);
		     }
			
		}
	}

}
