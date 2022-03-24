//Clasa pentru interactiunea cu user
package concrete;

import java.util.Scanner;
import java.io.File;

public class user extends validare {

	Scanner path = new Scanner(System.in); 
	String pathName1 = new String();
	char pos;
	File f;
	
	//Citire cale imagine	
	public File pathIn() { 			
		
		start();
		System.out.println("Introduceti calea: ");
	    pathName1 = path.nextLine(); //fisierul de intrare  
	    
	    //Primire cale de la tastatura pana aceasta este valida
		while(validPath(pathName1) == 1) {
			
			System.out.println("Introduceti calea: "); //Introducerea caii fisierului de intrare
			path = new Scanner(System.in); 
		    pathName1 = path.nextLine();  	
	    }
	     
	    f = new File(pathName1); //deschiderea fisierului de intrare
	    
	    stop();
	    
	    return f;	  
	   
	}
	
	//Realizarea rotatiei in functie de alegerea facuta
	public void setRotation() { 
		
		start();
		System.out.println("Introduceti rotatia(V = vertical/H = orizontal): "); //Alegerea optiunii dorite
	    pos = Character.toUpperCase(path.nextLine().toCharArray()[0]); //Citirea si transformarea comenzii primite in litera mare
	    
	    //Verificarea validitatii comenzii
	    while(validPos(pos) == 1) { 
	    	
	    	System.out.println("Introduceti rotatia (V = vertical/H = orizontal): ");
			path = new Scanner(System.in); 
		    pos = Character.toUpperCase(path.nextLine().toCharArray()[0]);
	    }
	    
	    stop();	    
	}
	
	//Returnare cale imagine
	public char getRotation() { 
		
		return pos;
	}
	
	//Generare cale fisier returnat
	public File pathOut() { 
		
		start();
		File g;
		String pathName2;
		
		//Generare cale salvare fisier
		pathName2 = pathName1.substring(0,pathName1.lastIndexOf('.'))+("_rezultat_")+pos+(".bmp");
	  
	    g = new File(pathName2); //deschiderea fisierului de iesire	
	    stop();
	    
		return g;
	}
}
