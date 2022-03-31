package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Map;

public class AnalyticsCounter {
	private static int headacheCount = 0;	// initialize to 0
	private static int rashCount = 0;		// initialize to 0
	private static int pupilCount = 0;		// initialize to 0
	private static int test4 = 0;
	public static void main(String args[]) throws Exception {
		// first get input
		/*BufferedReader reader = new BufferedReader (new FileReader("symptoms.txt"));
		String line = reader.readLine();*/

		ReadSymptomDataFromFile instanceReadSymptom=new ReadSymptomDataFromFile("symptoms.txt");
		 Map<String,Symptom> result = instanceReadSymptom.getSymptoms();
		 FileWriter writer = new FileWriter ("result.out");
		 for (String symptom :result.keySet()) {
		       // System.out.println(symptom + " : " + result.get(symptom).getOccurence());//
				writer.write(symptom +" : " + result.get(symptom).getOccurence() + "\n");
		        }
		 writer.close();
		 System.out.println("end : "+result.size()+" Symptom(s) are added in the file resut.out");



		
		// next generate output
		/*FileWriter writer = new FileWriter ("result.out");
		writer.write("headache: " + headacheCount + "\n");
		writer.write("rash: " + rashCount + "\n");
		writer.write("dialated pupils: " + pupilCount + "\n");
		writer.close();*/
	}
}

