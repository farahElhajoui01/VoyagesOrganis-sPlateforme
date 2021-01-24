package com.voyageOrganise.bean;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class TypeVoyage implements Serializable{
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String libelle;
	@OneToMany(mappedBy = "typeVoyage")
	private List<OffreVoyage> offreVoyages;

	
	
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




	public List<OffreVoyage> getOffreVoyages() {
		return offreVoyages;
	}

	public void setOffreVoyages(List<OffreVoyage> offreVoyages) {
		this.offreVoyages = offreVoyages;
	}

	public TypeVoyage(String libelle) {
		super();
		this.libelle = libelle;
	}

	public TypeVoyage() {
		super();
	}
	
	
	
	
}

