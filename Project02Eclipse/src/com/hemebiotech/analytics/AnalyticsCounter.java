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
		// on appelle la méthode getsymptom() pour récuperer le resultat de la lecture du fichier  et on le met dans la variable result.
		 
		instanceWriterSymptom.writeSymptom(result); 
		// on appelle la méthode writersymptom pour écrire le résultat dans le fichier result.out
	}
}

