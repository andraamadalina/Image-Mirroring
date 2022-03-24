//Clasa pentru citirea si scrierea imaginii in fisier
package concrete;

import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.IOException;
import java.io.File;
import abstracte.timp;


public class imagine extends timp{
	
	//Citire imagine
	public BufferedImage read(File fin) throws IOException{ 
		
		start();
		BufferedImage image = null;
		
		//Afisarea unei erori in cazul in care citirea fisierului de intrare nu poate fi relizata
		try{
			
			image = ImageIO.read(fin); //citirea din fisierul de intrare
			
			System.out.println("Reading complete."); //Citita cu succes
			}
		
		catch(IOException e){
			
			System.out.println("Error: "+e);
			}
		
		stop();
		
		return image;
	}
	
	//Scriere imagine
	public void write(File fout,BufferedImage image) throws IOException{ 
		
		start();
		
		//Afisarea unei erori in cazul in care scrierea fisierului de iesire nu poate fi relizata
		try{
			ImageIO.write(image, "bmp",fout ); //scrierea in fisierul de iesire
			System.out.println("Writing complete."); //Scrisa cu succes
			}
		
		catch(IOException e){
			
			System.out.println("Error: "+e);
			}
		
		stop();
	}
}
