package metier.entites;

public class Adherent extends Utilisateur {

	private String telephone;
	private static int nbMaxPret = 3;
	private static int dureeMaxPret = 15;
	
	

	
	public Adherent(int idUtilisateur, String pwd, String pseudonyme) {
		super(idUtilisateur, pwd, pseudonyme);
		
	}

	public Adherent(int idUtilisateur, String pwd, String pseudonyme,
			String telephone) {
		super(idUtilisateur, pwd, pseudonyme);
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
