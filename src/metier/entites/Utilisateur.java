package metier.entites;

import java.util.ArrayList;

public class Utilisateur extends Personne {
	
	private int idUtilisateur;
	private String pwd;
	private String pseudonyme;
	
	private ArrayList <EmpruntEnCours> lesEmprunts;
	
	
	public Utilisateur(int idUtilisateur, String pwd, String pseudonyme) {
		super();
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
		return lesEmprunts.size();
	}
	
	
	
	
	
}
