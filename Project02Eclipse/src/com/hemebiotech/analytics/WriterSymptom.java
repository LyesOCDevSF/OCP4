package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.util.Map;

public class WriterSymptom implements SymptomWriterInterface  {
	
	@Override
	public void writeSymptom( Map<String,Symptom> result) {
		// TODO Auto-generated method stub	
		try {  
			     FileWriter writer = new FileWriter ("result1.out");
			     
				 for (String symptom :result.keySet()) {	 
				 writer.write(symptom +" : " + result.get(symptom).getOccurence() + "\n");
				 }
				 
				 writer.close();
				 System.out.println("end : "+result.size()+" Symptom(s) are added in the file resut.out");
		}
		catch(Exception e ){ // capture de l'erreur si exception
			
			e.getStackTrace();// affiche l'erreur
		}
	}
}