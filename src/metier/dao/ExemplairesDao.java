package metier.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import metier.entites.BiblioException;
import metier.entites.EnumStatusExemplaire;
import metier.entites.Exemplaire;

public class ExemplairesDao {
	
	private Exemplaire [] exemplaireDB = new Exemplaire [5];
	
	
	public ExemplairesDao() {
		initListe();
	}

	private void initListe(){	
		exemplaireDB [0] = new Exemplaire(1, "Les volcans d'Asie", new Date(), EnumStatusExemplaire.DISPONIBLE, "2-86889-006-7");
		exemplaireDB [1] = new Exemplaire(2, "Le Tigre blanc", new Date(), EnumStatusExemplaire.DISPONIBLE, "2-86889-006-8");
		exemplaireDB [2] = new Exemplaire(3, "Essai sur le commerce international", new Date(), EnumStatusExemplaire.DISPONIBLE, "2-86889-006-9");
		exemplaireDB [3] = new Exemplaire(4, "Les objets connectés", new Date(), EnumStatusExemplaire.DISPONIBLE, "2-86889-006-10");
		exemplaireDB [4] = new Exemplaire(5, "Java pour les Nuls", new Date(), EnumStatusExemplaire.DISPONIBLE, "2-86889-006-10");
				
	}
	
	
	public Exemplaire findByKey(Integer id) throws BiblioException{
		for(Exemplaire e : exemplaireDB)	{
			if(e.getIdExemplaire() == id){
				return e;
			}
		}
		throw new BiblioException("Exemplaire non trouvé !");
	}
	
	public List<Exemplaire> findAll(){
		List<Exemplaire> exemplairesTrouves = new ArrayList<Exemplaire>();
		for (Exemplaire exp : exemplaireDB){
			exemplairesTrouves.add(exp);
		}
		return exemplairesTrouves;
	}

}
