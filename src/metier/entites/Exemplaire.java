package metier.entites;

import java.util.Date;

public class Exemplaire {
	private int idExemplaire;
	private String titre;
	private Date dateAchat;
	private EnumStatusExemplaire status;
	private String isbn;
	
	
	private EmpruntEnCours empruntEnCours;





	public Exemplaire(int idExemplaire, String titre, Date dateAchat,
			EnumStatusExemplaire status, String isbn) {
		super();
		this.idExemplaire = idExemplaire;
		this.titre = titre;
		this.dateAchat = dateAchat;
		this.status = status;
		this.isbn = isbn;
	}


	public String getTitre() {
		return titre;
	}


	public void setTitre(String titre) {
		this.titre = titre;
	}


	public int getIdExemplaire() {
		return idExemplaire;
	}


	public Date getDateAchat() {
		return dateAchat;
	}


	public EnumStatusExemplaire getStatus() {
		return status;
	}


	public String getIsbn() {
		return isbn;
	}


	public void setIdExemplaire(int idExemplaire) {
		this.idExemplaire = idExemplaire;
	}


	public void setDateAchat(Date dateAchat) {
		this.dateAchat = dateAchat;
	}


	public void setStatus(EnumStatusExemplaire status) {
		this.status = status;
	}


	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}


	public EmpruntEnCours getEmpruntEnCours() {
		return empruntEnCours;
	}


	public void setEmpruntEnCours(EmpruntEnCours empruntEnCours) {
		this.empruntEnCours = empruntEnCours;
	}


	@Override
	public String toString() {
		return "Il s'agit de l'exemplaire : "+getTitre()+", idExemplaire :" + getIdExemplaire() + ", sa date d'achat est :"
				+ getDateAchat() + " son statut est : " + getStatus() + ", son isbn est :" + getIsbn()
				+ ". Il est actuellement : " + getEmpruntEnCours() + ".";
	}
	
	
	
	
	
}
