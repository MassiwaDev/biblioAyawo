package metier.dao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
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
	public static final java.text.SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
	public UtilisateursDao() {
		initListe();
	}

	private void initListe(){

		try {
			utilisateurDB[0] = new Employe("Durand", "Paul", sdf.parse("02/02/80"), "M", 1, "paul", "paul@durand");
			utilisateurDB[1] = new Employe("Duffour", "Pauline", sdf.parse("06/0/85"), "F", 2, "pauline", "pauline@duffour");
			utilisateurDB[2] = new Adherent("Ali", "Mohamed", sdf.parse("11/12/90"), "M", 3, "mohamed", "mohamed@ali", "0611224455");
			utilisateurDB[3] = new Adherent("Leroy", "Merlin", sdf.parse("12/03/78"), "M", 4, "merlin", "merlin@leroy", "0612224456");
			utilisateurDB[4] = new Adherent("Tessier", "Franck", sdf.parse("23/04/89"), "M", 5, "franck", "franck@tessier", "0666224455");
			utilisateurDB[5] = new Adherent("Toussaint", "Brice", sdf.parse("08/08/83"), "M", 6, "brice", "brice@toussaint", "0645224455");	
			utilisateurDB[6] = new Adherent("LaMontagne", "Collette", sdf.parse("14/07/91"), "F", 7, "collette", "collette@lamontagne", "0679224455");
		} catch (ParseException e) {
			System.err.println(e.getMessage());
		}		
		
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
