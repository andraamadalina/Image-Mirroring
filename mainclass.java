//Clasa pentru main

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import concrete.*;

public class mainclass {

	public static void main(String[] args) throws IOException {
		
		imagine io = new imagine();
		BufferedImage image = null;
		float [] timp = new float[7];	
		user us = new user();
		File fin = null;
		File fout = null;
			
		//Citire cale de intrare fisier 
		fin = us.pathIn();
		timp[0] = us.getTime();
		
		//Citire tip de rotatie (V = vertical/H = orizontal)
		us.setRotation();
		timp[1] = us.getTime();
		
		//Stare cale de iesire fisier
		fout = us.pathOut();
		timp[2] = us.getTime();
		
		//Citire imagine
		image = io.read(fin);
		timp[3] = io.getTime();
		
		//Creare matrice cu valorile RGBA ale imaginii
		matrice mat = new matrice(image);
		timp[4] = mat.getTime();

		//Realizare imagine in oglinda
		mat.mirror(us.getRotation());
		timp[5] = mat.getTime();
		
		//Scriere imagine in fisier
		io.write(fout, image);
		timp[6] = io.getTime();
		
		//Timpii pentru fiecare etapa
		System.out.println("Timpii corespunzatori fiecatui task (s)");
		System.out.println("Timp citire cale IN: "+timp[0]);
		System.out.println("Timp citire rotatie: "+timp[1]);
		System.out.println("Timp generare cale OUT: "+timp[2]);
		System.out.println("Timp citire imagine: "+timp[3]);
		System.out.println("Timp creare matrice: "+timp[4]);
		System.out.println("Timp realizare proces de mirroring: "+timp[5]);
		System.out.println("Timp scriere imagine: "+timp[6]);
		
	}
}

