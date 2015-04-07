package metier.entites;

public class Employe extends Utilisateur {
	
	
	private String codeMatricule;
	private EnumCategorieEmploye categorieEmploye;
	
	
	public Employe(int idUtilisateur, String pwd, String pseudonyme) {
		super(idUtilisateur, pwd, pseudonyme);
		
	}


	public Employe(int idUtilisateur, String pwd, String pseudonyme,
			String codeMatricule, EnumCategorieEmploye categorieEmploye) {
		super(idUtilisateur, pwd, pseudonyme);
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
