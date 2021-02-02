package com.voyageOrganise.bean;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Commentaire implements Serializable{
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String libelle;
	@ManyToOne
    private Voyageur voyageur;
	@ManyToOne
    private OffreVoyage offreVoyage;
	
	
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public Voyageur getVoyageur() {
		return voyageur;
	}

	public void setVoyageur(Voyageur voyageur) {
		this.voyageur = voyageur;
	}

	

	public OffreVoyage getOffreVoyage() {
		return offreVoyage;
	}

	public void setOffreVoyage(OffreVoyage offreVoyage) {
		this.offreVoyage = offreVoyage;
	}

	public Commentaire(String libelle, Voyageur voyageur, OffreVoyage offreVoyage) {
		super();
		this.libelle = libelle;
		this.voyageur = voyageur;
		this.offreVoyage = offreVoyage;
	}

	public Commentaire() {
		super();
	}

	@Override
	public String toString() {
		return "Commentaire [id=" + id + ", libelle=" + libelle + ", voyageur=" + voyageur + ", offreVoyage="
				+ offreVoyage + "]";
	}
	
	
	
	
	
}

