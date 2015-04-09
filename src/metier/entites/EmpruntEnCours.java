package metier.entites;

import java.util.ArrayList;
import java.util.Date;

public class EmpruntEnCours {

	private Date dateEmprunt;

	private Utilisateur emprunteur;
	
	public EmpruntEnCours(Date dateEmprunt) {
		super();
		this.dateEmprunt = dateEmprunt;
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
		return "L'exemplaire est actuellement emprunté par : "+getEmprunteur()+" depuis le : " + getDateEmprunt() + ".";
	}
	
	
	
	
	
}
