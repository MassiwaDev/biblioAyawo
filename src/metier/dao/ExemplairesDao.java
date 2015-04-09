package metier.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import metier.entites.BiblioException;
import metier.entites.EnumStatusExemplaire;
import metier.entites.Exemplaire;

public class ExemplairesDao {
	
	private List <Exemplaire> listExemplaires = new ArrayList<Exemplaire>();
	
	
	public ExemplairesDao() {
		initListe();
	}

	private void initListe(){	
		listExemplaires.add(new Exemplaire(1, "Les volcans d'Asie", new Date(), EnumStatusExemplaire.DISPONIBLE, "2-86889-006-7"));
		listExemplaires.add(new Exemplaire(2, "Le Tigre blanc", new Date(), EnumStatusExemplaire.DISPONIBLE, "2-86889-006-8"));
		listExemplaires.add(new Exemplaire(3, "Essai sur le commerce international", new Date(), EnumStatusExemplaire.DISPONIBLE, "2-86889-006-9"));
		listExemplaires.add(new Exemplaire(4, "Les objets connectés", new Date(), EnumStatusExemplaire.DISPONIBLE, "2-86889-006-10"));
		listExemplaires.add(new Exemplaire(5, "Java pour les Nuls", new Date(), EnumStatusExemplaire.DISPONIBLE, "2-86889-006-10"));
				
	}
	
	public int getIndexOflist(){
		return listExemplaires.size();
	}
	
	public int getNext(){
		return getIndexOflist() + 1;
	}
	
	public void insert(Exemplaire ex){
		listExemplaires.add(ex);
	}
	
	public Exemplaire findByKey(Integer id) throws BiblioException{
		for(Exemplaire e : listExemplaires)	{
			if(e.getIdExemplaire() == id){
				return e;
			}
		}
		throw new BiblioException("Exemplaire non trouvé !");
	}
	
	public List<Exemplaire> findAll(){
		return listExemplaires;
	}

}
