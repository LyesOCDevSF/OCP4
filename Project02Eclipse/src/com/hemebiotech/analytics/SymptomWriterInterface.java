package com.hemebiotech.analytics;

import java.util.Map;

public interface SymptomWriterInterface { // on d�clare l'interface SWI 
	
	public void writeSymptom( Map<String,Symptom> result); 
	// prototupe de la  m�thode writesymptom qui nous permet d'�crire le r�sultat de la m�thode getsymptom() dans le fichier result.out

}
