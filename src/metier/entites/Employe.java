package metier.entites;

import java.util.Date;

public class Employe extends Utilisateur {
	
	
	@Override
	public String toString() {
		return super.toString() + "\nEmploye [codeMatricule=" + codeMatricule
				+ ", categorieEmploye=" + categorieEmploye + "]";
	}


	private String codeMatricule;
	private EnumCategorieEmploye categorieEmploye;
	
	
	public Employe(String nom, String prenom, Date dateNaissance, String sexe, int idUtilisateur, String pwd, String pseudonyme) {
		super(nom, prenom,dateNaissance, sexe, idUtilisateur, pwd, pseudonyme);
		
	}


	public Employe(String nom, String prenom, Date dateNaissance, String sexe, int idUtilisateur, String pwd, String pseudonyme,
			String codeMatricule, EnumCategorieEmploye categorieEmploye) {
		super(nom, prenom,dateNaissance, sexe, idUtilisateur, pwd, pseudonyme);
		this.codeMatricule = codeMatricule;
		this.categorieEmploye = categorieEmploye;
	}


	public String getCodeMatricule() {
		return codeMatricule;
	}


	public EnumCategorieEmploye getCategorieEmploye() {
		return categorieEmploye;
	}


	public void setCodeMatricule(String codeMatricule) {
		this.codeMatricule = codeMatricule;
	}


	public void setCategorieEmploye(EnumCategorieEmploye categorieEmploye) {
		this.categorieEmploye = categorieEmploye;
	}
	
	
	
}
