package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
/*import java.util.ArrayList;
import java.util.List;*/
import java.util.Map;
import java.util.TreeMap;

/**
 * Simple brute force implementation
 *
 */
public class ReadSymptomDataFromFile implements ISymptomReader { 

	private String filepath;
	
	/**
	 * 
	 * @param filepath a full or partial path to file with symptom strings in it, one per line
	 */
	public ReadSymptomDataFromFile (String filepath) { // builder contruit une instance de la classe ReadSymptomDataFromFile
		this.filepath = filepath;
	}
	
	@Override // surcharge de la classe dans l'interface qui a été implémentée  
	 public  Map<String,Symptom> getSymptoms() {
		 Map<String,Symptom> result =  new TreeMap<>(); //ranger par order alphebetique 

			
		if (filepath != null) {
			try {
				
				BufferedReader reader = new BufferedReader (new FileReader(filepath));// instancie la classe Buffereader qui nous permet le lire fichier symptom.txt
				
				String symptom = reader.readLine(); // on lit la premiere ligne.
				
				
				while (symptom!= null) { // tant que que la variable n'est pas Null
					// lors de la lecture du fichier symptom si le symptome est connu on l'incremente de 1
					if(result.containsKey(symptom)){
						result.get(symptom).incrementOccurence();
					}else{
						result.put(symptom, new Symptom(symptom,1)); // on insere le nouveau symptom  
					}
					symptom = reader.readLine(); // on lit la ligne suivante 
				}
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		return result; // retourne le result
	}

}

