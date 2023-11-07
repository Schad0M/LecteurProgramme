package src;

import java.util.ArrayList;

public class Transport {

	int nbrePassagers;
	ArrayList<Employe> listePassagers = new ArrayList<Employe>();
	int heure, minutes;
	
	public void ajouterPassager(Employe a) {
		listePassagers.add(a);
	}
	
	public void retirerPassager(Employe a) {
		listePassagers.remove(a);
	}
	
	public int [] heureDepartSouhaite() {
		//faire un - 2h pour chaque voyages
		//ne pas oublier qu'on change de jours si on fait 1h du matin -2
		return null;	
	}

	public String getStingListeEmployes(){
		String listeNomE = "A faire ";
		//faire un for each avec retour a la ligne pour afficher le nom de tous les emplloyésà
		//creer une tabulation avant decrire le nom***
		return listeNomE;
	}

	@Override
	public String toString() {
		return "Transport [nbrePassagers=" + nbrePassagers + ", heure=" + heure+ " : " + minutes + " ]";
	}
	
	
}
