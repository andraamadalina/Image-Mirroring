//Clasa pentru validarea informatiei date de user
package concrete;

import java.nio.file.InvalidPathException;
import java.nio.file.Paths;
import abstracte.timp;

public class validare extends timp{
	
	//Verificare cale imagine
	public int validPath(String pathName1) { 
		
		int i = 0;
		
		//Semnaleaza erorile aparute in calea trimisa de utilizator
		try {
	        
	    	Paths.get(pathName1);
	    } 
	    catch (InvalidPathException | NullPointerException ex) {
	    
	    	i = 1;
	    }   	
	    
		//Verificare daca calea primita duce catre o poza cu extensia bmp
	    if(pathName1.endsWith(".bmp") == false)
	    	i = 1;
	    
	    if(i == 1) 
	    	System.out.println("Cale gresita!"); //A fost depistata o cale gresita
	    
	    return i;
	}
	
	//Verificare validare caracter corespunzator tipului de oglindire (H = orizontal sau V = vertical)
	public int validPos(char pos) { 
		
		if(pos == 'H' || pos == 'V') //Optiunile disponibile
			
			return 0;
		else {
			
			System.out.println("Optiune nevalida!"); //A fost depistata o optiune nevalida
			
			return 1;
		}
			
	}
}
