package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
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
	
	/**
	 *
	 */
	/**
	 *
	 */
	/**
	 *
	 */
	@Override // surcharge de la classe dans l'interface qui a été implémentée  
	 public  Map<String,Symptom> countSymptoms(List<String> result) {
		 Map<String,Symptom> resultMap =  new TreeMap<>(); //ranger par order alphebetique 

	              for (String symptom : result) { // tant que que la variable n'est pas Null
					// lors de la lecture du fichier symptom si le symptome est connu on l'incremente de 1
					if(resultMap.containsKey(symptom)){
						resultMap.get(symptom).incrementOccurence();
					}else{
						resultMap.put(symptom, new Symptom(symptom,1)); // on insere le nouveau symptom  
					}
					 // on lit la ligne suivante 
				}
		return resultMap; // retourne le result
	}
	
	/**
	 *
	 */
	@Override
	public List<String> getSymptoms() {
		ArrayList<String> result = new ArrayList<String>(); //on liste les symptomes à la lecture du fichier symptoms
		
		if (filepath != null) {
			try {
				BufferedReader reader = new BufferedReader (new FileReader(filepath));
				String line = reader.readLine();
				
				while (line != null) {
					result.add(line);
					line = reader.readLine();
				}
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return result;
	}

}

