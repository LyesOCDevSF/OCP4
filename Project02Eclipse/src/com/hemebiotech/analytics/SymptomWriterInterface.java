package com.hemebiotech.analytics;

import java.util.Map;

/**
 * @author 33698
 *
 */

 
public interface SymptomWriterInterface { // on d�clare l'interface SWI 
	
	/**
	 * @param result
	 */
	public void writeSymptom( Map<String,Symptom> result); 
	// prototupe de la  m�thode writesymptom qui nous permet d'�crire le r�sultat de la m�thode getsymptom() dans le fichier result.out

}
