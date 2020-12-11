package com.voyageOrganise.bean;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class OffreVoyage implements Serializable{
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String description;
	private String programme;
	private int rating;
	private Date dateCreation;
	private double tarifBase;
	private String titre;
	private String photo;
	@OneToMany(mappedBy = "offreVoyage")
    private List<Choix> choix;
	@ManyToOne
    private Agence agence;
	@ManyToOne
    private TypeVoyage typeVoyage;
	@OneToMany(mappedBy = "offreVoyage")
    private List<Commentaire> commentaires;
	@OneToMany(mappedBy = "offreVoyage")
    private List<Parcour> destinations;
	@OneToMany(mappedBy = "offreVoyage")
    private List<Extra> extras;
	
	
	
	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getProgramme() {
		return programme;
	}

	public void setProgramme(String programme) {
		this.programme = programme;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}



	public Agence getAgence() {
		return agence;
	}

	public void setAgence(Agence agence) {
		this.agence = agence;
	}

	public TypeVoyage getTypeVoyage() {
		return typeVoyage;
	}

	public void setTypeVoyage(TypeVoyage typeVoyage) {
		this.typeVoyage = typeVoyage;
	}

	
    
	
	public double getTarifBase() {
		return tarifBase;
	}

	public void setTarifBase(double tarifTotal) {
		this.tarifBase = tarifTotal;
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	public OffreVoyage() {
		super();
	}

	
	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	
	public OffreVoyage(String description, String programme, int rating, Date dateCreation, double tarifBase,
			String titre, String photo, List<Choix> choix, Agence agence, TypeVoyage typeVoyage,
			List<Commentaire> commentaires, List<Parcour> destinations, List<Extra> extras) {
		super();
		this.description = description;
		this.programme = programme;
		this.rating = rating;
		this.dateCreation = dateCreation;
		this.tarifBase = tarifBase;
		this.titre = titre;
		this.photo = photo;
		this.choix = choix;
		this.agence = agence;
		this.typeVoyage = typeVoyage;
		this.commentaires = commentaires;
		this.destinations = destinations;
		this.extras = extras;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	
	
	
	
	
	
}

