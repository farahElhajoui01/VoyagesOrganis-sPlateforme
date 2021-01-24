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
public class Parcour implements Serializable{
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@ManyToOne
    private OffreVoyage offreVoyage;
	@ManyToOne
    private Ville ville;
	
	
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}

	public OffreVoyage getOffreVoyage() {
		return offreVoyage;
	}

	public void setOffreVoyage(OffreVoyage offreVoyage) {
		this.offreVoyage = offreVoyage;
	}

	public Ville getVille() {
		return ville;
	}

	public void setVille(Ville ville) {
		this.ville = ville;
	}

	
	public Parcour(OffreVoyage offreVoyage, Ville ville) {
		super();
		this.offreVoyage = offreVoyage;
		this.ville = ville;
	}

	public Parcour() {
		super();
	}

	@Override
	public String toString() {
		return "Parcour [id=" + id + ", offreVoyage=" + offreVoyage + ", ville=" + ville + "]";
	}
	
	
	
	
	
	
}

