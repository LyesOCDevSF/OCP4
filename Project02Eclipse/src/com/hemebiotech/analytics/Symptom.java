package com.hemebiotech.analytics;

public class Symptom { // cette classe représente un symptome 
   protected String nom; // accessible a cette classe et les classe filles 
   protected int occurence;
   public Symptom(String nom, int occurence) { // constructeur pour instancier un symptome.
	   this.nom= nom;
	   this.occurence= occurence;
   }
   public String getNom() { // renvoie le nom du symptome
	   return this.nom;   
   }
   public int getOccurence() {
	   return this.occurence;
   }
   public void setNom(String nom) { // change le nom si nouveau nom
	   this.nom = nom;  
   }
   public void setOccurence(int occurence) { // on change l'occurence
	   this.occurence = occurence;  
   }
   public void incrementOccurence() { // on incremente l'occurence de 1 a chaque fois que le même symptom est compté
	 //  this.occurence = this.occurence+1;
	   //this.occurence+=1;
	   this.occurence++;
	   
	   
   }
}
