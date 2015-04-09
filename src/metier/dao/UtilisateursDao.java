package metier.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import metier.entites.BiblioException;
import metier.entites.Exemplaire;
import metier.entites.Utilisateur;

public class UtilisateursDao {
	
	private List <Utilisateur> listUtilisateurs = new ArrayList<Utilisateur>();
		
	public UtilisateursDao() {
		initListe();
	}

	private void initListe(){
		listUtilisateurs.add(new Utilisateur("Durand", "Paul", new Date(), "M", 1, "paul", "paul@durand"));
		listUtilisateurs.add(new Utilisateur("Duffour", "Pauline", new Date(), "F", 2, "pauline", "pauline@duffour"));
		listUtilisateurs.add(new Utilisateur("Ali", "Mohamed", new Date(), "M", 3, "mohamed", "mohamed@ali"));
		listUtilisateurs.add(new Utilisateur("Leroy", "Merlin", new Date(), "M", 4, "merlin", "merlin@leroy"));
		listUtilisateurs.add(new Utilisateur("Tessier", "Franck", new Date(), "M", 5, "franck", "franck@tessier"));		
	}
	
	public Utilisateur findByKey(Integer id) throws BiblioException{
		for(Utilisateur u : listUtilisateurs)	{
			if(u.getIdUtilisateur() == id){
				return u;
			}
		}
		throw new BiblioException("Utilisateur non trouvé !");
	}
	
	public List<Utilisateur> findAll(){
		return listUtilisateurs;
	}
	
	public void insert(Utilisateur util){
		listUtilisateurs.add(util);
	}

	public int getIndexOflist(){
		return listUtilisateurs.size();
	}
}
