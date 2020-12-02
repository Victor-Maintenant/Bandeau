package main;

import java.awt.Font;

public class Zoom extends Effet {

	public Zoom(String nom) {
		super(nom, bandeau);
	}

	@Override
	public void realiser() {
		for (int i = 5; i < 60 ; i+=5) {
			bandeau.setFont(new Font("Dialog", Font.BOLD, 5+i));
			bandeau.sleep(100);
		}
	}

}
