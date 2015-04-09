package metier.dao;

import java.util.Date;

import metier.entites.Adherent;
import metier.entites.BiblioException;
import metier.entites.Employe;
import metier.entites.EmpruntEnCours;
import metier.entites.Exemplaire;

public class TestDeBase {

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
		
		Exemplaire ex2 = null;
		try {
			ex2 = exemplairesDao.findByKey(2);
		//	System.out.println(ex2);
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
		
		//Demande d'un employé par son id aux Dao
		Employe emp1 = null;		
		try {
			emp1 = (Employe) utilisateursDao.findByKey(1);
			//System.out.println(emp1);
		} catch (BiblioException e) {
			System.err.println(e.getMessage());
		}
		
		//Création d'un emprunt en cours pour un adhérent
		EmpruntEnCours emprunt1 = new EmpruntEnCours(ad1, ex1, new Date());
		try {
			ad1.addEmpruntEnCours(emprunt1);
		} catch (BiblioException e) {
			System.err.println(e.getMessage());
		}
		
		//Création d'un emprunt en cours pour un employé
		EmpruntEnCours emprunt2 = new EmpruntEnCours(emp1, ex2, new Date());
		try {
			emp1.addEmpruntEnCours(emprunt2);
		} catch (BiblioException e) {
			System.err.println(e.getMessage());
		}
		System.out.println(emprunt1);
		System.out.println(emprunt2);

	}

}
