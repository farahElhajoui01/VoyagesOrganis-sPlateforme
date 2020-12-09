package com.voyageOrganise.bean;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Agence implements Serializable{
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String raisonSociale;
	private String description;
	private String photo;
	private int rating;
	@OneToMany(mappedBy = "agence")
    private List<OffreVoyage> offreVoyages;
	@OneToOne
	private Utilisateur utilisateur;
	
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}

	public String getRaisonSociale() {
		return raisonSociale;
	}

	public void setRaisonSociale(String raisonSociale) {
		this.raisonSociale = raisonSociale;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}



	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	public Agence(String raisonSociale, String description, String photo, int rating,
			Utilisateur utilisateur) {
		super();
		this.raisonSociale = raisonSociale;
		this.description = description;
		this.photo = photo;
		this.rating = rating;
		this.utilisateur = utilisateur;
	}

	public Agence() {
		super();
	}
	
	
	
	
}

