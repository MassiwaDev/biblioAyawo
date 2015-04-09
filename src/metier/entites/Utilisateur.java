package metier.entites;

import java.util.ArrayList;
import java.util.Date;

public class Utilisateur extends Personne {
	
	private int idUtilisateur;
	private String pwd;
	private String pseudonyme;
	
	public ArrayList<EmpruntEnCours> getEmpruntEnCours() {
		return empruntEnCours;
	}


	public void setEmpruntEnCours(ArrayList<EmpruntEnCours> empruntEnCours) {
		this.empruntEnCours = empruntEnCours;
	}


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


	public void setIdUtilisateur(int idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}


	public void setPwd(String pwd) {
		this.pwd = pwd;
	}


	public void setPseudonyme(String pseudonyme) {
		this.pseudonyme = pseudonyme;
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}


	public int getNbEmpruntsEnCours() {
		return empruntEnCours.size();
	}
	
	
	public void addEmpruntEnCours(EmpruntEnCours e) throws BiblioException{

		ArrayList<EmpruntEnCours> emprunts = getEmpruntEnCours();
		emprunts.add(e);

	}
	
	
	
	
	
}
