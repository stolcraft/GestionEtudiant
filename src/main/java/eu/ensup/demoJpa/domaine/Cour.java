package eu.ensup.demoJpa.domaine;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Cour {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String theme;
	private int nbrheure;
	
	@ManyToMany(cascade = CascadeType.ALL)
	private Collection<Etudiant>etudiant;
	
	
	
	public Cour() {
		
	}



	public Cour(int id, String theme, int nbrheure) {
		super();
		this.id = id;
		this.theme = theme;
		this.nbrheure = nbrheure;
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
	public String getTheme() {
		return theme;
	}
	public void setTheme(String theme) {
		this.theme = theme;
	}
	public int getNbrheure() {
		return nbrheure;
	}
	public void setNbrheure(int nbrheure) {
		this.nbrheure = nbrheure;
	}



	@Override
	public String toString() {
		return "Cour [id=" + id + ", theme=" + theme + ", nbrheure=" + nbrheure + ", etudiant=" + etudiant + "]";
	}
	
	
	
	
}
