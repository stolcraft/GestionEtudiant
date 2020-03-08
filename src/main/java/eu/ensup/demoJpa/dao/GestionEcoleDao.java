package eu.ensup.demoJpa.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import eu.ensup.demoJpa.domaine.Etudiant;
import eu.ensup.demoJpa.domaine.Formation;
import eu.ensup.demoJpa.domaine.Lieu;
import eu.ensup.demoJpa.domaine.Responsable;

public class GestionEcoleDao extends AccesBd {

	
	

	public void insertion() {
		// TODO Auto-generated method stub
		seConnecter();
		// 1 : Ouverture unit� de travail JPA
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("demojpa-pu");
		EntityManager em = emf.createEntityManager();

		// 2 : Ouverture transaction
		EntityTransaction tx = em.getTransaction();
		tx.begin();

		// 3 : Instanciation Objet m�tier
		/*
		 * Lieu lieu = new Lieu("Objis","2 rue colonell driant"); Formation formation =
		 * new Formation("JPA", lieu);
		 */

		Responsable responsable = new Responsable("david", "touchard", "jacque.pierre@gmail.com", "2 rue colonel driant", "0642791847", "01/02/95", "root","root", false);
		
		Etudiant etudiant = new Etudiant("jacque", "piere", "jacque.pierre@gmail.com", "2 rue colonel driant", "0642791847", "01/02/95");
		Etudiant etudiant2 = new Etudiant("maxime", "demenere", "jacque.pierre@gmail.com", "2 rue colonel driant", "0642791847", "01/02/95");
		Etudiant etudiant3 = new Etudiant("antoine", "duchan", "jacque.pierre@gmail.com", "2 rue colonel driant", "0642791847", "01/02/95");

		/* Lieu lieux = em.getReference(Lieu.class, 1); */
		/*
		 * Formation formation = em.getReference(Formation.class, 2); Lieu lieu =
		 * formation.getLieu();
		 */

		/* System.out.println("toues le lieux : " + lieux); */

		// 4 : Persistance Objet/Relationnel : cr�ation d'un enregistrement en base
		em.persist(etudiant);
		em.persist(etudiant2);
		em.persist(etudiant3);
		em.persist(responsable);
		// 5 : Fermeture transaction
		tx.commit();

		// 6 : Fermeture unit� de travail JPA
		em.close();
		emf.close();

		System.out.println("la base est fini d'etre crée");
		seDeconnecter();

	}
	
	public boolean creationEtudiant() {
		return true;
	}
	
	public boolean supprimerEtudiant(int id) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("demojpa-pu");
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction tx = em.getTransaction();
		try {
			// 1 débuter la transaction
			tx.begin();
			// 2 Effectuer l'opération
			em.remove(em.getReference(Etudiant.class, id));
			// 3 valider la transaction
			tx.commit();
			// 4 fermet l'unité de persistence
			em.close();
			emf.close();
			return true;
		} catch (Exception e) {
			System.err.println(e.getMessage());
			tx.rollback();
			return false;
		}
		
		
	}
	
	public boolean modifierEtudiant() {
		return true;
	}
	
	public ArrayList<Etudiant> listerEtudiants() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("demojpa-pu");
		EntityManager em = emf.createEntityManager();
		List<Etudiant> etu = new ArrayList();
		Query req = em.createQuery("select etu from Etudiant etu");
		etu = req.getResultList();
		return (ArrayList<Etudiant>) etu;
	}
	
	public boolean connection(String login, String mdp) {
		
		seConnecter();
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("demojpa-pu");
		EntityManager em = emf.createEntityManager();
		
		// 2 : Ouverture transaction
				EntityTransaction tx = em.getTransaction();
				tx.begin();
		
		Query req = em
				.createQuery("select c from Responsable c where login ='"+login+"' and mdp ='"+mdp+"'");
		List responsable;
		responsable = req.getResultList();
		System.out.println("resultt : " + responsable);
		seDeconnecter();
		return true;
		
	}

	public boolean ajouterEtudiant(Etudiant etudiant) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("demojpa-pu");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		try {
			// 1 débuter la transaction
			tx.begin();
			// 2 Effectuer l'opération
			em.persist(etudiant);
			// 3 valider la transaction
			tx.commit();
			// 4 fermet l'unité de persistence
			em.close();
			emf.close();
			return true;
		} catch (Exception e) {
			System.err.println(e.getMessage());
			tx.rollback();
			return false;
		}
	}

	public boolean modifierEtudiant(Etudiant etudiant) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("demojpa-pu");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		try {
			// 1 débuter la transaction
			tx.begin();
			// 2 Effectuer l'opération
			em.merge(etudiant);
			// 3 valider la transaction
			tx.commit();
			// 4 fermet l'unité de persistence
			em.close();
			emf.close();
			return true;
		} catch (Exception e) {
			System.err.println(e.getMessage());
			tx.rollback();
			return false;
		}
	}
	

}
