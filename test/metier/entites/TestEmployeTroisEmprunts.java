package metier.entites;

import metier.dao.ExemplairesDao;
import metier.dao.UtilisateursDao;

public class TestEmployeTroisEmprunts {

	public static void main(String[] args) {
		/**
		 * Scenario de test d'emprunt par les employés 
		 * Il faut réaliser ici 3 emprunts 
		 */
		
		// Instanciation de la classe ExemplairesDao
		System.out.println( "\n------------------------------------------------------");
		System.out.println ("Utilisation de la classe ExemplairesDao() pour l'affichage des exemplaires");
		System.out.println();
		ExemplairesDao eDao = new ExemplairesDao();
		
		// Methode findByKey
		
		try {
			for (int i=1; i <5; i++){
				System.out.println(eDao.findByKey(i));
			}
			
			
		} catch (BiblioException e) {
			System.out.println("Exception levée :"+e.getMessage());
		}
		
		
		
		// Instanciation de la classe UtilisateursDao
		System.out.println();
		System.out.println( "\n------------------------------------------------------");
		System.out.println ("Utilisation de la classe UtilisateursDao()");
		System.out.println();
		UtilisateursDao uDao = new UtilisateursDao();
		
		try {
			System.out.println(uDao.findByKey(3));
		} catch (BiblioException e) {
			System.out.println("Exception levée :"+e.getMessage());
		}
		System.out.println();
		System.out.println( "\n------------------------------------------------------");
		System.out.println ("AJOUT D'EMPRUNT A l'ADHERENT");
		System.out.println();
		
		EmpruntEnCours ep1, ep2, ep3;
		try {
			ep1 = new EmpruntEnCours(uDao.findByKey(1), eDao.findByKey(1));
			ep2 = new EmpruntEnCours(uDao.findByKey(1), eDao.findByKey(2));
			ep3 = new EmpruntEnCours(uDao.findByKey(1), eDao.findByKey(3));
			uDao.findByKey(1).addEmpruntEnCours(ep1);
			uDao.findByKey(1).addEmpruntEnCours(ep2);
			uDao.findByKey(1).addEmpruntEnCours(ep3);
			System.out.println(ep1);
			System.out.println(ep2);
			System.out.println(ep3);
		} catch (BiblioException e) {
			System.out.println("Exception levée :"+e.getMessage());
		}
		
		System.out.println();
		System.out.println( "\n------------------------------------------------------");
		System.out.println ("AJOUT D'un 4 EME EMPRUNT A l'EMPLOYE");
		System.out.println();
		
		EmpruntEnCours ep4, ep5;
		
		try {
			
			//System.out.println(uDao.findByKey(3).getEmpruntEnCours());
			ep4 = new EmpruntEnCours(uDao.findByKey(1), eDao.findByKey(4));
			uDao.findByKey(1).addEmpruntEnCours(ep4);
			
			//System.out.println(ep1);
			//System.out.println(ep2);
			//System.out.println(ep3);
			System.out.println(ep4);
			
		} catch (BiblioException e) {
			System.out.println("Exception levée :"+e.getMessage());
		}

	}

}
