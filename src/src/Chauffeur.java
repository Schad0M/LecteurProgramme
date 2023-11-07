package src;

import java.util.ArrayList;

public class Chauffeur {
	String nom, prenom;
	int nombreVoyage;
	ArrayList<Transport> listeVoyage;
	
	
	public String afficherTransportsSansDetail() {
		String t = "";
		for(Transport a: listeVoyage) {
			t += a.toString() + " \n";
		}
		return t;
	}
	
	public String afficherTransportsAvecDetail() {
		String t = "";
		for(Transport a: listeVoyage) {
			t += a.toString() + " \n";
			t += a.getStingListeEmployes();
		}
		return nom;
		
	}
}
