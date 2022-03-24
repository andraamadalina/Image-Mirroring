//Clasa pentru inregistrarea timpului alocat pentru fiecare operatie
//Clasa abstracta
package abstracte;

public abstract class timp implements interfata{
	
	long startTime;
	long duration;
	long endTime;
	
	//Citire timp de pornire
	public void start() { 
		startTime = System.nanoTime();	
	}
	
	//Citire timp de oprire
	public void stop() { 
		endTime = System.nanoTime();	
	}
	
	//Returnare timp necesar pentru fiecare operatie
	public float getTime() { 
		duration = (endTime - startTime)/1000000;
		return ((float)duration)/1000;
	}
}