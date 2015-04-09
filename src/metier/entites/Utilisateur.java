package metier.entites;

import java.util.ArrayList;
import java.util.Date;

public class Utilisateur extends Personne {
	
	private int idUtilisateur;
	private String pwd;
	private String pseudonyme;
	
	private ArrayList <EmpruntEnCours> empruntEnCours;
	
	
	public Utilisateur(String nom, String prenom, Date dateNaissance, String sexe, int idUtilisateur, String pwd, String pseudonyme) {
		super(nom, prenom, dateNaissance, sexe);
		this.idUtilisateur = idUtilisateur;
		this.pwd = pwd;
		this.pseudonyme = pseudonyme;
	}


	public int getIdUtilisateur() {
		return idUtilisateur;
	}


	public String getPwd() {
		return pwd;
	}


	public String getPseudonyme() {
		return pseudonyme;
	}

	public ArrayList<EmpruntEnCours> getEmpruntEnCours() {
		return empruntEnCours;
	}
	
	public void setIdUtilisateur(int idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}


	public void setPwd(String pwd) {
		this.pwd = pwd;
	}


	public void setPseudonyme(String pseudonyme) {
		this.pseudonyme = pseudonyme;
	}

	


	public void setEmpruntEnCours(ArrayList<EmpruntEnCours> empruntEnCours) {
		this.empruntEnCours = empruntEnCours;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + idUtilisateur;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Utilisateur other = (Utilisateur) obj;
		if (idUtilisateur != other.idUtilisateur)
			return false;
		return true;
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "\nidUtilisateur = " + idUtilisateur + ", pseudonyme = " + pseudonyme;
	}


	public int getNbEmpruntsEnCours() {
		return empruntEnCours.size();
	}
	
	
	public void addEmpruntEnCours(EmpruntEnCours e) throws BiblioException{
		
		
		ArrayList<EmpruntEnCours> emprunts = getEmpruntEnCours();
		if ( emprunts == null){
			emprunts = new ArrayList<EmpruntEnCours>();
			emprunts.add(e);
			setEmpruntEnCours(emprunts);
		} else {
			emprunts.add(e);
		}

	}
	
	
	
	
	
}
