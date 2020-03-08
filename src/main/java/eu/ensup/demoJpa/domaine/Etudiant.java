package eu.ensup.demoJpa.domaine;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Etudiant {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String nom;
	private String prenom;
	private String mail;
	private String adresse;
	private String telephone;
	private String dateNaiss;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Responsable responsable;
	
	@ManyToMany(cascade = CascadeType.ALL)
	private Collection<Cour>cour;
	
	public Etudiant() {
		super();
	}

	
	
	


	public Etudiant(int id, String nom, String prenom, String mail, String adresse, String telephone,
			String dateNaiss) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.mail = mail;
		this.adresse = adresse;
		this.telephone = telephone;
		this.dateNaiss = dateNaiss;
	}






	public Etudiant( String nom, String prenom, String mail, String adresse, String telephone,
			String dateNaiss) {
		super();
		
		this.nom = nom;
		this.prenom = prenom;
		this.mail = mail;
		this.adresse = adresse;
		this.telephone = telephone;
		this.dateNaiss = dateNaiss;
	}






	public Etudiant(int id, String nom, String prenom, String mail, String adresse, String telephone, String dateNaiss,
			Responsable responsable, Collection<Cour> cour) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.mail = mail;
		this.adresse = adresse;
		this.telephone = telephone;
		this.dateNaiss = dateNaiss;
		this.responsable = responsable;
		this.cour = cour;
	}


	public Collection<Cour> getCour() {
		return cour;
	}



	public void setCour(Collection<Cour> cour) {
		this.cour = cour;
	}






	public Responsable getResponsable() {
		return responsable;
	}
	public void setResponsable(Responsable responsable) {
		this.responsable = responsable;
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


	@Override
	public String toString() {
		return "Etudiant [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", mail=" + mail + ", adresse=" + adresse
				+ ", telephone=" + telephone + ", dateNaiss=" + dateNaiss + ", responsable=" + responsable + ", cour="
				+ cour + "]";
	}

	
	
}
