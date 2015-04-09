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
	
	private List <Utilisateur> listUtilisateurs = new ArrayList<Utilisateur>();
		
	public UtilisateursDao() {
		initListe();
	}

	private void initListe(){
		listUtilisateurs.add(new Employe("Durand", "Paul", new Date(), "M", 1, "paul", "paul@durand"));
		listUtilisateurs.add(new Employe("Duffour", "Pauline", new Date(), "F", 2, "pauline", "pauline@duffour"));
		listUtilisateurs.add(new Adherent("Ali", "Mohamed", new Date(), "M", 3, "mohamed", "mohamed@ali"));
		listUtilisateurs.add(new Adherent("Leroy", "Merlin", new Date(), "M", 4, "merlin", "merlin@leroy"));
		listUtilisateurs.add(new Adherent("Tessier", "Franck", new Date(), "M", 5, "franck", "franck@tessier"));
		listUtilisateurs.add(new Adherent("Toussaint", "Brice", new Date(), "M", 6, "brice", "brice@toussaint"));	
		listUtilisateurs.add(new Adherent("LaMontagne", "Collette", new Date(), "M", 7, "collette", "collette@lamontagne"));
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
	
	public List<Employe> findAllEmployes(){
		ArrayList<Employe> employes = new ArrayList<Employe>();
		
		for(Utilisateur util : listUtilisateurs){
			if(util instanceof Employe){
				employes.add((Employe) util);
			}
		}
		return employes;
		
	}
	
	public List<Adherent> findAllAdherents(){
		ArrayList<Adherent> adherents = new ArrayList<Adherent>();
		
		for(Utilisateur util : listUtilisateurs){
			if(util instanceof Adherent){
				adherents.add((Adherent) util);
			}
		}
		return adherents;
		
	}
	
	public void insert(Utilisateur util){
		listUtilisateurs.add(util);
	}

	public int getIndexOflist(){
		return listUtilisateurs.size();
	}
	
	public int getNext(){
		return getIndexOflist() + 1;
	}
	
}
