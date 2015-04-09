package metier.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import metier.entites.Adherent;
import metier.entites.BiblioException;
import metier.entites.Employe;
import metier.entites.Exemplaire;
import metier.entites.Utilisateur;

public class UtilisateursDao {
	
	//private List <Utilisateur> listUtilisateurs = new ArrayList<Utilisateur>();
	private Utilisateur [] utilisateurDB = new Utilisateur [7];
		
	public UtilisateursDao() {
		initListe();
	}

	private void initListe(){

		utilisateurDB[0] = new Employe("Durand", "Paul", new Date(), "M", 1, "paul", "paul@durand");		
		utilisateurDB[1] = new Employe("Duffour", "Pauline", new Date(), "F", 2, "pauline", "pauline@duffour");
		utilisateurDB[2] = new Adherent("Ali", "Mohamed", new Date(), "M", 3, "mohamed", "mohamed@ali", "0611224455");
		utilisateurDB[3] = new Adherent("Leroy", "Merlin", new Date(), "M", 4, "merlin", "merlin@leroy", "0611224455");
		utilisateurDB[4] = new Adherent("Tessier", "Franck", new Date(), "M", 5, "franck", "franck@tessier", "0611224455");
		utilisateurDB[5] = new Adherent("Toussaint", "Brice", new Date(), "M", 6, "brice", "brice@toussaint", "0611224455");	
		utilisateurDB[6] = new Adherent("LaMontagne", "Collette", new Date(), "F", 7, "collette", "collette@lamontagne", "0611224455");
	}
	
	public Utilisateur findByKey(Integer id) throws BiblioException{
		for(Utilisateur u : utilisateurDB)	{
			if(u.getIdUtilisateur() == id){
				return u;
			}
		}
		throw new BiblioException("Utilisateur non trouvé !");
	}
	
	//---Liste de tous les utilisateurs enregistrés ----
	public List<Utilisateur> findAll(){
		List<Utilisateur> utilisateursTrouves = new ArrayList<Utilisateur>();
		
		for(Utilisateur u : utilisateurDB){
			utilisateursTrouves.add(u);
		}
		return utilisateursTrouves;
	}
	

	
}
