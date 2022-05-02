package com.hemebiotech.analytics;

import java.util.Map;

public interface SymptomWriterInterface { // on déclare l'interface SWI 
	
	public void writeSymptom( Map<String,Symptom> result); 
	// prototupe de la  méthode writesymptom qui nous permet d'écrire le résultat de la méthode getsymptom() dans le fichier result.out

}
