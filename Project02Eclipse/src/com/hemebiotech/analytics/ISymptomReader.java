package com.hemebiotech.analytics;


import java.util.Map;


/**
 * Anything that will read symptom data from a source
 * The important part is, the return value from the operation, which is a list of strings,
 * that may contain many duplications
 * 
 * The implementation does not need to order the list
 * 
 */
public interface ISymptomReader { // création d'une interface 
	/**
	 * If no data is available, return an empty List
	 * 
	 * @return a raw listing of all Symptoms obtained from a data source, duplicates are possible/probable
	 */
	//Interface Map qui permet de definir le prototype de la méthode getsymptom();
	//chaque symptomes (String) est une clé invariable et son nombre d'occurence comme une variable
	public  Map<String,Symptom> getSymptoms(); 
	
}
