package com.hemebiotech.analytics;


import java.util.Map;

public class AnalyticsCounter { // compter 
	
	/**
	 * @param args
	 */
	
	public static void main(String args[]){

		// on instancie la classe ReadSymptomDataFromFile
		ReadSymptomDataFromFile instanceReadSymptom=new ReadSymptomDataFromFile("symptoms.txt"); // lit les symptoms sur le fichier texte "symptoms.txt"
		
		// on instancie la classe WriterSymptom
		WriterSymptom instanceWriterSymptom= new WriterSymptom(); 
		// 
		Map<String,Symptom> result = instanceReadSymptom.getSymptoms(); 
		// on appelle la m�thode getsymptom() pour r�cuperer le resultat de la lecture du fichier  et on le met dans la variable result.
		 
		instanceWriterSymptom.writeSymptom(result); 
		// on appelle la m�thode writersymptom pour �crire le r�sultat dans le fichier result.out
	}
}

