package metier.entites;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import metier.dao.ExemplairesDao;
import metier.dao.UtilisateursDao;

public class TestEmployeEnRetard {

	public static final java.text.SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public static void main(String[] args) {

		ExemplairesDao eDao = new ExemplairesDao();

		Exemplaire ex1;
		Exemplaire ex2;
		UtilisateursDao uDao = new UtilisateursDao();
		Employe ad1;
		EmpruntEnCours ep1;
		EmpruntEnCours ep2;
		
		System.out.println();
		System.out.println("début =============== Test ajout emprunt en retard ========================================");
		
		try {
			ex1 = eDao.findByKey(1);	
			ex2 = eDao.findByKey(2);				
			

			ad1 = (Employe) uDao.findByKey(1);
			
			ep1 = new EmpruntEnCours(ad1, ex1, sdf.parse("01/03/2015"));

			ad1.addEmpruntEnCours(ep1);
			System.out.println();
			System.out.println(ep1);
			System.out.println();

		}
		
		catch(BiblioException ex) {
			
			System.out.println();
			System.out.println("\t>>>>> Bug si ce message s'affiche <<<<< ");
			System.out.println();
			
		}
		
		catch(ParseException ex) {
			System.out.println();
			System.out.println("Problème avec le format de la date de l'emprunt en cours");
			System.out.println();
		}		
		


		System.out.println("===================== Test ajout emprunt en retard ======================================== fin ");
	
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		
		
		
		System.out.println("début =============== Test tentative ajout d'un deuxième emprunt ==========================");
		
		try {
			ex2 = eDao.findByKey(2);
			ad1 = (Employe) uDao.findByKey(1);
			ep2 = new EmpruntEnCours(ad1, ex2);

			ad1.addEmpruntEnCours(ep2);
			System.out.println();
			System.out.println("\tTest validé : le nouvel emprunt est accepté");
			System.out.println();

		}
		
		catch(BiblioException ex) {
			System.out.println();
			System.out.println("Résultat attendu pour ce test : ");
			System.out.println("\t" + ex.getMessage());
			System.out.println();

			
		}
				
		


		System.out.println("===================== Test tentative ajout d'un deuxième emprunt en retard ================ fin ");
		
	}


}
