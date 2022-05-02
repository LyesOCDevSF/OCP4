package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.util.Map;

public class WriterSymptom implements SymptomWriterInterface  {// la class implémente l'interface ce qui lui permet d'utliser sa méthode 
	
	@Override // surcharge de la classe 
	public void writeSymptom( Map<String,Symptom> result) {
		// TODO Auto-generated method stub	
		try {  //try catch pour capturer les exeptions s'il y en a 
			//pour chaque nouveau symtom a écrire dans le fichier "result.out"
			     FileWriter writer = new FileWriter ("result.out");
			     
				 for (String symptom :result.keySet()) { // boucle for 
			//écrit pour chaque symptome = symptom : le nombre d'occurence et \n retour à la ligne 		 
				 writer.write(symptom +" : " + result.get(symptom).getOccurence() + "\n");
				 }
				 
				 writer.close(); // on ferme le writer
				 
				 //une fois l'écriture fini, Message : END nbre de lignes (symptomes) ajouté au fichier result.out
				 System.out.println("end : "+result.size()+" Symptom(s) are added in the file resut.out");
		}
		catch(Exception e ){ // capture de l'erreur si exception
			
			e.getStackTrace();// affiche l'erreur
		}
	}
}