package eu.ensup.demoJpa.domaine;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Responsable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String nom;
	private String prenom;
	private String mail;
	private String adresse;
	private String telephone;
	private String dateNaiss;
	private String login;
	private String mdp;
	private boolean directeur;
	
	@OneToMany(mappedBy="responsable")
	private Collection<Etudiant>etudiant;
	
	
	
	public Responsable(String nom, String prenom, String mail, String adresse, String telephone, String dateNaiss,
			String login, String mdp, boolean directeur) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.mail = mail;
		this.adresse = adresse;
		this.telephone = telephone;
		this.dateNaiss = dateNaiss;
		this.login = login;
		this.mdp = mdp;
		this.directeur = directeur;
	}


	public Responsable(int id, String nom, String prenom, String mail, String adresse, String telephone,
			String dateNaiss, String login, String mdp, boolean directeur, Collection<Etudiant> etudiant) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.mail = mail;
		this.adresse = adresse;
		this.telephone = telephone;
		this.dateNaiss = dateNaiss;
		this.login = login;
		this.mdp = mdp;
		this.directeur = directeur;
		this.etudiant = etudiant;
	}
	
	
	public Responsable() {
		super();
	}
	
	
	public Collection<Etudiant> getEtudiant() {
		return etudiant;
	}


	public void setEtudiant(Collection<Etudiant> etudiant) {
		this.etudiant = etudiant;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getDateNaiss() {
		return dateNaiss;
	}
	public void setDateNaiss(String dateNaiss) {
		this.dateNaiss = dateNaiss;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getMdp() {
		return mdp;
	}
	public void setMdp(String mdp) {
		this.mdp = mdp;
	}
	public boolean isDirecteur() {
		return directeur;
	}
	public void setDirecteur(boolean directeur) {
		this.directeur = directeur;
	}


	@Override
	public String toString() {
		return "Responsable [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", mail=" + mail + ", adresse="
				+ adresse + ", telephone=" + telephone + ", dateNaiss=" + dateNaiss + ", login=" + login + ", mdp="
				+ mdp + ", directeur=" + directeur + ", etudiant=" + etudiant + "]";
	}
	
	
	
	
}
