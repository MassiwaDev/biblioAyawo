package metier.entites;

import java.util.Date;

public class Adherent extends Utilisateur {

	private String telephone;
	private static int nbMaxPret = 3;
	private static int dureeMaxPret = 15;
	
	
	public Adherent(String nom, String prenom, Date dateNaissance, String sexe, int idUtilisateur, String pwd, String pseudonyme) {
		super(nom, prenom, dateNaissance, sexe, idUtilisateur, pwd, pseudonyme);
		
	}

	public Adherent(String nom, String prenom, Date dateNaissance, String sexe, int idUtilisateur, String pwd, String pseudonyme,
			String telephone) {
		super(nom, prenom, dateNaissance, sexe, idUtilisateur, pwd, pseudonyme);
		this.telephone = telephone;
	}

	public boolean isConditionsPretAcceptees(){
		
		// A developper
		return true;
	}
	
	public int getNbRetards(){
		// A developper
		return 0;
	}
	

	
}

