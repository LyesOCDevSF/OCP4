package com.hemebiotech.analytics;

public class Symptom {
   protected String nom;
   protected int occurence;
   public Symptom(String nom, int occurence) {
	   this.nom= nom;
	   this.occurence= occurence;
   }
   public String getNom() {
	   return this.nom;   
   }
   public int getOccurence() {
	   return this.occurence;
   }
   public void setNom(String nom) {
	   this.nom = nom;  
   }
   public void setOccurence(int occurence) {
	   this.occurence = occurence;  
   }
   public void incrementOccurence() {
	 //  this.occurence = this.occurence+1;
	   //this.occurence+=1;
	   this.occurence++;
	   
	   
   }
}
