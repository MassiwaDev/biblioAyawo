package metier.entites;

import java.util.Date;

public class EmpruntArchive {
	private Date dateRestitutionEff;
	private Date dateEmprunt;
	
	private Exemplaire exemplaire;
	private Utilisateur emprunteur;
	
	
	
	public EmpruntArchive(Date dateRestitutionEff, Date dateEmprunt) {
		super();
		this.dateRestitutionEff = dateRestitutionEff;
		this.dateEmprunt = dateEmprunt;
	}



	public Date getDateRestitutionEff() {
		return dateRestitutionEff;
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



	public void setDateRestitutionEff(Date dateRestitutionEff) {
		this.dateRestitutionEff = dateRestitutionEff;
	}



	public void setDateEmprunt(Date dateEmprunt) {
		this.dateEmprunt = dateEmprunt;
	}



	public void setExemplaire(Exemplaire exemplaire) {
		this.exemplaire = exemplaire;
	}



	public void setEmprunteur(Utilisateur emprunteur) {
		this.emprunteur = emprunteur;
	}



	@Override
	public String toString() {
		return "Emprunts Archivés : "
				+ "L'Utilisateur " + getEmprunteur() +" a emprunté l'exemplaire : "+ getExemplaire()+", le : " +getDateEmprunt() +". Il l'a restitué le : "
				+ getDateRestitutionEff() + ",";
	}
	
	
	
	
	
	
}
