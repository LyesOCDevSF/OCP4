package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.util.Map;

public class WriterSymptom {
	public static void writeSymptom( Map<String,Symptom> result) {
		// TODO Auto-generated method stub	
		try {  
			     FileWriter writer = new FileWriter ("result.out");
				 for (String symptom :result.keySet()) {
						writer.write(symptom +" : " + result.get(symptom).getOccurence() + "\n");
				 }
				 writer.close();
				 System.out.println("end : "+result.size()+" Symptom(s) are added in the file resut.out");
		}catch(Exception e ){ // capture de l'esrreur si exception
			e.getStackTrace();// affiche l'erreur
		}
	}
}