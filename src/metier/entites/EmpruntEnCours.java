package metier.entites;

import java.util.ArrayList;
import java.util.Date;

public class EmpruntEnCours {

	private Date dateEmprunt;

	private Utilisateur emprunteur;
	private Exemplaire exemplaire;
	
	
	
	
	public EmpruntEnCours(Utilisateur user, Exemplaire e, Date dateEmprunt ){
		this.emprunteur = user;
		this.setExemplaire(e);
		this.dateEmprunt = dateEmprunt;
	}
	public EmpruntEnCours(Utilisateur user, Exemplaire e){
		this(user, e, new Date());
		setExemplaire(e);
		
	}
	
	public Date getDateEmprunt() {
		return dateEmprunt;
	}

	public Exemplaire getExemplaire() {
		return exemplaire;
	}
	
	public Utilisateur getEmprunteur() {
		return emprunteur;
	}

	public void setExemplaire(Exemplaire exemplaire) {
		this.exemplaire = exemplaire;
		exemplaire.setStatus(EnumStatusExemplaire.PRETE);
	}
	
	
	
	public void setDateEmprunt(Date dateEmprunt) {
		this.dateEmprunt = dateEmprunt;
	}
	
	public void setEmprunteur(Utilisateur emprunteur) {
		this.emprunteur = emprunteur;
	}

	
	
	
	@Override
	public String toString() {
		return getExemplaire()+" IL est actuellement emprunté par : "+emprunteur.getPrenom()+" "+emprunteur.getNom().toUpperCase()+" depuis le : " + getDateEmprunt() + ".";
	}
	
	
	
	
	
}
