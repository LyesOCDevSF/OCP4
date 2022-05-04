package com.hemebiotech.analytics;

/**
 * @author 33698
 *
 */
public class Symptom { // cette classe repr�sente un symptome 
   protected String nom; // accessible a cette classe et les classe filles 
   protected int occurence;
   public Symptom(String nom, int occurence) { // constructeur pour instancier un symptome.
	   this.nom= nom;
	   this.occurence= occurence;
   }
   /**
 * @return
 */
public String getNom() { // renvoie le nom du symptome
	   return this.nom;   
   }
   /**
 * @return
 */
public int getOccurence() {
	   return this.occurence;
   }
   /**
 * @param nom
 */
public void setNom(String nom) { // change le nom si nouveau nom
	   this.nom = nom;  
   }
   public void setOccurence(int occurence) { // on change l'occurence
	   this.occurence = occurence;  
   }
   /**
 * 
 */
public void incrementOccurence() { // on incremente l'occurence de 1 a chaque fois que le m�me symptom est compt�
	 //  this.occurence = this.occurence+1;
	   //this.occurence+=1;
	   this.occurence++;
	   
	   
   }
}
