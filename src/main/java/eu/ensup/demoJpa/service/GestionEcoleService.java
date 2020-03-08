package eu.ensup.demoJpa.service;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import eu.ensup.demoJpa.dao.GestionEcoleDao;
import eu.ensup.demoJpa.domaine.Etudiant;

public class GestionEcoleService {

	GestionEcoleDao ged = new GestionEcoleDao();
	
	public boolean connection (String login, String mdp) {
		boolean result = ged.connection(login, mdp);
		return result;
	}
	
	
	public ArrayList<Etudiant> listerEtudiants() {
		
		ArrayList<Etudiant> etu = new ArrayList();
		etu = ged.listerEtudiants();
		return etu;
	}
	
	public boolean supprimerEtudiant (int id) {
		boolean result = ged.supprimerEtudiant(id);
		return result;
		
	}
	
	public boolean ajouterEtudiant(Etudiant etudiant) {
		boolean result = ged.ajouterEtudiant(etudiant);
		return result;
	}
	
	public boolean modifierEtudiant(Etudiant etudiant) {
		boolean result = ged.modifierEtudiant(etudiant);
		return result;
	}
}
