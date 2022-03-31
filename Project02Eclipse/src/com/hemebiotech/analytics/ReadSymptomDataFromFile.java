package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
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
	public ReadSymptomDataFromFile (String filepath) {
		this.filepath = filepath;
	}
	
	@Override
	 public  Map<String,Symptom> getSymptoms() {
		 Map<String,Symptom> result =  new TreeMap<>(); //ranger par order alphebetique

			
		if (filepath != null) {
			try {
				
				BufferedReader reader = new BufferedReader (new FileReader(filepath));
				
				String symptom = reader.readLine();
				
				
				while (symptom!= null) {
					if(result.containsKey(symptom)){
						result.get(symptom).incrementOccurence();
					}else{
						result.put(symptom, new Symptom(symptom,1));
					}
					symptom = reader.readLine();
				}
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		return result;
	}

}

