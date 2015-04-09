package metier.entites;

import java.util.Date;

import metier.dao.ExemplairesDao;
import metier.dao.UtilisateursDao;

public class TestRetour {

	public static void main(String[] args) {
		
		UtilisateursDao utilisateursDao = new UtilisateursDao();
		ExemplairesDao exemplairesDao = new ExemplairesDao();
		
		//Demande de deux exemplaires par leur id aux Dao
		Exemplaire ex1 = null;
		try {
			ex1 = exemplairesDao.findByKey(1);
			//System.out.println(ex1);
		} catch (BiblioException e2) {
			System.err.println(e2.getMessage());
		}
		
		//Demande d'un adhérent par son id aux Dao
				Adherent ad1 = null;
				try {
					ad1 = (Adherent) utilisateursDao.findByKey(3);
					//System.out.println(ad1);
				} catch (BiblioException e) {
					System.err.println(e.getMessage());
				}
				
		//Création d'un emprunt en cours pour un adhérent
		EmpruntEnCours empruntEncours1 = new EmpruntEnCours(ad1, ex1, new Date());
		try {
			ad1.addEmpruntEnCours(empruntEncours1);
		} catch (BiblioException e) {
			System.err.println(e.getMessage());
		}
		
		//Rendre l'exemplaire
		ex1.setStatus(EnumStatusExemplaire.DISPONIBLE);
		ad1.getEmpruntEnCours().remove(empruntEncours1);
		EmpruntArchive empruntArchive1 = new EmpruntArchive(new Date(), empruntEncours1.getDateEmprunt());
		empruntArchive1.setEmprunteur(empruntEncours1.getEmprunteur());
		empruntArchive1.setExemplaire(empruntEncours1.getExemplaire());	
		
		//empruntEncours1 = null;
		empruntEncours1.setEmprunteur(null);
		empruntEncours1.setExemplaire(null);
		empruntEncours1 = null;
		System.out.println(empruntArchive1);
		System.out.println(empruntEncours1);
	}

}
