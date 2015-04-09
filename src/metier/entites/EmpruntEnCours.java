package metier.entites;

import java.util.ArrayList;
import java.util.Date;

public class EmpruntEnCours {

	private Date dateEmprunt;

	private Utilisateur emprunteur;
	private Exemplaire exemplaire;
	
	
	public Exemplaire getExemplaire() {
		return exemplaire;
	}

	public void setExemplaire(Exemplaire exemplaire) {
		this.exemplaire = exemplaire;
	}
	
	public EmpruntEnCours(Utilisateur user, Exemplaire e, Date dateEmprunt ){
		this.emprunteur = user;
		this.exemplaire = e;
		this.dateEmprunt = dateEmprunt;
	}
	public EmpruntEnCours(Utilisateur user, Exemplaire e){
		this(user, e, new Date());
		
		
	}
	
	public Date getDateEmprunt() {
		return dateEmprunt;
	}

	public void setDateEmprunt(Date dateEmprunt) {
		this.dateEmprunt = dateEmprunt;
	}
	
	
	public Utilisateur getEmprunteur() {
		return emprunteur;
	}

	public void setEmprunteur(Utilisateur emprunteur) {
		this.emprunteur = emprunteur;
	}

	@Override
	public String toString() {
		return "L'exemplaire : "+getExemplaire()+" est actuellement emprunté par : "+getEmprunteur()+" depuis le : " + getDateEmprunt() + ".";
	}
	
	
	
	
	
}
