package metier.entites;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;



public class Adherent extends Utilisateur {

	private String telephone;
	private static int nbMaxPret = 3;
	private static int dureeMaxPret = 15;
	
	
	public Adherent(String nom, String prenom, Date dateNaissance, String sexe, int idUtilisateur, String pwd, String pseudonyme) {
		super(nom, prenom, dateNaissance, sexe, idUtilisateur, pwd, pseudonyme);
		
	}

	public Adherent(String nom, String prenom, Date dateNaissance, String sexe, int idUtilisateur, String pwd, String pseudonyme,
			String telephone) {
		super(nom, prenom, dateNaissance, sexe, idUtilisateur, pwd, pseudonyme);
		this.telephone = telephone;
	}

	public boolean isPretEnRetard(EmpruntEnCours emprunt){
		
		boolean isPretEnRetard = false;
		
		Date dateEmprunt = emprunt.getDateEmprunt();
		
		GregorianCalendar dateGC  = new  GregorianCalendar();
		dateGC.setTime(new Date());
		
		dateGC.add(Calendar.DAY_OF_YEAR, -dureeMaxPret); 
		
		Date dateMinSansretard = dateGC.getTime();
		if (dateMinSansretard.after(dateEmprunt)){
			
			isPretEnRetard = true;
		}
		
		return isPretEnRetard; 
	}
	
	public boolean isConditionsPretAcceptees(){
		
		ArrayList<EmpruntEnCours> emprunts = getEmpruntEnCours();

		/* Règle de gestion nombre de prêts < 3 */

		boolean isNbPretseq3 = false;
		
		if (emprunts.size() == 3) {
			isNbPretseq3= true;
		}
		/* Règle de gestion prêt en retard */
		
		int nbPretsEnRetard = getNbRetards();

		return (!isNbPretseq3 & (nbPretsEnRetard==0));
	}
	
	public int getNbRetards(){

		int nb = 0;
		ArrayList<EmpruntEnCours> emprunts = getEmpruntEnCours();

		for (EmpruntEnCours emprunt : emprunts){
				Exemplaire exemplaire = emprunt.getExemplaire();
				if (isPretEnRetard(emprunt))
					nb += 1;

		}
		return nb;
	}
	
@Override
	public String toString() {
		return super.toString() + " Adherent [telephone=" + telephone + "]";
	}

@Override
public void addEmpruntEnCours(EmpruntEnCours e) throws BiblioException {
	if (isConditionsPretAcceptees()) {
		super.addEmpruntEnCours(e);		
		} 
	else
		{
		  if (getNbRetards() > 0){
			  throw new BiblioException("Emprunt refusé au motif que l'adhérent a dépassé la date limite pour la restitution d'au moins un livre");
			  
		  } else {
				ArrayList<EmpruntEnCours> emprunts = getEmpruntEnCours();
				if (emprunts.size() == 3) {
					throw new BiblioException("Emprunt refusé au motif que l'adhérent a emprunté le maximum de livres autorisés (3)");
				}
		  }
		  
		  
		}

}
	
}

