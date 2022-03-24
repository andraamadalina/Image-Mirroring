//Clasa pentru editarea matricei corespunzatoare imaginii
package concrete;

import java.awt.image.BufferedImage;
import abstracte.timp;

public class matrice extends timp{

	BufferedImage image = null;
	int[][]  mat;
	int height;
	int width;	
	
	//Constructor ce genereaza marticea RGBA a imaginii
	public matrice(BufferedImage img) {
		
		start();
		image = img;
		width = image.getWidth(); //obtinerea dimensiunii imaginii sursa
	    height = image.getHeight(); //obtinerea dimensiunii imaginii sursa
	    mat = new int[width][height];
	    
	    //Citirea valorilor RGB ale imaginii si salvarea acestora
	    for(int i=0; i<width; i++)
	    	for(int j=0; j<height; j++)
	    		mat[i][j] = image.getRGB(i,j);
	    stop();
	}
	
	//Functie folosita doar pentru testare
	//Afisare matrice obtinuta
	public void show() { 
		
		for(int i=0; i<width; i++) {
	    	for(int j=0; j<height; j++)
	    		System.out.print(mat[i][j]+" ");
	    	System.out.println();
		}			
	}
	
	//Functie de oglindire a imaginii (V = vertical/H = orizontal)
	public void mirror (char pos) {
		
		start();	
		if(pos == 'V') //Pentru situatia oglindirii pe verticala vom crea imaginea oglindita pixel cu pixel
			for(int i=0; i<width; i++)
				for(int j=0; j<height; j++) {
					image.setRGB(i,j, mat[i][height-j-1]); //Introducerea valorilor obtinute in imaginea rezultat pentru oglindirea verticala
				}
		else //Pentru situatia oglindirii pe orizontala vom crea imaginea oglindita pixel cu pixel
			for(int i=0; i<width; i++)
				for(int j=0; j<height; j++) {
					image.setRGB(i,j, mat[width-i-1][j]); //Introducerea valorilor obtinute in imaginea rezultat pentru oglindirea orizontala
				}	
		
		stop();
	}
}

