package com.hemebiotech.analytics;


import java.util.Map;

public class AnalyticsCounter { 
	
	public static void main(String args[]){

		ReadSymptomDataFromFile instanceReadSymptom=new ReadSymptomDataFromFile("symptoms.txt");
		WriterSymptom instanceWriterSymptom= new WriterSymptom(); // declare une instance 
		// 
		Map<String,Symptom> result = instanceReadSymptom.getSymptoms(); // donne kle result 
		 
		instanceWriterSymptom.writeSymptom(result); 
	}
}

