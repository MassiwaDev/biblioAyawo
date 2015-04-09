package metier.dao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import metier.entites.BiblioException;
import metier.entites.EnumStatusExemplaire;
import metier.entites.Exemplaire;

public class ExemplairesDao {
	
	private Exemplaire [] exemplaireDB = new Exemplaire [5];
	public static final java.text.SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	
	public ExemplairesDao() {
		initListe();
	}

	private void initListe(){	
		try {
			exemplaireDB [0] = new Exemplaire(1, "Les volcans d'Asie", sdf.parse("12/12/2010"), EnumStatusExemplaire.DISPONIBLE, "2-86889-006-7");
			exemplaireDB [1] = new Exemplaire(2, "Le Tigre blanc", sdf.parse("06/05/2009"), EnumStatusExemplaire.DISPONIBLE, "2-86889-006-8");
			exemplaireDB [2] = new Exemplaire(3, "Essai sur le commerce international", sdf.parse("20/06/2001"), EnumStatusExemplaire.DISPONIBLE, "2-86889-006-9");
			exemplaireDB [3] = new Exemplaire(4, "Les objets connectés", sdf.parse("05/02/2014"), EnumStatusExemplaire.DISPONIBLE, "2-86889-006-10");
			exemplaireDB [4] = new Exemplaire(5, "Java pour les Nuls", sdf.parse("13/08/2006"), EnumStatusExemplaire.DISPONIBLE, "2-86889-006-10");
		} catch (ParseException e) {
			System.err.println(e.getMessage());
		}
		
				
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
